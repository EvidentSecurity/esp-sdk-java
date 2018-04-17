/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.evident.EspSdk;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.evident.models.PaginatedCollection;
import java.io.IOException;
import javax.naming.ConfigurationException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shaun
 */
public class PaginationUnitTest {

    private static ApiClient apiClient = null;
    private static final Gson GSON = new GsonBuilder()
                                            .setDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'")
                                            .registerTypeAdapter(DateTime.class, new DateTimeTypeAdapter())
                                            .registerTypeAdapter(LocalDate.class, new LocalDateTypeAdapter())
                                            .create();
    
    public PaginationUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        // set url to bad so any calls out will fail
        apiClient = new ApiClient();
        apiClient.setURL("http://badurl.com");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testSinglePage() throws IOException, ConfigurationException {
        String rawResponse = "{\"data\":[{\"id\":1,\"type\":\"organizations\",\"relationships\":{\"sub_organizations\":{\"data\":[{\"type\":\"sub_organizations\",\"id\":\"24\"},{\"type\":\"sub_organizations\",\"id\":\"2\"}],\"links\":{\"related\":\"http://localhost:3000/api/v2/sub_organizations.json?filter%5Borganization_id_eq%5D=2\"}},\"teams\":{\"data\":[{\"type\":\"teams\",\"id\":\"2\"},{\"type\":\"teams\",\"id\":\"20\"},{\"type\":\"teams\",\"id\":\"21\"}],\"links\":{\"related\":\"http://localhost:3000/api/v2/teams.json?filter%5Borganization_id_eq%5D=2\"}}},\"attributes\":{\"created_at\":\"2017-03-13T11:44:31Z\",\"name\":\"Test Org\",\"updated_at\":\"2017-03-13T11:44:31Z\"}},{\"id\":1,\"type\":\"organizations\",\"relationships\":{\"sub_organizations\":{\"data\":[{\"type\":\"sub_organizations\",\"id\":\"24\"},{\"type\":\"sub_organizations\",\"id\":\"2\"}],\"links\":{\"related\":\"http://localhost:3000/api/v2/sub_organizations.json?filter%5Borganization_id_eq%5D=2\"}},\"teams\":{\"data\":[{\"type\":\"teams\",\"id\":\"2\"},{\"type\":\"teams\",\"id\":\"20\"},{\"type\":\"teams\",\"id\":\"21\"}],\"links\":{\"related\":\"http://localhost:3000/api/v2/teams.json?filter%5Borganization_id_eq%5D=2\"}}},\"attributes\":{\"created_at\":\"2017-03-13T11:44:31Z\",\"name\":\"Test Org\",\"updated_at\":\"2017-03-13T11:44:31Z\"}}],\"links\":{\"self\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=1&page%5Bsize%5D=20\"},\"included\":[]}";
        ResponseBody responseBody = ResponseBody.create(MediaType.parse("text/plain"), rawResponse);
        GsonResponseBodyConverterToString<PaginatedCollection> responseBodyConverter = 
                new GsonResponseBodyConverterToString<>(GSON, PaginatedCollection.class);
        PaginatedCollection collection = responseBodyConverter.convert(responseBody);
        PaginationUtil paginationUtil = new PaginationUtil(collection, apiClient);
        assertEquals(new Integer(1), paginationUtil.getCurrentPageNumber());
        assertEquals(null, paginationUtil.getPrevPageNumber());
        assertEquals(null, paginationUtil.getNextPageNumber());
        assertEquals(null, paginationUtil.getLastPageNumber());
    }

