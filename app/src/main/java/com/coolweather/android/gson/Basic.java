package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    @SerializedName("city")
    public String cityName;   //城市名

    @SerializedName("id")
    public String weatherId; //天气id

    public Update update;

    public  class Update{

        @SerializedName("loc")
        public String UpdateTime;    //更新时间
    }
}
