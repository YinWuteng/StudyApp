package com.study.kt

import android.app.Application

class MyApplication:Application() {

    /**
     * 静态内部类单例写法
     */
    companion object{
        fun  getInstance()=Helper.instance
    }

    private object Helper{
        val instance=MyApplication()
    }
    override fun onCreate() {
        super.onCreate()

    }
}