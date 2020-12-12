package com.example.android_tool

import android.os.Bundle
import android.util.Log
import android.view.View
import com.component.AngryDialog

/**
 * Created by Jordan on 2020/12/12.
 */
class DialogActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_dialog)
        setToolbar(getString(R.string.angryDialog))
    }

    fun white1(view: View) {
        AngryDialog.Builder(this)
            .setDialogTheme("white")
            .setTitle("Tips")
            .setContent("white Dialog with tips")
            .setConfirmListener(View.OnClickListener {
                Log.e("AngryDialog","confirm is onclick")
            })
            .setCancelListener(View.OnClickListener {
                Log.e("AngryDialog","cancel is onclick")
            })
            .create()
            .show()
    }

    fun white2(view: View) {
        AngryDialog.Builder(this)
            .setDialogTheme("white")
            .setTitle("Tips")
            .setContent("white Dialog with tips")
            .setConfirm("")
            .create()
            .show()
    }

    fun white3(view: View) {
        AngryDialog.Builder(this)
            .setDialogTheme("white")
            .setContent("white Dialog with tips")
            .create()
            .show()
    }

    fun white4(view: View) {
        AngryDialog.Builder(this)
            .setDialogTheme("white")
            .setContent("white Dialog with tips")
            .setConfirm("")
            .create()
            .show()
    }

    fun purple1(view: View) {
        AngryDialog.Builder(this)
            .setDialogTheme("purple")
            .setTitle("Tips")
            .setContent("white Dialog with tips")
            .create()
            .show()
    }

    fun purple2(view: View) {
        AngryDialog.Builder(this)
            .setDialogTheme("purple")
            .setContent("white Dialog with tips")
            .create()
            .show()
    }

    fun purple3(view: View) {
        AngryDialog.Builder(this)
            .setDialogTheme("purple")
            .setContent("white Dialog with tips")
            .setConfirm("")
            .create()
            .show()
    }

    fun red1(view: View) {
        AngryDialog.Builder(this)
            .setDialogTheme("red")
            .setTitle("Tips")
            .setContent("white Dialog with tips")
            .create()
            .show()
    }

    fun red2(view: View) {
        AngryDialog.Builder(this)
            .setDialogTheme("red")
            .setContent("white Dialog without the tips")
            .setCancel("")
            .create()
            .show()
    }

    fun red3(view: View) {
        AngryDialog.Builder(this)
            .setDialogTheme("red")
            .setContent("white Dialog without the tips")
            .create()
            .show()
    }

}