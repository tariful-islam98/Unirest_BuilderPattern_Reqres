package com.reqres.users;

import com.reqres.base.BaseTest;
import com.reqres.base.GatewayRequest;
import com.reqres.services.users.GetAllUsersReq;
import com.reqres.services.users.GetAllUsersResp;
import com.reqres.helpers.AssertHelper;
import com.reqres.helpers.MandatoryHeaders;
import org.testng.annotations.Test;

public class GetAllUsers extends BaseTest {
    @Test
    public void test_get_all_users(){
        GatewayRequest gatewayRequest = new GatewayRequest()
                .usingHeaders(MandatoryHeaders.getHeaders())
                .forService()
                .userService()
                .getAllUsers(GetAllUsersReq.builder().build())
                .send();

        AssertHelper.assertResponseCode(gatewayRequest, 200);

        GetAllUsersResp resp = (GetAllUsersResp) gatewayRequest.getSerializedResponse();

        AssertHelper.assertResponseBodyContains("page", resp.getPage(), 1);
        AssertHelper.assertResponseBodyContains("data", resp.getData().size(), 6);
    }
}
