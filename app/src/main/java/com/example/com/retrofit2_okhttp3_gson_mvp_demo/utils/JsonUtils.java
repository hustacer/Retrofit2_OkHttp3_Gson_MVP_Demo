package com.example.com.retrofit2_okhttp3_gson_mvp_demo.utils;

import com.example.com.retrofit2_okhttp3_gson_mvp_demo.WeatherBean;
import com.google.gson.Gson;

public class JsonUtils {
    public static WeatherBean getWeather(String res) {
        Gson gson = new Gson();
        WeatherBean weatherBean = gson.fromJson(res, WeatherBean.class);
        return weatherBean;
    }
}
