package com.example.com.retrofit2_okhttp3_gson_mvp_demo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IRetrofitService {
    /*
    https://www.apiopen.top/weatherApi?city=%E6%88%90%E9%83%BD
    https://www.apiopen.top/weatherApi?city=%E5%8C%97%E4%BA%AC
    https://www.apiopen.top/weatherApi?city=%E5%B9%BF%E5%B7%9E
     */
    @GET("weatherApi")
    Call<WeatherBean> getWeather(@Query("city")String city);

    /*
    https://www.apiopen.top/novelInfoApi?name=%E7%9B%97%E5%A2%93%E7%AC%94%E8%AE%B0
     */
    @GET("novelInfoApi")
    Call<BookBean> getBook(@Query("name")String name);
}