    @Test
    public void testTwoPages() throws IOException, ConfigurationException {
        String rawResponse = "{\"data\":[{\"id\":1,\"type\":\"organizations\",\"relationships\":{\"sub_organizations\":{\"data\":[{\"type\":\"sub_organizations\",\"id\":\"24\"},{\"type\":\"sub_organizations\",\"id\":\"2\"}],\"links\":{\"related\":\"http://localhost:3000/api/v2/sub_organizations.json?filter%5Borganization_id_eq%5D=2\"}},\"teams\":{\"data\":[{\"type\":\"teams\",\"id\":\"2\"},{\"type\":\"teams\",\"id\":\"20\"},{\"type\":\"teams\",\"id\":\"21\"}],\"links\":{\"related\":\"http://localhost:3000/api/v2/teams.json?filter%5Borganization_id_eq%5D=2\"}}},\"attributes\":{\"created_at\":\"2017-03-13T11:44:31Z\",\"name\":\"Test Org\",\"updated_at\":\"2017-03-13T11:44:31Z\"}}],\"links\":{\"self\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=1&page%5Bsize%5D=1\",\"next\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=2&page%5Bsize%5D=1\",\"last\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=2&page%5Bsize%5D=1\"},\"included\":[]}";
        ResponseBody responseBody = ResponseBody.create(MediaType.parse("text/plain"), rawResponse);
        GsonResponseBodyConverterToString<PaginatedCollection> responseBodyConverter = 
                new GsonResponseBodyConverterToString<>(GSON, PaginatedCollection.class);
        PaginatedCollection collection = responseBodyConverter.convert(responseBody);
        PaginationUtil paginationUtil = new PaginationUtil(collection, apiClient);
        assertEquals(new Integer(1), paginationUtil.getCurrentPageNumber());
        assertEquals(null, paginationUtil.getPrevPageNumber());
        assertEquals(new Integer(2), paginationUtil.getNextPageNumber());
        assertEquals(new Integer(2), paginationUtil.getLastPageNumber());
    }

    @Test
    public void testLastPage() throws IOException, ConfigurationException {
        String rawResponse = "{\"data\":[{\"id\":1,\"type\":\"organizations\",\"relationships\":{\"sub_organizations\":{\"data\":[{\"type\":\"sub_organizations\",\"id\":\"24\"},{\"type\":\"sub_organizations\",\"id\":\"2\"}],\"links\":{\"related\":\"http://localhost:3000/api/v2/sub_organizations.json?filter%5Borganization_id_eq%5D=2\"}},\"teams\":{\"data\":[{\"type\":\"teams\",\"id\":\"2\"},{\"type\":\"teams\",\"id\":\"20\"},{\"type\":\"teams\",\"id\":\"21\"}],\"links\":{\"related\":\"http://localhost:3000/api/v2/teams.json?filter%5Borganization_id_eq%5D=2\"}}},\"attributes\":{\"created_at\":\"2017-03-13T11:44:31Z\",\"name\":\"Test Org\",\"updated_at\":\"2017-03-13T11:44:31Z\"}}],\"links\":{\"self\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=2&page%5Bsize%5D=1\",\"prev\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=1&page%5Bsize%5D=1\"},\"included\":[]}";
        ResponseBody responseBody = ResponseBody.create(MediaType.parse("text/plain"), rawResponse);
        GsonResponseBodyConverterToString<PaginatedCollection> responseBodyConverter = 
                new GsonResponseBodyConverterToString<>(GSON, PaginatedCollection.class);
        PaginatedCollection collection = responseBodyConverter.convert(responseBody);
        PaginationUtil paginationUtil = new PaginationUtil(collection, apiClient);
        assertEquals(new Integer(2), paginationUtil.getCurrentPageNumber());
        assertEquals(new Integer(1), paginationUtil.getPrevPageNumber());
        assertEquals(null, paginationUtil.getNextPageNumber());
        assertEquals(null, paginationUtil.getLastPageNumber());
    }

