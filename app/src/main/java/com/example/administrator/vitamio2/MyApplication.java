package com.example.administrator.vitamio2;

import android.app.Application;

import io.vov.vitamio.Vitamio;

/**
 * Created by apple on 2017/7/25.
 */

/**

 * Created by

 孙沛林

 on 2016/7/1.



 */

public class MyApplication extends Application {

    @Override

    public void onCreate() {

        super.onCreate();

        Vitamio.isInitialized(this);//



    }

}