package com.example.com.retrofit2_okhttp3_gson_mvp_demo.utils;

import android.util.Log;

import com.example.com.retrofit2_okhttp3_gson_mvp_demo.WeatherBean;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkhttpUtils {
    private static OkhttpUtils mOkhttpUtils;
    String res = null;

    private synchronized static OkhttpUtils getInstance(){
        if(mOkhttpUtils == null) {
            mOkhttpUtils = new OkhttpUtils();
        }

        return mOkhttpUtils;
    }

    public interface ResultCallBack {
        void getWeather(WeatherBean weatherBean);
        void onFailure(Exception e);
    }

    public static void  getResultCallBack(String url, ResultCallBack resultCallBack) {
        getInstance().sendRequest(url, resultCallBack);
    }

    public void sendRequest(String url, final ResultCallBack resultCallBack) {
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(2, TimeUnit.SECONDS)
                .build();

        final Request request = new Request.Builder()
                .url(url)
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                if (resultCallBack != null) {
                    resultCallBack.onFailure(e);
                }
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                res = response.body().string();
                Log.i("OkhttpUtils res = ", res);
                WeatherBean bean = JsonUtils.getWeather(res);
                if (resultCallBack != null) {
                    resultCallBack.getWeather(bean);
                }
            }
        });
    }

}
