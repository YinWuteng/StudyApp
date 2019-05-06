package com.study.java;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.study.R;
import com.study.algorithm.AlgorithmWebActivity;
import com.study.base.BaseActivity;

/**
 * Java基础
 */
public class JavaActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_java;
    }

    @Override
    protected void findId() {
        Button btnJavaBase = findViewById(R.id.btn_java_base);
        Button btnJavaDeepSource = findViewById(R.id.btn_deep_source);
        Button btnDataStructure = findViewById(R.id.btn_data_structe);
        Button btnThreadPool = findViewById(R.id.btn_thread_pool);

        btnJavaBase.setOnClickListener(this);
        btnJavaDeepSource.setOnClickListener(this);
        btnDataStructure.setOnClickListener(this);
        btnThreadPool.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent();
        switch (v.getId()) {

            case R.id.btn_java_base: //java基础
                intent.setClass(this, AlgorithmWebActivity.class);
                intent.putExtra("url","https://github.com/YinWuteng/StudyApp/blob/master/app/src/main/java/com/study/java_base");
                startActivity(intent);
                break;
            case R.id.btn_deep_source: //java深入源码
                intent.setClass(this, AlgorithmWebActivity.class);
                intent.putExtra("url","https://github.com/YinWuteng/StudyApp/blob/master/app/src/main/java/com/study/java_depe_source");
                startActivity(intent);
                break;
            case R.id.btn_data_structe: //java数据结构
                intent.setClass(this, AlgorithmWebActivity.class);
                intent.putExtra("url","https://github.com/YinWuteng/StudyApp/blob/master/app/src/main/java/com/study/data_structure");
                startActivity(intent);
                break;
            case R.id.btn_thread_pool: //java线程
                intent.setClass(this, AlgorithmWebActivity.class);
                intent.putExtra("url","https://github.com/YinWuteng/StudyApp/blob/master/app/src/main/java/com/study/thread_pool");
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
