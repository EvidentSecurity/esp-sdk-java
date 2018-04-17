/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.evident.EspSdk;

import io.evident.EspSdk.auth.HmacAuth;
import okhttp3.Headers;
import okhttp3.Request;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author shaun
 */
public class ApiAuthenticationUnitTest {
    
    public ApiAuthenticationUnitTest() {
    }
    
    @Test
    public void testHMAC_HeadersPresent() {
        HmacAuth hmac = new HmacAuth();
        Request request = new Request.Builder()
                     .url("http://www.test.com")
                     .build();
        try {
            Request authenticatedRequest = hmac.addHMAC_Headers(request);
            Headers headers = authenticatedRequest.headers();
            assertNotNull(headers.get("Date"));
            assertEquals(headers.get("Accept"), "application/vnd.api+json");
            assertEquals(headers.get("Content-type"), "application/vnd.api+json");
            assertTrue(headers.get("Authorization").matches("^APIAuth.*"));
        } catch (Exception e) {
            System.out.println("An exception has occurred: " + e.toString());
        }
    }
}
