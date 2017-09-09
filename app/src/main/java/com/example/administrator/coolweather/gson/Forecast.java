package com.example.administrator.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/8/30.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Tenperature tenperature;

    @SerializedName("cond")
    public More more;

    public class Tenperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("text_d")
        public String info;
    }
}
