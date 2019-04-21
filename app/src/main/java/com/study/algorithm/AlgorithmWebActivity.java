package com.study.algorithm;

import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;

import com.study.R;
import com.study.base.BaseActivity;

/**
 * 算法网页
 */
public class AlgorithmWebActivity extends BaseActivity {
    private WebView url_web;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_algorithm_web;
    }

    @Override
    protected void findId() {
        final ProgressBar web_progress = findViewById(R.id.web_progress);
        web_progress.setVisibility(View.VISIBLE);

        url_web = findViewById(R.id.web_algorithm);
        //声明webSetting子类,配置webSetting
        WebSettings web_settings = url_web.getSettings();
        //设置自适应屏幕
        web_settings.setUseWideViewPort(true); //将图片调整到适合webView的大小
        web_settings.setLoadWithOverviewMode(true);//缩放至屏幕的大小
        //支持缩放
        web_settings.setSupportZoom(true);
        web_settings.setBuiltInZoomControls(true);
        web_settings.setDisplayZoomControls(false);

        String url = getIntent().getStringExtra("url");
        if (null != url) {
            url_web.loadUrl(url);
        }

        //设置webView进度监听
        url_web.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                web_progress.setProgress(newProgress);
                if (newProgress == 100) {
                    //加载完成隐藏进度条
                    web_progress.setVisibility(View.GONE);
                }
                super.onProgressChanged(view, newProgress);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        url_web.clearCache(true);
    }
}
