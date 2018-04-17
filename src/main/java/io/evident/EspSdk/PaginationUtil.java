/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.evident.EspSdk;

import io.evident.models.PaginatedCollection;
import java.io.IOException;

import java.net.URLDecoder;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.naming.ConfigurationException;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 *
 * @author shaun
 */
public class PaginationUtil implements Cloneable {

    private interface FetchPageApi {
        @GET
        public Call<PaginatedCollection> fetchPage(@Url String url);
    }

    public static String formatPageRequest(int objectsPerPage, int pageNumber) {
        String formattedRequest = "{number=" + pageNumber + ",size=" + objectsPerPage;
        return formattedRequest;
    }

    private static final String PAGE_NUMBER_FORMAT = "page\\[number\\]=(\\d*)";
    private static final String PAGE_SIZE_FORMAT = "page\\[size\\]=(\\d*)";
    private static final String URL_ENCODING = "UTF-8";
    private static ApiClient defaultApiClient = null;

    private PaginatedCollection paginatedCollection;
    private ApiClient apiClient = null;
    private FetchPageApi pageApi = null;
    private String firstPageLink = null;
    private Integer prevPageNumber = null;
    private String prevPageLink = null;
    private Integer currentPageNumber = null;
    private String currentPageLink = null;
    private Integer nextPageNumber = null;
    private String nextPageLink = null;
    private Integer lastPageNumber = null;
    private String lastPageLink = null;
    private int numObjectsPerPage;
    private int numObjectsCurrentPage;
    private int numAllObjects = 0;

    public PaginationUtil(Response<PaginatedCollection> pcResponse) throws ConfigurationException {
        this(pcResponse.body());
    }

    public PaginationUtil(PaginatedCollection pc) throws ConfigurationException {
        this(pc, defaultApiClient);
    }

    public PaginationUtil(Response<PaginatedCollection> pcResponse, ApiClient ac) throws ConfigurationException {
        this(pcResponse.body(), ac);
    }

    public PaginationUtil(PaginatedCollection pc, ApiClient ac) throws ConfigurationException {
        if (ac == null) {
            throw new ConfigurationException("Attempting to instantiate a PaginationUtil object with null ApiClient. Pass a valid client to the constructor or set a static default client via the setDefaultApiClient() method.");
        }
        paginatedCollection = pc;
        apiClient = ac;
        if (defaultApiClient == null) {
            setDefaultApiClient(apiClient);
        }
        pageApi = apiClient.createService(FetchPageApi.class);
        determinePageParameters();
    }

    public static void setDefaultApiClient(ApiClient apiClient) {
        defaultApiClient = apiClient;
    }

    public Integer getPrevPageNumber() {
        return prevPageNumber;
    }

    public Integer getCurrentPageNumber() {
        return currentPageNumber;
    }

    public Integer getNextPageNumber() {
        return nextPageNumber;
    }

    public Integer getLastPageNumber() {
        return lastPageNumber;
    }

    public int getNumItemsOnPage() {
        return numObjectsCurrentPage;
    }

    public int getNumAllItems() throws IOException, ConfigurationException {
        if (numAllObjects == 0) {
            if (lastPageLink != null) {
                int numItemsOnLastPage = fetchLastPage().getNumItemsOnPage();
                numAllObjects = (numObjectsPerPage * (lastPageNumber - 1)) + numItemsOnLastPage;
            } else {
                numAllObjects = numObjectsCurrentPage;
            }
        }
        return numAllObjects;
    }

    public PaginationUtil fetchFirstPage() throws IOException, ConfigurationException {
        PaginationUtil retVal = null;
        if (currentPageNumber.equals(1)) {
            retVal = returnCopy();
        } else {
            PaginatedCollection pc = fetchPage(firstPageLink);
            retVal = new PaginationUtil(pc, apiClient);
        }
        return retVal;
    }

    public PaginationUtil fetchPreviousPage() throws IOException, ConfigurationException {
        PaginatedCollection pc = fetchPage(prevPageLink);
        return new PaginationUtil(pc, apiClient);
    }

    public PaginationUtil fetchNextPage() throws IOException, ConfigurationException {
        PaginatedCollection pc = fetchPage(nextPageLink);
        return new PaginationUtil(pc, apiClient);
    }

    public PaginationUtil fetchLastPage() throws IOException, ConfigurationException {
        PaginationUtil retVal = null;
        if (lastPageNumber == null) {
            // assume on last page if link not present
            retVal = returnCopy();
        } else {
            PaginatedCollection pc = fetchPage(lastPageLink);
            retVal = new PaginationUtil(pc, apiClient);
        }
        return retVal;
    }

