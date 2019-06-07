package com.example.com.retrofit2_okhttp3_gson_mvp_demo.model;

import android.util.Log;

import com.example.com.retrofit2_okhttp3_gson_mvp_demo.RetrofitHelper;
import com.example.com.retrofit2_okhttp3_gson_mvp_demo.UrlApi;
import com.example.com.retrofit2_okhttp3_gson_mvp_demo.WeatherBean;
import com.example.com.retrofit2_okhttp3_gson_mvp_demo.utils.OkhttpUtils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WeatherModel implements IWeatherModel {

    @Override
    public void loadWeather(String url, final ILoadListener loadListener) {
//        OkhttpUtils.ResultCallBack resultCallBack = new OkhttpUtils.ResultCallBack() {
//            @Override
//            public void getWeather(WeatherBean weatherBean) {
//                loadListener.onSuccess(weatherBean);
//            }
//
//            @Override
//            public void onFailure(Exception e) {
//                loadListener.onFailure(e);
//            }
//        };
//        OkhttpUtils.getResultCallBack(url, resultCallBack);

        RetrofitHelper retrofitHelper = new RetrofitHelper(UrlApi.WEATHER_HOST);
        retrofitHelper.getWeather(url).enqueue(new Callback<WeatherBean>() {
            @Override
            public void onResponse(Call<WeatherBean> call, Response<WeatherBean> response) {
                loadListener.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<WeatherBean> call, Throwable t) {
                loadListener.onFailure((Exception) t);
            }
        });


    }
}
