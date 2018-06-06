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


    public String wind_deg;
    @SerializedName("wind_dir")
    public String wind_direction;
    @SerializedName("wind_sc")
    public String wind_power;
    @SerializedName("wind_spd")
    public String wind_speed;
}
