package com.study.util;

import android.content.Context;
import android.content.SharedPreferences;

import com.study.MyApplication;

public class SharedPreferenceUtils {

    private static SharedPreferenceUtils ourInstance;

    public static SharedPreferenceUtils getInstance() {
        if (ourInstance == null) {
            ourInstance = new SharedPreferenceUtils();
        }
        return ourInstance;
    }

    public SharedPreferenceUtils() {

    }


    public void saveLoginInfo(String user, String password, Boolean isLogin) {
        SharedPreferences preferences = MyApplication.getInstance().getSharedPreferences("user_info", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("user", user);
        editor.putString("password", password);
        //是否登录过
        editor.putBoolean("isLogin", isLogin);
        editor.apply();
    }

    public boolean getLoginState() {

        SharedPreferences preferences = MyApplication.getInstance().getSharedPreferences("user_info", Context.MODE_PRIVATE);
        return preferences.getBoolean("isLogin", false);
    }
}
