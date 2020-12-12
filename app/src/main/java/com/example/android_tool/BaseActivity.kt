package com.example.android_tool

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by Jordan on 2020/12/12.
 */
open class BaseActivity : AppCompatActivity() {

    fun setToolbar(title: String) {
        findViewById<TextView>(R.id.toolbar_title).text = title
        findViewById<ImageView>(R.id.toolbar_button).setOnClickListener {
            finish()
        }
    }
}