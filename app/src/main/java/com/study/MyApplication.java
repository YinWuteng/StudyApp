package com.study;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        createInfo();
    }

    private void createInfo(){
        SharedPreferences preferences=getSharedPreferences("user_info", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=preferences.edit();
        editor.putString("user","");
        editor.putString("password","");
        //是否登录过
        editor.putBoolean("isLogin",false);
        editor.apply();
    }
}
