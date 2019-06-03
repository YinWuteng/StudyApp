package com.study;

import android.app.Application;


import com.study.util.SharedPreferenceUtils;

public class MyApplication extends Application {

    private static MyApplication instance;
    public MyApplication(){}
    public static MyApplication getInstance(){
        if (instance==null){
            instance=new MyApplication();
        }
        return instance;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        instance=this;
        SharedPreferenceUtils sharedPreferenceUtils=new SharedPreferenceUtils();
        sharedPreferenceUtils.saveLoginInfo("","",false);
    }


}