    @Test
    public void testMiddlePage() throws IOException, ConfigurationException {
        String rawResponse = "{\"data\":[{\"id\":1,\"type\":\"organizations\",\"relationships\":{\"sub_organizations\":{\"data\":[{\"type\":\"sub_organizations\",\"id\":\"24\"},{\"type\":\"sub_organizations\",\"id\":\"2\"}],\"links\":{\"related\":\"http://localhost:3000/api/v2/sub_organizations.json?filter%5Borganization_id_eq%5D=2\"}},\"teams\":{\"data\":[{\"type\":\"teams\",\"id\":\"2\"},{\"type\":\"teams\",\"id\":\"20\"},{\"type\":\"teams\",\"id\":\"21\"}],\"links\":{\"related\":\"http://localhost:3000/api/v2/teams.json?filter%5Borganization_id_eq%5D=2\"}}},\"attributes\":{\"created_at\":\"2017-03-13T11:44:31Z\",\"name\":\"Test Org\",\"updated_at\":\"2017-03-13T11:44:31Z\"}}],\"links\":{\"self\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=2&page%5Bsize%5D=1\",\"prev\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=1&page%5Bsize%5D=1\",\"next\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=3&page%5Bsize%5D=1\",\"last\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=3&page%5Bsize%5D=1\"},\"included\":[]}";
        ResponseBody responseBody = ResponseBody.create(MediaType.parse("text/plain"), rawResponse);
        GsonResponseBodyConverterToString<PaginatedCollection> responseBodyConverter = 
                new GsonResponseBodyConverterToString<>(GSON, PaginatedCollection.class);
        PaginatedCollection collection = responseBodyConverter.convert(responseBody);
        PaginationUtil paginationUtil = new PaginationUtil(collection, apiClient);
        assertEquals(new Integer(2), paginationUtil.getCurrentPageNumber());
        assertEquals(new Integer(1), paginationUtil.getPrevPageNumber());
        assertEquals(new Integer(3), paginationUtil.getNextPageNumber());
        assertEquals(new Integer(3), paginationUtil.getLastPageNumber());
        boolean pause = true;
    }

//    @Test
//    public void testPageSizes() throws IOException, ConfigurationException {
//        String rawResponse = "{\"data\":[{\"id\":1,\"type\":\"organizations\",\"relationships\":{\"sub_organizations\":{\"data\":[{\"type\":\"sub_organizations\",\"id\":\"24\"},{\"type\":\"sub_organizations\",\"id\":\"2\"}],\"links\":{\"related\":\"http://localhost:3000/api/v2/sub_organizations.json?filter%5Borganization_id_eq%5D=2\"}},\"teams\":{\"data\":[{\"type\":\"teams\",\"id\":\"2\"},{\"type\":\"teams\",\"id\":\"20\"},{\"type\":\"teams\",\"id\":\"21\"}],\"links\":{\"related\":\"http://localhost:3000/api/v2/teams.json?filter%5Borganization_id_eq%5D=2\"}}},\"attributes\":{\"created_at\":\"2017-03-13T11:44:31Z\",\"name\":\"Test Org\",\"updated_at\":\"2017-03-13T11:44:31Z\"}}],\"links\":{\"self\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=2&page%5Bsize%5D=1\",\"prev\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=1&page%5Bsize%5D=1\",\"next\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=3&page%5Bsize%5D=1\",\"last\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=3&page%5Bsize%5D=1\"},\"included\":null}";
//        ResponseBody responseBody = ResponseBody.create(MediaType.parse("text/plain"), rawResponse);
//        GsonResponseBodyConverterToString<PaginatedCollection> responseBodyConverter = 
//                new GsonResponseBodyConverterToString<>(gson, PaginatedCollection.class);
//        PaginatedCollection collection = responseBodyConverter.convert(responseBody);
//        PaginationUtil paginationUtil = new PaginationUtil(collection, apiClient);
//        assertEquals(new Integer(2), paginationUtil.getPageSize(paginationUtil.getCurrentPageNumber()));
//        assertEquals(new Integer(1), paginationUtil.getPrevPageNumber());
//        assertEquals(new Integer(3), paginationUtil.getNextPageNumber());
//        assertEquals(new Integer(3), paginationUtil.getLastPageNumber());
//        boolean pause = true;
//    }

