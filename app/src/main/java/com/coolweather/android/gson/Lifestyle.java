package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Lifestyle {
    public String brf;
    @SerializedName("txt")
    public String text;
    @SerializedName("type")
    public String lifeStyleType;
}
