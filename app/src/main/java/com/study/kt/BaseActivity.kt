package com.study.kt

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId())
        findViewById()
    }

    protected abstract fun layoutId():Int
    protected abstract fun findViewById()

}