    public PaginationUtil fetchPage(int page) throws IOException, ConfigurationException {
        PaginationUtil retVal = null;
        if (currentPageNumber.equals(page)) {
            retVal = returnCopy();
        } else {
            String link = createLinkForPage(page);
            PaginatedCollection pc = fetchPage(link);
            retVal = new PaginationUtil(pc, apiClient);
        }
        return retVal;
    }

    public boolean gotoFirstPage() throws IOException {
        return (currentPageNumber.equals(1)) ? true : gotoPage(firstPageLink);
    }

    public boolean gotoPreviousPage() throws IOException {
        return gotoPage(prevPageLink);
    }

    public boolean gotoNextPage() throws IOException {
        return gotoPage(nextPageLink);
    }

    public boolean gotoLastPage() throws IOException {
        return (lastPageNumber == null) ? true : gotoPage(lastPageLink);
    }

    public boolean gotoPage(int page) throws IOException {
        boolean retVal = false;
        if (currentPageNumber.equals(page)) {
            retVal = true;
        } else {
            String link = createLinkForPage(page);
            retVal = gotoPage(link);
        }
        return retVal;
    }

    public PaginatedCollection fetchPage(String url) throws RuntimeException,IOException {
        PaginatedCollection retVal = null;
        if (url == null) {
            throw new RuntimeException("No URL supplied to fetch page.");
        }
        if (pageApi == null) {
            throw new RuntimeException("No page api was defined for use with PaginationUtil objects. Please submit instantiated ApiClient object to the static PaginationUtil.setDefaultApiClient method or provide as a constructor argument to a new PaginationUtil object.");
        }
        Response<PaginatedCollection> paginatedResponse = pageApi.fetchPage(url).execute();
        if (paginatedResponse.isSuccessful()) {
            retVal = paginatedResponse.body();
        }
        return retVal;
    }

    public boolean gotoPage(String url) throws IOException {
        boolean retVal = false;
        PaginatedCollection pc = fetchPage(url);
        if (pc != null) {
            paginatedCollection = pc;
            determinePageParameters();
            retVal = true;
        }
        return retVal;
    }

    public Object getObject(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= numObjectsCurrentPage) {
            throw new IndexOutOfBoundsException("Attempt to access inaccessible index: " + index);
        }
        return paginatedCollection.getData().get(index);
    }

    private void determinePageParameters() {
        HashMap links = (HashMap) paginatedCollection.getLinks();

        firstPageLink = (String) links.get("first");

        prevPageLink = (String) links.get("prev");
        prevPageNumber = (prevPageLink == null) ? null : determinePageNumberFromLink(prevPageLink);

        currentPageLink = (String) links.get("self");
        if (currentPageLink != null) {
            currentPageNumber = determinePageNumberFromLink(currentPageLink);
            determinePageSizeFromSelfLink();
        } else {
            currentPageNumber = null;
        }

        nextPageLink = (String) links.get("next");
        nextPageNumber = (nextPageLink == null) ? null : determinePageNumberFromLink(nextPageLink);

        lastPageLink = (String) links.get("last");
        lastPageNumber = (lastPageLink == null) ? null : determinePageNumberFromLink(lastPageLink);

        numObjectsCurrentPage = paginatedCollection.getData().size();
    }

    private int determinePageNumberFromLink(String link) {
        try {
            Pattern pattern = Pattern.compile(PAGE_NUMBER_FORMAT);
            Matcher matcher = pattern.matcher(URLDecoder.decode(link, URL_ENCODING));
            if (matcher.find()) {
                String pageNum = matcher.group(1);
                return Integer.parseInt(pageNum);
            }
        } catch (UnsupportedEncodingException e) {} // this should not happen; encoding is hard-coded to UTF-8
        return 0;
    }

    private void determinePageSizeFromSelfLink() {
        try {
            Pattern pattern = Pattern.compile(PAGE_SIZE_FORMAT);
            Matcher matcher = pattern.matcher(URLDecoder.decode(currentPageLink, URL_ENCODING));
            if (matcher.find()) {
                numObjectsPerPage = Integer.parseInt(matcher.group(1));
            }
        } catch (UnsupportedEncodingException e) {} // this should not happen; encoding is hard-coded to UTF-8
    }

    private String createLinkForPage(int pageNum) {
        String retVal = null;
        if (currentPageLink != null) {
            String tempPageLink = currentPageLink.replaceAll("%5B", "[").replaceAll("%5D", "]");
            Matcher m = Pattern.compile(PAGE_NUMBER_FORMAT).matcher(tempPageLink);
            if (m.find()) {
                retVal = new StringBuilder(tempPageLink).replace(m.start(1), m.end(1), Integer.toString(pageNum)).toString();
                retVal = retVal.replaceAll("\\[", "%5B").replaceAll("\\]", "%5D");
            }
        }
        return retVal;
    }

    private PaginationUtil returnCopy() {
        PaginationUtil retVal = null;
        try {
            retVal = (PaginationUtil) this.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return retVal;
    }
}
