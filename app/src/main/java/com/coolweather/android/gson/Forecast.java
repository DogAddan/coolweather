package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {
    private String cond_code_d;
    private String cond_code_n;
    public String cond_txt_d;
    private String cond_txt_n;
    public String date;
    private String hum;
    private String pcpn;
    private String pop;
    private String pres;
    @SerializedName("tmp_max")
    public String temperature_max;
    @SerializedName("tmp_min")
    public String temperature_min;
    private String uv_index;
    private String vis;
    private String wind_deg;
    private String wind_dir;
    private String wind_sc;
    private String wind_spd;
}
