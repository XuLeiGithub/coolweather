package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {

    public String status;    //返回状态

    public Basic basic;      //基本信息

    public  AQI aqi;         //空气指数

    public  Now now;         //当前天气

    public Suggestion suggestion;    //天气建议

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
