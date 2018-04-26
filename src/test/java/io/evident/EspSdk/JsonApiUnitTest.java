/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.evident.EspSdk;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.evident.models.Alert;
import io.evident.models.PaginatedCollection;
import java.io.IOException;
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
public class JsonApiUnitTest {
    
    private static final Gson GSON = new GsonBuilder()
                                            .setDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'")
                                            .registerTypeAdapter(DateTime.class, new DateTimeTypeAdapter())
                                            .registerTypeAdapter(LocalDate.class, new LocalDateTypeAdapter())
                                            .create();
    public JsonApiUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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
    public void testIncludedObjects() throws IOException {
        String rawResponse = "{\"data\":{\"id\":\"50\",\"type\":\"alerts\",\"attributes\":{\"created_at\":\"2018-04-25T17:31:49.000Z\",\"status\":\"fail\",\"risk_level\":\"high\",\"resource\":null,\"ended_reason\":null,\"replaced_by_id\":null,\"replaced_by_status\":null,\"updated_at\":\"2018-04-25T17:31:49.000Z\",\"started_at\":\"2018-04-25T17:26:48.000Z\",\"ended_at\":null},\"relationships\":{\"external_account\":{\"data\":{\"id\":\"1\",\"type\":\"external_accounts\"},\"links\":{\"related\":\"http://test.host/api/v2/external_accounts/1.json\"}},\"region\":{\"data\":{\"id\":\"1\",\"type\":\"regions\"},\"links\":{\"related\":\"http://test.host/api/v2/regions/1.json\"}},\"signature\":{\"data\":{\"id\":\"1\",\"type\":\"signatures\"},\"links\":{\"related\":\"http://test.host/api/v2/signatures/1.json\"}},\"custom_signature\":{\"data\":null,\"links\":{\"related\":null}},\"suppression\":{\"links\":{\"related\":null}},\"metadata\":{\"links\":{\"related\":\"http://test.host/api/v2/alerts/50/metadata.json\"}},\"attribution\":{\"links\":{\"related\":\"http://test.host/api/v2/alerts/50/attribution.json\"}},\"cloud_trail_events\":{\"links\":{\"related\":\"http://test.host/api/v2/alerts/50/cloud_trail_events.json\"}},\"tags\":{\"links\":{\"related\":\"http://test.host/api/v2/alerts/50/tags.json\"}},\"compliance_controls\":{\"links\":{\"related\":\"http://test.host/api/v2/alerts/50/compliance_controls.json\"}},\"custom_compliance_controls\":{\"links\":{\"related\":\"http://test.host/api/v2/alerts/50/custom_compliance_controls.json\"}}}},\"included\":[{\"id\":\"1\",\"type\":\"external_accounts\",\"attributes\":{\"created_at\":\"2018-04-25T17:31:48.000Z\",\"name\":\"123456789101\",\"updated_at\":\"2018-04-25T17:31:48.000Z\",\"provider\":\"amazon\",\"arn\":\"arn:aws:iam::123456789101:role/Default-Service-Role\",\"account\":\"123456789101\",\"external_id\":\"test_sts_external_id_1\",\"cloudtrail_name\":null},\"relationships\":{\"organization\":{\"links\":{\"related\":\"http://test.host/api/v2/organizations/1.json\"}},\"sub_organization\":{\"links\":{\"related\":\"http://test.host/api/v2/sub_organizations/1.json\"}},\"team\":{\"data\":{\"id\":\"1\",\"type\":\"teams\"},\"links\":{\"related\":\"http://test.host/api/v2/teams/1.json\"}},\"scan_intervals\":{\"links\":{\"related\":\"http://test.host/api/v2/external_accounts/1/scan_intervals.json\"}},\"disabled_signatures\":{\"links\":{\"related\":\"http://test.host/api/v2/external_accounts/1/disabled_signatures.json\"}},\"suppressions\":{\"links\":{\"related\":\"http://test.host/api/v2/suppressions.json?filter%5Bexternal_accounts_id_eq%5D=1\"}},\"credentials\":{\"links\":{\"related\":\"http://test.host/api/v2/external_accounts/1/amazon.json\"}}}},{\"id\":\"1\",\"type\":\"teams\",\"attributes\":{\"name\":\"Default Team\",\"created_at\":\"2018-04-25T17:31:48.000Z\",\"updated_at\":\"2018-04-25T17:31:48.000Z\"},\"relationships\":{\"custom_signatures\":{\"links\":{\"related\":\"http://test.host/api/v2/custom_signatures.json?filter%5Bteam_id_eq%5D=1\"}},\"external_accounts\":{\"links\":{\"related\":\"http://test.host/api/v2/external_accounts.json?filter%5Bteam_id_eq%5D=1\"}},\"organization\":{\"links\":{\"related\":\"http://test.host/api/v2/organizations/1.json\"}},\"sub_organization\":{\"data\":{\"id\":\"1\",\"type\":\"sub_organizations\"},\"links\":{\"related\":\"http://test.host/api/v2/sub_organizations/1.json\"}}}},{\"id\":\"1\",\"type\":\"sub_organizations\",\"attributes\":{\"name\":\"Default Sub Organization\",\"created_at\":\"2018-04-25T17:31:48.000Z\",\"updated_at\":\"2018-04-25T17:31:48.000Z\"},\"relationships\":{\"external_accounts\":{\"links\":{\"related\":\"http://test.host/api/v2/external_accounts.json?filter%5Bsub_organization_id_eq%5D=1\"}},\"organization\":{\"data\":{\"id\":\"1\",\"type\":\"organizations\"},\"links\":{\"related\":\"http://test.host/api/v2/organizations/1.json\"}},\"teams\":{\"links\":{\"related\":\"http://test.host/api/v2/teams.json?filter%5Bsub_organization_id_eq%5D=1\"}}}},{\"id\":\"1\",\"type\":\"organizations\",\"attributes\":{\"country\":\"United States of America\",\"created_at\":\"2018-04-25T17:31:47.000Z\",\"name\":\"Default\",\"require_mfa\":false,\"updated_at\":\"2018-04-25T17:31:47.000Z\"},\"relationships\":{\"subscription\":{\"links\":{\"related\":\"http://test.host/api/v2/subscriptions/1.json\"}},\"custom_signatures\":{\"links\":{\"related\":\"http://test.host/api/v2/custom_signatures.json?filter%5Borganization_id_eq%5D=1\"}},\"external_accounts\":{\"links\":{\"related\":\"http://test.host/api/v2/external_accounts.json?filter%5Borganization_id_eq%5D=1\"}},\"sub_organizations\":{\"links\":{\"related\":\"http://test.host/api/v2/sub_organizations.json?filter%5Borganization_id_eq%5D=1\"}},\"teams\":{\"links\":{\"related\":\"http://test.host/api/v2/teams.json?filter%5Borganization_id_eq%5D=1\"}},\"users\":{\"links\":{\"related\":\"http://test.host/api/v2/users.json?filter%5Borganization_id_eq%5D=1\"}},\"compliance_standards\":{\"links\":{\"related\":\"http://test.host/api/v2/organizations/1/compliance_standards.json\"}},\"integrations\":{\"links\":{\"related\":\"http://test.host/api/v2/integrations.json?filter%5Borganization_id_eq%5D=1\"}}}},{\"id\":\"1\",\"type\":\"regions\",\"attributes\":{\"code\":\"us_east_test_1\",\"name\":null,\"created_at\":\"2018-04-25T17:31:48.000Z\",\"updated_at\":\"2018-04-25T17:31:48.000Z\",\"provider\":\"amazon\"}},{\"id\":\"1\",\"type\":\"signatures\",\"attributes\":{\"created_at\":\"2018-04-25T17:31:48.000Z\",\"description\":\"Description\",\"identifier\":\"AWS:EC2-100\",\"name\":\"heartbleed\",\"resolution\":\"Shut them all down\",\"risk_level\":\"high\",\"updated_at\":\"2018-04-25T17:31:48.000Z\"},\"relationships\":{\"service\":{\"links\":{\"related\":\"http://test.host/api/v2/services/1.json\"}},\"disabled_external_accounts\":{\"links\":{\"related\":\"http://test.host/api/v2/signatures/1/disabled_external_accounts.json\"}},\"suppressions\":{\"links\":{\"related\":\"http://test.host/api/v2/suppressions.json?filter%5Bsignatures_id_eq%5D=1\"}}}}]}";
        ResponseBody responseBody = ResponseBody.create(MediaType.parse("text/plain"), rawResponse);
        GsonResponseBodyConverterToString<PaginatedCollection> responseBodyConverter = 
                new GsonResponseBodyConverterToString<>(GSON, Alert.class);
        Object data = responseBodyConverter.convert(responseBody);
        assertEquals(data.getClass(), Alert.class);
        Alert alert = (Alert) data;
        assertEquals(1, (int) alert.getExternalAccount().getId());
        assertEquals(1, (int) alert.getExternalAccount().getTeam().getId());
        assertEquals(1, (int) alert.getExternalAccount().getTeam().getSubOrganization().getOrganization().getId());
        assertEquals(1, (int) alert.getRegion().getId());
        assertEquals(1, (int) alert.getSignature().getId());
    }

