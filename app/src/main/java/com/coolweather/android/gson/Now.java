package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
    private String cond_code;
    public String cond_txt;
    private String fl;
    private String hum;
    private String pcpn;
    private String pres;
    @SerializedName("tmp")
    public String temperature;
    private String vis;
    private String wind_deg;
    private String wind_dir;
    private String wind_sc;
    private String wind_spd;
}
