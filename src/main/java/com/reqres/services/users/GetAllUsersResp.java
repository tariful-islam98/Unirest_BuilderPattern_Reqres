package com.reqres.services.users;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

@Getter
public class GetAllUsersResp {

    @SerializedName("page")
    private int page;

    @SerializedName("per_page")
    private int per_page;

    @SerializedName("total")
    private int total;

    @SerializedName("total_pages")
    private int total_pages;

    @SerializedName("data")
    private List<Data> data;

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
