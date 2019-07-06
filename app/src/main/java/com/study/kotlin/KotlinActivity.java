package com.study.kotlin;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.study.R;
import com.study.algorithm.AlgorithmWebActivity;
import com.study.base.BaseActivity;

/**
 * kotlin知识
 */
public class KotlinActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_kotlin;
    }

    @Override
    protected void findId() {
        Button btnKtBase = findViewById(R.id.btn_kt_base);
        btnKtBase.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_kt_base:
                Intent intent = new Intent();
                intent.setClass(this, AlgorithmWebActivity.class);
                intent.putExtra("url", "https://github.com/YinWuteng/StudyApp/blob/master/app/src/main/java/com/study/kotlin/kt_base");
                startActivity(intent);
                break;
        }
    }
}
