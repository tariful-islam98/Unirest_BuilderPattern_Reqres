package com.reqres.services.users;

import com.mashape.unirest.http.HttpMethod;
import com.reqres.base.AbstractHttpSpecification;
import com.reqres.base.Properties;
import lombok.Builder;

@Builder
public class GetAllUsersReq extends AbstractHttpSpecification {
    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.GET;
    }

    @Override
    protected String getEndpointUrl() {
        return Properties.REQRES_API + "/users";
    }
}