    @Test
    public void testForeignKeys() throws IOException {
        String rawResponse = "{\"data\":[{\"id\":1,\"type\":\"alerts\",\"relationships\":{\"external_account\":{\"data\":{\"type\":\"external_accounts\",\"id\":\"1015\"},\"links\":{\"related\":\"http://test.host/api/v2/external_accounts/1015.json\"}},\"region\":{\"data\":{\"type\":\"regions\",\"id\":\"1014\"}},\"signature\":{\"data\":{\"type\":\"signatures\",\"id\":\"1013\"},\"links\":{\"related\":\"http://test.host/api/v2/signatures/1013.json\"}},\"custom_signature\":{\"data\":null},\"suppression\":{\"data\":{\"id\":\"1\",\"type\":\"suppressions\"},\"links\":{\"related\":\"http://test.host/api/v2/suppressions/1.json\"}},\"metadata\":{\"links\":{\"related\":\"http://test.host/api/v2/alerts/1017/metadata.json\"}},\"attribution\":{\"data\":{\"id\":\"1015\",\"type\":\"attributions\"},\"links\":{\"related\":\"http://test.host/api/v2/alerts/1019/attribution.json\"}},\"tags\":{\"data\":[{\"id\":\"1\",\"type\":\"tags\"},{\"id\":\"2\",\"type\":\"tags\"}]}},\"attributes\":{\"created_at\":\"2017-03-13T10:03:08Z\",\"status\":\"fail\",\"resource\":\"resource-3\",\"updated_at\":null,\"started_at\":\"2017-03-13T10:03:08Z\",\"ended_at\":null}}],\"links\":{\"self\":\"http://localhost:3000/api/v2/not_the_real_url/but_useful_for_testing.json?page%5Bnumber%5D=1&page%5Bsize%5D=20\"},\"included\":[{\"id\":\"1015\",\"type\":\"external_accounts\",\"attributes\":{\"account\":\"5\",\"arn\":\"arn:aws:iam::5:role/test_sts_role\",\"created_at\":\"2015-09-11T21:12:15.183Z\",\"external_id\":\"test_sts_external_id_1\",\"name\":null,\"updated_at\":null,\"user_attribution_role\":null},\"relationships\":{\"organization\":{\"data\":{\"type\":\"organizations\",\"id\":\"5\"},\"links\":{\"related\":\"http://test.host/api/v2/organizations/5.json\"}},\"sub_organization\":{\"data\":{\"type\":\"sub_organizations\",\"id\":\"5\"},\"links\":{\"related\":\"http://test.host/api/v2/sub_organizations/5.json\"}},\"team\":{\"data\":{\"type\":\"teams\",\"id\":\"5\"},\"links\":{\"related\":\"http://test.host/api/v2/teams/5.json\"}},\"user_attribution_role\":{\"data\":null}}},{\"id\":\"5\",\"type\":\"teams\",\"name\":\"Default Team\",\"created_at\":\"2015-09-11T21:12:15.183Z\",\"updated_at\":\"2015-09-11T21:12:15.183Z\",\"relationships\":{\"sub_organization\":{\"data\":{\"type\":\"sub_organizations\",\"id\":\"5\"},\"links\":{\"related\":\"http://localhost:3000/api/v2/sub_organizations/2.json\"}},\"organization\":{\"data\":{\"type\":\"organizations\",\"id\":\"5\"},\"links\":{\"related\":\"http://localhost:3000/api/v2/organizations/2.json\"}}}},{\"id\":\"5\",\"type\":\"organizations\",\"created_at\":\"2015-09-11T21:12:15.183Z\",\"name\":\"Test Org\",\"updated_at\":\"2015-09-11T21:12:15.183Z\",\"relationships\":{\"sub_organizations\":{\"data\":[{\"type\":\"sub_organizations\",\"id\":\"24\"},{\"type\":\"sub_organizations\",\"id\":\"2\"}],\"links\":{\"related\":\"http://localhost:3000/api/v2/sub_organizations.json?filter%5Borganization_id_eq%5D=2\"}},\"teams\":{\"data\":[{\"type\":\"teams\",\"id\":\"2\"},{\"type\":\"teams\",\"id\":\"20\"},{\"type\":\"teams\",\"id\":\"21\"}],\"links\":{\"related\":\"http://localhost:3000/api/v2/teams.json?filter%5Borganization_id_eq%5D=2\"}}}},{\"id\":\"1014\",\"type\":\"regions\",\"attributes\":{\"code\":\"us_east_test_3\"}},{\"id\":\"1013\",\"type\":\"signatures\",\"attributes\":{\"created_at\":\"2015-09-11T21:12:15.192Z\",\"description\":\"\\\"Some description for some test\\\"\",\"identifier\":\"3 Unique ID\",\"name\":\"3_test_signature\",\"resolution\":\"\\\"Turn on some setting\\\"\",\"risk_level\":\"High\",\"updated_at\":null},\"relationships\":{\"service\":{\"data\":{\"type\":\"services\",\"id\":\"3\"},\"links\":{\"related\":\"http://test.host/api/v2/services/3.json\"}}}},{\"id\":\"1015\",\"type\":\"attributions\",\"attributes\":{\"event_id\":\"1\",\"event_name\":\"1\",\"event_time\":\"2018-03-01T21:26:14.000Z\",\"raw_event\":{\"sdk_integration_tests\":\"event data\"},\"user\":\"arn:aws:iam::34234234234:user/johndoe\",\"ip_address\":\"123.0.0.123\",\"scope_name\":\"agent123\"},\"relationships\":{\"alert\":{\"links\":{\"related\":null}}}},{\"id\":\"1\",\"type\":\"suppressions\",\"attributes\":{\"created_at\":\"2015-10-16T18:34:19.464Z\",\"reason\":\"I dont like this\",\"status\":\"setup\",\"updated_at\":\"2015-10-16T18:34:19.464Z\",\"configuration\":{\"suppression_type\":\"regions\",\"resource\":null,\"regions\":[{\"id\":\"4\",\"type\":\"regions\",\"attributes\":{\"code\":\"us_east_test_4\"}}],\"external_accounts\":[]}},\"relationships\":{\"organization\":{\"data\":{\"id\":\"4\",\"type\":\"organizations\"},\"links\":{\"related\":\"http://test.host/api/v2/organizations/4.json\"}}}},{\"id\":\"1\",\"type\":\"tags\",\"attributes\":{\"key\":\"Name\",\"value\":\"abc123\",\"created_at\":\"2015-10-16T18:34:19.569Z\",\"updated_at\":\"2015-10-16T18:34:19.569Z\"}},{\"id\":\"2\",\"type\":\"tags\",\"attributes\":{\"key\":\"Name\",\"value\":\"abc123\",\"created_at\":\"2015-10-16T18:34:19.571Z\",\"updated_at\":\"2015-10-16T18:34:19.571Z\"}}]}";
        ResponseBody responseBody = ResponseBody.create(MediaType.parse("text/plain"), rawResponse);
        GsonResponseBodyConverterToString<PaginatedCollection> responseBodyConverter = 
                new GsonResponseBodyConverterToString<>(GSON, PaginatedCollection.class);
        Object data = responseBodyConverter.convert(responseBody).getData().get(0);
        assertEquals(data.getClass(), Alert.class);
        Alert alert = (Alert) data;
        assertEquals(1015, (int) alert.getExternalAccountId());
        assertEquals(1014, (int) alert.getRegionId());
        assertEquals(1013, (int) alert.getSignatureId());
        assertEquals(1, (int) alert.getTagIds().get(0));
    }
}
