package com.example.myrest;

import android.app.Application;

public class MyApp extends Application {

    private static MyApp instance;

    public static synchronized MyApp getInstance() {
        return instance;
    }

    private MyRetrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;

    }

    public MyRetrofit getRestApi() {

        if (retrofit == null) {
            retrofit = MyRetrofit.Factory.create();
        }

        return retrofit;
    }
}