    @Test
    public void testFetchFirstPageWithoutCall() throws IOException, ConfigurationException {
        String rawResponse = "{\"data\":[{\"id\":1,\"type\":\"organizations\",\"relationships\":{\"sub_organizations\":{\"data\":[{\"type\":\"sub_organizations\",\"id\":\"24\"},{\"type\":\"sub_organizations\",\"id\":\"2\"}],\"links\":{\"related\":\"http://localhost:3000/api/v2/sub_organizations.json?filter%5Borganization_id_eq%5D=2\"}},\"teams\":{\"data\":[{\"type\":\"teams\",\"id\":\"2\"},{\"type\":\"teams\",\"id\":\"20\"},{\"type\":\"teams\",\"id\":\"21\"}],\"links\":{\"related\":\"http://localhost:3000/api/v2/teams.json?filter%5Borganization_id_eq%5D=2\"}}},\"attributes\":{\"created_at\":\"2017-03-13T11:44:31Z\",\"name\":\"Test Org\",\"updated_at\":\"2017-03-13T11:44:31Z\"}}],\"links\":{\"self\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=1&page%5Bsize%5D=1\",\"next\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=2&page%5Bsize%5D=1\",\"last\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=2&page%5Bsize%5D=1\"},\"included\":[]}";
        ResponseBody responseBody = ResponseBody.create(MediaType.parse("text/plain"), rawResponse);
        GsonResponseBodyConverterToString<PaginatedCollection> responseBodyConverter = 
                new GsonResponseBodyConverterToString<>(GSON, PaginatedCollection.class);
        PaginatedCollection collection = responseBodyConverter.convert(responseBody);
        PaginationUtil origPaginationUtil = new PaginationUtil(collection, apiClient);
        PaginationUtil fetchedPaginationUtil = origPaginationUtil.fetchFirstPage();
        assertEquals(origPaginationUtil.getCurrentPageNumber(), fetchedPaginationUtil.getCurrentPageNumber());
        assertNotEquals(origPaginationUtil, fetchedPaginationUtil);
    }

    @Test
    public void testFetchLastPageWithoutCall() throws IOException, ConfigurationException {
        String rawResponse = "{\"data\":[{\"id\":1,\"type\":\"organizations\",\"relationships\":{\"sub_organizations\":{\"data\":[{\"type\":\"sub_organizations\",\"id\":\"24\"},{\"type\":\"sub_organizations\",\"id\":\"2\"}],\"links\":{\"related\":\"http://localhost:3000/api/v2/sub_organizations.json?filter%5Borganization_id_eq%5D=2\"}},\"teams\":{\"data\":[{\"type\":\"teams\",\"id\":\"2\"},{\"type\":\"teams\",\"id\":\"20\"},{\"type\":\"teams\",\"id\":\"21\"}],\"links\":{\"related\":\"http://localhost:3000/api/v2/teams.json?filter%5Borganization_id_eq%5D=2\"}}},\"attributes\":{\"created_at\":\"2017-03-13T11:44:31Z\",\"name\":\"Test Org\",\"updated_at\":\"2017-03-13T11:44:31Z\"}}],\"links\":{\"self\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=2&page%5Bsize%5D=1\",\"prev\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=1&page%5Bsize%5D=1\"},\"included\":[]}";
        ResponseBody responseBody = ResponseBody.create(MediaType.parse("text/plain"), rawResponse);
        GsonResponseBodyConverterToString<PaginatedCollection> responseBodyConverter = 
                new GsonResponseBodyConverterToString<>(GSON, PaginatedCollection.class);
        PaginatedCollection collection = responseBodyConverter.convert(responseBody);
        PaginationUtil origPaginationUtil = new PaginationUtil(collection, apiClient);
        PaginationUtil fetchedPaginationUtil = origPaginationUtil.fetchLastPage();
        assertEquals(origPaginationUtil.getCurrentPageNumber(), fetchedPaginationUtil.getCurrentPageNumber());
        assertNotEquals(origPaginationUtil, fetchedPaginationUtil);
    }

