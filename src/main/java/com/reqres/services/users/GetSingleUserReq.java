package com.reqres.services.users;

import com.mashape.unirest.http.HttpMethod;
import com.reqres.base.AbstractHttpSpecification;
import com.reqres.base.Properties;
import lombok.Builder;
import lombok.Setter;
import lombok.experimental.Accessors;

@Builder
@Accessors(chain = true)
public class GetSingleUserReq extends AbstractHttpSpecification {
    @Setter
    private transient String id;

    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.GET;
    }

    @Override
    protected String getEndpointUrl() {
        return Properties.REQRES_API + "/users/" +id;
    }
}
