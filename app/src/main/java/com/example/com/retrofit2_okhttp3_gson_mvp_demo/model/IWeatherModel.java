package com.example.com.retrofit2_okhttp3_gson_mvp_demo.model;

public interface IWeatherModel {
    void loadWeather(String url, ILoadListener loadListener);
}