    @Test
    public void testFetchCurrentPageWithoutCall() throws IOException, ConfigurationException {
        String rawResponse = "{\"data\":[{\"id\":1,\"type\":\"organizations\",\"relationships\":{\"sub_organizations\":{\"data\":[{\"type\":\"sub_organizations\",\"id\":\"24\"},{\"type\":\"sub_organizations\",\"id\":\"2\"}],\"links\":{\"related\":\"http://localhost:3000/api/v2/sub_organizations.json?filter%5Borganization_id_eq%5D=2\"}},\"teams\":{\"data\":[{\"type\":\"teams\",\"id\":\"2\"},{\"type\":\"teams\",\"id\":\"20\"},{\"type\":\"teams\",\"id\":\"21\"}],\"links\":{\"related\":\"http://localhost:3000/api/v2/teams.json?filter%5Borganization_id_eq%5D=2\"}}},\"attributes\":{\"created_at\":\"2017-03-13T11:44:31Z\",\"name\":\"Test Org\",\"updated_at\":\"2017-03-13T11:44:31Z\"}}],\"links\":{\"self\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=2&page%5Bsize%5D=1\",\"prev\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=1&page%5Bsize%5D=1\",\"next\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=3&page%5Bsize%5D=1\",\"last\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=3&page%5Bsize%5D=1\"},\"included\":[]}";
        ResponseBody responseBody = ResponseBody.create(MediaType.parse("text/plain"), rawResponse);
        GsonResponseBodyConverterToString<PaginatedCollection> responseBodyConverter = 
                new GsonResponseBodyConverterToString<>(GSON, PaginatedCollection.class);
        PaginatedCollection collection = responseBodyConverter.convert(responseBody);
        PaginationUtil origPaginationUtil = new PaginationUtil(collection, apiClient);
        PaginationUtil fetchedPaginationUtil = origPaginationUtil.fetchPage(2);
        assertEquals(origPaginationUtil.getCurrentPageNumber(), fetchedPaginationUtil.getCurrentPageNumber());
        assertNotEquals(origPaginationUtil, fetchedPaginationUtil);
    }

    @Test
    public void testGotoFirstPageWithoutCall() throws IOException, ConfigurationException {
        String rawResponse = "{\"data\":[{\"id\":1,\"type\":\"organizations\",\"relationships\":{\"sub_organizations\":{\"data\":[{\"type\":\"sub_organizations\",\"id\":\"24\"},{\"type\":\"sub_organizations\",\"id\":\"2\"}],\"links\":{\"related\":\"http://localhost:3000/api/v2/sub_organizations.json?filter%5Borganization_id_eq%5D=2\"}},\"teams\":{\"data\":[{\"type\":\"teams\",\"id\":\"2\"},{\"type\":\"teams\",\"id\":\"20\"},{\"type\":\"teams\",\"id\":\"21\"}],\"links\":{\"related\":\"http://localhost:3000/api/v2/teams.json?filter%5Borganization_id_eq%5D=2\"}}},\"attributes\":{\"created_at\":\"2017-03-13T11:44:31Z\",\"name\":\"Test Org\",\"updated_at\":\"2017-03-13T11:44:31Z\"}}],\"links\":{\"self\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=1&page%5Bsize%5D=1\",\"next\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=2&page%5Bsize%5D=1\",\"last\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=2&page%5Bsize%5D=1\"},\"included\":[]}";
        ResponseBody responseBody = ResponseBody.create(MediaType.parse("text/plain"), rawResponse);
        GsonResponseBodyConverterToString<PaginatedCollection> responseBodyConverter = 
                new GsonResponseBodyConverterToString<>(GSON, PaginatedCollection.class);
        PaginatedCollection collection = responseBodyConverter.convert(responseBody);
        PaginationUtil paginationUtil = new PaginationUtil(collection, apiClient);
        assertTrue(paginationUtil.gotoFirstPage());
        assertEquals(Integer.valueOf(1), paginationUtil.getCurrentPageNumber());
    }

