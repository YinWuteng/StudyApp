package com.study;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.study.base.BaseActivity;
import com.study.util.ToastUtils;

/**
 * 登录页面
 */
public class LoginActivity extends BaseActivity implements View.OnClickListener {

    private EditText ed_user;
    private EditText ed_password;
    private Button btnLogin;
    private ProgressBar login_progress_bar;
    @SuppressLint("HandlerLeak")
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            if (msg.what == 0) {
                login_progress_bar.setVisibility(View.GONE);
                checkNull(ed_user.getText().toString(), ed_password.getText().toString());
            }
        }
    };

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            Message message = new Message();
            message.what = 0;
            handler.handleMessage(message);
        }
    };

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void findId() {

        TextInputLayout tx_user_hint = findViewById(R.id.tx_user_hint);
        TextInputLayout tx_password_hin = findViewById(R.id.tx_password_hint);
        ed_user = findViewById(R.id.ed_user);
        ed_password = findViewById(R.id.ed_password);
        ed_user.setText("YinWuTeng");
        ed_password.setText("ywt@19930409");

        getUserInfo();
        tx_user_hint.setHint(getResources().getString(R.string.user));
        tx_password_hin.setHint(getResources().getString(R.string.password));

        btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(this);

        login_progress_bar = findViewById(R.id.login_progress_bar);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                login_progress_bar.setVisibility(View.VISIBLE);
                //登录动画
                showAnimation();
                handler.postDelayed(runnable, 2000);
                break;
            default:
                break;
        }
    }

    private void showAnimation() {
        Animation scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scaleanim);
        btnLogin.startAnimation(scaleAnimation);
    }

    private void checkNull(String user, String password) {
        if (null == user || null == password) {
            ToastUtils.showToast(this, getResources().getString(R.string.user_or_password_null));
        } else {
            login(user, password);
        }
    }

    private void login(String user, String password) {
        if (user.equals("YinWuTeng") && password.equals("ywt@19930409")) {
            saveData(user, password);
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        } else {
            ToastUtils.showToast(LoginActivity.this, getResources().getString(R.string.user_or_password_error));
        }
    }

    private void saveData(String user, String password) {
        SharedPreferences preferences = getSharedPreferences("user_info", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("user", user);
        editor.putString("password", password);
        editor.putBoolean("isLogin", true);
        editor.apply();
    }

    private void getUserInfo() {
        SharedPreferences preferences = getSharedPreferences("user_info", Context.MODE_PRIVATE);
        boolean isLogin = preferences.getBoolean("isLogin", false);
        if (isLogin) {
            ed_user.setText(preferences.getString("user", "user"));
            ed_password.setText(preferences.getString("password", "password"));
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacks(runnable);
    }
}
