package com.example.com.retrofit2_okhttp3_gson_mvp_demo;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.com.retrofit2_okhttp3_gson_mvp_demo.presenter.WeatherPresenter;

import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements IWeatherView, View.OnClickListener{
    private TextView tvWeather;
    private TextView tvWeatherYes;
    private TextView tvWeatherFore;
    private ProgressDialog progressDialog;
    private WeatherPresenter weatherPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btGZsearch = (Button) findViewById(R.id.gz_search);
        Button btBJsearch = (Button) findViewById(R.id.bj_search);
        tvWeather = (TextView)findViewById(R.id.tv_weather);
        tvWeatherYes = (TextView)findViewById(R.id.tv_weather_yesterday);
        tvWeatherFore = (TextView)findViewById(R.id.tv_weather_forecast);
        weatherPresenter = new WeatherPresenter(this);
        btBJsearch.setOnClickListener(this);
        btGZsearch.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bj_search:
                weatherPresenter.loadWeather("101030100");
                break;
            case R.id.gz_search:
                weatherPresenter.loadWeather("101030100");
                break;
            default:
                break;
        }

    }

    @Override
    public void showProgress() {
        if(progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }

        progressDialog = ProgressDialog.show(MainActivity.this, "", "Getting...");
    }

    @Override
    public void hideProgress() {
        if(progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }

    @Override
    public void showWeatherData(final WeatherBean weatherBean) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (weatherBean.getStatus() != 200) {
                    Toast.makeText(MainActivity.this, weatherBean.getMessage(), Toast.LENGTH_LONG).show();
                } else {
                    tvWeather.setText("City:" + weatherBean.getCityInfo().getCity() + " Date:" + weatherBean.getDate()
                    + " Temperature:" + weatherBean.getData().getWendu());
                    tvWeatherYes.setText("Yesterday Temperature:" + weatherBean.getData().getYesterday().getLow()
                            + " ~ "  + weatherBean.getData().getYesterday().getHigh());
                    tvWeatherFore.setText("Tomorrow Temperature:" + weatherBean.getData().getForecast().get(0).getLow()
                            + " ~ "  + weatherBean.getData().getForecast().get(0).getHigh());
                }
            }
        });

    }

    @Override
    public void showLoadFailMsg(final Exception e) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                tvWeather.setText("Fail to load data:" + e.toString());
            }
        });
    }
}
