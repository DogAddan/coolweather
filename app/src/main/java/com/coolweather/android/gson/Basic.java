package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    @SerializedName("cid")
    public String weatherId;

    @SerializedName("location")
    public String cityName;
    private String parent_city;
    private String admin_area;
    private String cnty;
    private String lat;
    private String lon;
    private String tz;
}
