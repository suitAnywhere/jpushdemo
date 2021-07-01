package com.demo.jpushdemo;

import android.app.Application;
import android.util.Log;

import cn.jpush.android.api.JPushInterface;

/**
 * @author: liercheng
 * @date: 2021/7/1
 * @description:
 */
public class Appl extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
        String registrationID = JPushInterface.getRegistrationID(this);
        Log.d("TAG", "onCreate: "+registrationID);//18071adc03a088f0d7f
    }
}
