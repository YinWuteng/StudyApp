package com.study.kt

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity() {
    protected abstract val layout:Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layoutId=layout
        setContentView(layoutId)
        findViewById()
    }

    protected abstract fun findViewById()

}