    @Test
    public void testGotoLastPageWithoutCall() throws IOException, ConfigurationException {
        String rawResponse = "{\"data\":[{\"id\":1,\"type\":\"organizations\",\"relationships\":{\"sub_organizations\":{\"data\":[{\"type\":\"sub_organizations\",\"id\":\"24\"},{\"type\":\"sub_organizations\",\"id\":\"2\"}],\"links\":{\"related\":\"http://localhost:3000/api/v2/sub_organizations.json?filter%5Borganization_id_eq%5D=2\"}},\"teams\":{\"data\":[{\"type\":\"teams\",\"id\":\"2\"},{\"type\":\"teams\",\"id\":\"20\"},{\"type\":\"teams\",\"id\":\"21\"}],\"links\":{\"related\":\"http://localhost:3000/api/v2/teams.json?filter%5Borganization_id_eq%5D=2\"}}},\"attributes\":{\"created_at\":\"2017-03-13T11:44:31Z\",\"name\":\"Test Org\",\"updated_at\":\"2017-03-13T11:44:31Z\"}}],\"links\":{\"self\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=2&page%5Bsize%5D=1\",\"prev\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=1&page%5Bsize%5D=1\"},\"included\":[]}";
        ResponseBody responseBody = ResponseBody.create(MediaType.parse("text/plain"), rawResponse);
        GsonResponseBodyConverterToString<PaginatedCollection> responseBodyConverter = 
                new GsonResponseBodyConverterToString<>(GSON, PaginatedCollection.class);
        PaginatedCollection collection = responseBodyConverter.convert(responseBody);
        PaginationUtil paginationUtil = new PaginationUtil(collection, apiClient);
        assertTrue(paginationUtil.gotoLastPage());
        assertEquals(Integer.valueOf(2), paginationUtil.getCurrentPageNumber());
    }

    @Test
    public void testGotoCurrentPageWithoutCall() throws IOException, ConfigurationException {
        String rawResponse = "{\"data\":[{\"id\":1,\"type\":\"organizations\",\"relationships\":{\"sub_organizations\":{\"data\":[{\"type\":\"sub_organizations\",\"id\":\"24\"},{\"type\":\"sub_organizations\",\"id\":\"2\"}],\"links\":{\"related\":\"http://localhost:3000/api/v2/sub_organizations.json?filter%5Borganization_id_eq%5D=2\"}},\"teams\":{\"data\":[{\"type\":\"teams\",\"id\":\"2\"},{\"type\":\"teams\",\"id\":\"20\"},{\"type\":\"teams\",\"id\":\"21\"}],\"links\":{\"related\":\"http://localhost:3000/api/v2/teams.json?filter%5Borganization_id_eq%5D=2\"}}},\"attributes\":{\"created_at\":\"2017-03-13T11:44:31Z\",\"name\":\"Test Org\",\"updated_at\":\"2017-03-13T11:44:31Z\"}}],\"links\":{\"self\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=2&page%5Bsize%5D=1\",\"prev\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=1&page%5Bsize%5D=1\",\"next\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=3&page%5Bsize%5D=1\",\"last\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=3&page%5Bsize%5D=1\"},\"included\":[]}";
        ResponseBody responseBody = ResponseBody.create(MediaType.parse("text/plain"), rawResponse);
        GsonResponseBodyConverterToString<PaginatedCollection> responseBodyConverter = 
                new GsonResponseBodyConverterToString<>(GSON, PaginatedCollection.class);
        PaginatedCollection collection = responseBodyConverter.convert(responseBody);
        PaginationUtil paginationUtil = new PaginationUtil(collection, apiClient);
        assertTrue(paginationUtil.gotoPage(2));
        assertEquals(Integer.valueOf(2), paginationUtil.getCurrentPageNumber());
    }
}
