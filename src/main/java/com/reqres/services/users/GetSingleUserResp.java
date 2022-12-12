package com.reqres.services.users;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class GetSingleUserResp {
    @SerializedName("data")
    private Data data;

    @SerializedName("support")
    private Support support;

    @Getter
    public class Data{
        @SerializedName("id")
        private int id;

        @SerializedName("email")
        private String email;

        @SerializedName("first_name")
        private String first_name;

        @SerializedName("last_name")
        private String last_name;

        @SerializedName("avatar")
        private String avatar;
    }

    @Getter
    public class Support{

        @SerializedName("url")
        private String url;

        @SerializedName("text")
        private String text;
    }
}
