package com.example.com.retrofit2_okhttp3_gson_mvp_demo.presenter;

import com.example.com.retrofit2_okhttp3_gson_mvp_demo.IWeatherView;
import com.example.com.retrofit2_okhttp3_gson_mvp_demo.WeatherBean;
import com.example.com.retrofit2_okhttp3_gson_mvp_demo.model.ILoadListener;
import com.example.com.retrofit2_okhttp3_gson_mvp_demo.model.IWeatherModel;
import com.example.com.retrofit2_okhttp3_gson_mvp_demo.model.WeatherModel;

public class WeatherPresenter implements IWeatherPresenter,ILoadListener {
    private String url = "http://t.weather.itboy.net/api/weather/city/";

    private IWeatherView iWeatherView;
    private IWeatherModel iWeatherModel;

    public WeatherPresenter(IWeatherView iWeatherView) {
        this.iWeatherView = iWeatherView;
        this.iWeatherModel = new WeatherModel();
    }

    @Override
    public void loadWeather(String city) {
        iWeatherView.showProgress();
        iWeatherModel.loadWeather(url+city, this);
    }

    @Override
    public void onSuccess(WeatherBean bean) {
        iWeatherView.hideProgress();
        iWeatherView.showWeatherData(bean);
    }

    @Override
    public void onFailure(Exception e) {
        iWeatherView.hideProgress();
        iWeatherView.showLoadFailMsg(e);
    }
}
