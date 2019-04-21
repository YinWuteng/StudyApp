package com.study;


import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.study.algorithm.AlgorithmActivity;
import com.study.android.AndroidActivity;
import com.study.base.BaseActivity;
import com.study.java.JavaActivity;
import com.study.kotlin.KotlinActivity;
import com.study.other.OtherActivity;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void findId() {

        Button btn_java = findViewById(R.id.btn_java);
        btn_java.setOnClickListener(this);

        Button btn_android = findViewById(R.id.btn_android);
        btn_android.setOnClickListener(this);

        Button btn_kotlin = findViewById(R.id.btn_kotlin);
        btn_kotlin.setOnClickListener(this);

        Button btn_alrthmetic = findViewById(R.id.btn_arithmetic);
        btn_alrthmetic.setOnClickListener(this);

        Button btn_other = findViewById(R.id.btn_other);
        btn_other.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.btn_java:
                intent.setClass(this, JavaActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_android:
                intent.setClass(this, AndroidActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_kotlin:
                intent.setClass(this, KotlinActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_arithmetic:
                intent.setClass(this, AlgorithmActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_other:
                intent.setClass(this, OtherActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
