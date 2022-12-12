package com.reqres.users;

import com.reqres.base.BaseTest;
import com.reqres.base.GatewayRequest;
import com.reqres.services.users.GetSingleUserReq;
import com.reqres.services.users.GetSingleUserResp;
import com.reqres.helpers.AssertHelper;
import com.reqres.helpers.MandatoryHeaders;
import org.testng.annotations.Test;

public class GetSingleUser extends BaseTest {
    @Test
    public void test_get_single_user(){
        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .userService()
                .getSingleUser(GetSingleUserReq.builder()
                        .id("2")
                        .build())
                .send();

        AssertHelper.assertResponseCode(gatewayRequest, 200);

        GetSingleUserResp resp = (GetSingleUserResp) gatewayRequest.getSerializedResponse();

        AssertHelper.assertResponseBodyContains("id", resp.getData().getId(), 2);
    }

    @Test
    public void test_get_invalid_user_id(){
        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .userService()
                .getSingleUser(GetSingleUserReq.builder()
                        .id("23")
                        .build())
                .send();

        AssertHelper.assertResponseCode(gatewayRequest, 404);
    }
}
