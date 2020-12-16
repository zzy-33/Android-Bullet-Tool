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
            .setIconFont("warn")
            .setContent("测试数据")
            .show()
    }

    fun purple2(view: View) {
        AngryToast.Builder(this)
            .setContent("测试数据")
            .setIcon(R.drawable.arrow_back)
            .show()
    }

    fun purple3(view: View) {
        AngryToast.Builder(this)
            .setContent("测试数据")
            .setTopIcon(R.drawable.arrow_back)
            .setGravity(Gravity.CENTER, 0, 0)
            .show()
    }
}