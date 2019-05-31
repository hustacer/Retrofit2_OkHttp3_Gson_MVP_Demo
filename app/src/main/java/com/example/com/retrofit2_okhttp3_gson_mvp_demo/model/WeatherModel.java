package com.example.com.retrofit2_okhttp3_gson_mvp_demo.model;

import com.example.com.retrofit2_okhttp3_gson_mvp_demo.WeatherBean;
import com.example.com.retrofit2_okhttp3_gson_mvp_demo.utils.OkhttpUtils;

public class WeatherModel implements IWeatherModel {

    @Override
    public void loadWeather(String url, final ILoadListener loadListener) {
        OkhttpUtils.ResultCallBack resultCallBack = new OkhttpUtils.ResultCallBack() {
            @Override
            public void getWeather(WeatherBean weatherBean) {
                loadListener.onSuccess(weatherBean);
            }

            @Override
            public void onFailure(Exception e) {
                loadListener.onFailure(e);
            }
        };
        OkhttpUtils.getResultCallBack(url, resultCallBack);
    }
}
