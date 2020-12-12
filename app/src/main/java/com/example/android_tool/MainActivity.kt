package com.example.android_tool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.component.AngryDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun dialog(view: View) {
        AngryDialog.Builder(this)
            .setDialogTheme("white")
            .create()
            .show()
    }
}