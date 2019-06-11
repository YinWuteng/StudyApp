package com.study.other


import android.content.Intent
import android.view.View
import android.view.View.OnClickListener
import com.study.R
import com.study.R.layout.activity_other
import com.study.algorithm.AlgorithmWebActivity
import com.study.kt.BaseActivity
import kotlinx.android.synthetic.main.activity_other.*

/**
 * 其他界面
 */
class OtherActivity : BaseActivity(), OnClickListener {


    override fun layoutId(): Int {
        return activity_other
    }

    override fun findViewById() {
        btn_android_interview.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_android_interview -> goOther()
        }
    }

    private fun goOther() {
        val intent = Intent()
        intent.setClass(this, AlgorithmWebActivity::class.java)
        intent.putExtra("url", "https://www.androidos.net.cn/codebook/AndroidRoad/README.md")
        startActivity(intent)
    }
}