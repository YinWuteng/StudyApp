package com.study.android;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.study.R;
import com.study.algorithm.AlgorithmWebActivity;
import com.study.base.BaseActivity;

/**
 * Android主体界面
 */
public class AndroidActivity extends BaseActivity implements View.OnClickListener {
    @Override
    protected int getLayoutId() {
        return R.layout.activity_android;
    }

    @Override
    protected void findId() {
        Button btnAndroidBase = findViewById(R.id.btn_android_base);
        Button btnAndroidCodeSource = findViewById(R.id.btn_android_code_source);
        Button btnAndroidOther = findViewById(R.id.btn_android_other);
        Button btnAndroidJVM = findViewById(R.id.btn_android_jvm);
        btnAndroidBase.setOnClickListener(this);
        btnAndroidCodeSource.setOnClickListener(this);
        btnAndroidOther.setOnClickListener(this);
        btnAndroidJVM.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.btn_android_base:
                intent.setClass(this, AlgorithmWebActivity.class);
                intent.putExtra("url", "https://github.com/YinWuteng/StudyApp/blob/master/app/src/main/java/com/study/android/android_base");
                startActivity(intent);
                break;
            case R.id.btn_android_code_source:
                intent.setClass(this, AlgorithmWebActivity.class);
                intent.putExtra("url", "https://github.com/YinWuteng/StudyApp/blob/master/app/src/main/java/com/study/android/android_code_source");
                startActivity(intent);
                break;
            case R.id.btn_android_other:
                intent.setClass(this, AlgorithmWebActivity.class);
                intent.putExtra("url", "https://github.com/YinWuteng/StudyApp/blob/master/app/src/main/java/com/study/android/android_other");
                startActivity(intent);
                break;
            case R.id.btn_android_jvm:
                intent.setClass(this, AlgorithmWebActivity.class);
                intent.putExtra("url", "https://github.com/YinWuteng/StudyApp/blob/master/app/src/main/java/com/study/android/android_jvm");
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
