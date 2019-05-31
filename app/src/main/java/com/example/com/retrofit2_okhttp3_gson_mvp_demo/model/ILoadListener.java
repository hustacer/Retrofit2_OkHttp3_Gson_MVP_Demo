package com.example.com.retrofit2_okhttp3_gson_mvp_demo.model;

import com.example.com.retrofit2_okhttp3_gson_mvp_demo.WeatherBean;

public interface ILoadListener {
    void onSuccess(WeatherBean bean);
    void onFailure(Exception e);
}
