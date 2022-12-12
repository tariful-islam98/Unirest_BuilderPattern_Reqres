package com.reqres.controllers;

import com.reqres.base.GatewayRequest;
import com.reqres.services.users.GetAllUsersReq;
import com.reqres.services.users.GetAllUsersResp;
import com.reqres.services.users.GetSingleUserReq;
import com.reqres.services.users.GetSingleUserResp;

public class UserService {
    private GatewayRequest gatewayRequest;

    public UserService(GatewayRequest gatewayRequest){
        this.gatewayRequest = gatewayRequest;
    }

    public GatewayRequest getAllUsers(GetAllUsersReq allUsersReq){
        gatewayRequest.setBody(allUsersReq);
        gatewayRequest.setResponseObjectType(GetAllUsersResp.class);
        return gatewayRequest;
    }

    public GatewayRequest getSingleUser(GetSingleUserReq singleUserReq){
        gatewayRequest.setBody(singleUserReq);
        gatewayRequest.setResponseObjectType(GetSingleUserResp.class);
        return gatewayRequest;
    }
}
