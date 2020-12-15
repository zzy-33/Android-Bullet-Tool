package com.example.android_tool

import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import com.component.AngryToast

/**
 * Created by Jordan on 2020/12/15.
 */
class ToastActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_toast)
        setToolbar("AngryToast")
    }

    fun purple1(view: View) {
        AngryToast.Builder(this)
            .setContent("测试数据")
            .create()
            .show()
    }

    fun purple2(view: View) {
        AngryToast.Builder(this)
            .setContent("测试数据")
            .setTopIcon(R.drawable.arrow_back)
            .setGravity(Gravity.CENTER, 0, 0)
            .create()
            .show()
    }

    fun purple3(view: View) {
        val view = LayoutInflater.from(this).inflate(com.example.tool.R.layout.angry_toast, null)
        AngryToast.Builder(this)
            .setView(view)
            .create()
            .show()
    }
}