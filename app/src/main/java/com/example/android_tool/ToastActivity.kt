package com.example.android_tool

import android.os.Bundle
import android.util.Log
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

    fun white1(view: View) {
        AngryToast.Builder(this)
            .setContent("测试数据")
            .create()
            .show()
    }

    fun white2(view: View) {

    }

    fun white3(view: View) {

    }
}