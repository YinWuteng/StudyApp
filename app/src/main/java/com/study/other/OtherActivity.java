package com.study.other;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.study.R;
import com.study.algorithm.AlgorithmWebActivity;
import com.study.base.BaseActivity;

/**
 * 其他界面
 */
public class OtherActivity extends BaseActivity implements View.OnClickListener {
    @Override
    protected int getLayoutId() {
        return R.layout.activity_other;
    }

    @Override
    protected void findId() {
        Button btnAndInterview = findViewById(R.id.btn_android_interview);
        btnAndInterview.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_android_interview:
                Intent intent = new Intent();
                intent.setClass(this, AlgorithmWebActivity.class);
                intent.putExtra("url", "https://www.androidos.net.cn/codebook/AndroidRoad/README.md");
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
