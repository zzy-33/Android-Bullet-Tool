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
            .setTitle("Tips")
            .setContent("white Dialog with tips")
            .setConfirm("OK")
            .setCancel("Cancel")
            .setConfirmListener(View.OnClickListener {
                Log.e("AngryDialog", "confirm is onclick")
            })
            .create()
            .show()
    }

    fun white2(view: View) {
        AngryDialog.Builder(this)
            .setTitle("Tips")
            .setContent("white Dialog with tips")
            .setCancel("Cancel")
            .setCancelListener(View.OnClickListener {
                Log.e("AngryDialog", "cancel is onclick")
            })
            .create()
            .show()
    }

    fun white3(view: View) {
        AngryDialog.Builder(this)
            .setContent("white Dialog with tips")
            .setConfirm("OK")
            .setLineView(View.GONE, View.VISIBLE)
            .create()
            .show()
    }

    fun white4(view: View) {
        AngryDialog.Builder(this)
            .setContent("white Dialog with tips")
            .setConfirm("OK")
            .setCancel("Cancel")
            .create()
            .show()
    }

    fun purple1(view: View) {
            AngryDialog.Builder(this)
                .setTitle("Tips")
                .setContent("white Dialog with tips")
                .setConfirm("OK")
                .setCancel("Cancel")
                .setDialogBackground(R.drawable.shape_purple_5)
                .setTitleStyle(R.color.white)
                .setContentStyle(R.color.white)
                .setCancelStyle(R.color.white)
                .setConfirmStyle(R.color.white)
                .create()
                .show()
    }

    fun purple2(view: View) {
        AngryDialog.Builder(this)
            .setTitle("Tips")
            .setContent("white Dialog with tips")
            .setCancel("Cancel")
            .setLineView(View.GONE, View.VISIBLE)
            .setDialogBackground(R.drawable.shape_purple_5)
            .setTitleStyle(R.color.white)
            .setContentStyle(R.color.white)
            .setCancelStyle(R.color.white)
            .create()
            .show()
    }

    fun purple3(view: View) {
        AngryDialog.Builder(this)
            .setContent("white Dialog with tips")
            .setCancel("Cancel")
            .setLineView(View.GONE, View.VISIBLE)
            .setDialogBackground(R.drawable.shape_purple_5)
            .setTitleStyle(R.color.white)
            .setContentStyle(R.color.white)
            .setCancelStyle(R.color.white)
            .create()
            .show()
    }

    fun purple4(view: View) {
        AngryDialog.Builder(this)
            .setContent("white Dialog with tips")
            .setCancel("Cancel")
            .setConfirm("OK")
            .setDialogBackground(R.drawable.shape_purple_5)
            .setTitleStyle(R.color.white)
            .setContentStyle(R.color.white)
            .setCancelStyle(R.color.white)
            .setConfirmStyle(R.color.white)
            .create()
            .show()
    }

    fun red1(view: View) {
        AngryDialog.Builder(this)
            .setTitle("Tips")
            .setContent("white Dialog with tips")
            .setCancel("Cancel")
            .setConfirm("OK")
            .setLineView(View.INVISIBLE, View.GONE)
            .setButtonPadding(15, 5, 15, 30)
            .setCancelStyle(R.color.black_03, background = R.drawable.shape_gray_40)
            .setConfirmStyle(R.color.white, background = R.drawable.shape_red_40)
            .create()
            .show()
    }

    fun red2(view: View) {
        AngryDialog.Builder(this)
            .setTitle("Tips")
            .setContent("white Dialog with tips")
            .setConfirm("OK")
            .setLineView(View.INVISIBLE, View.GONE)
            .setButtonPadding(15, 5, 15, 30)
            .setConfirmStyle(R.color.white, background = R.drawable.shape_red_40)
            .create()
            .show()
    }

    fun red3(view: View) {
        AngryDialog.Builder(this)
            .setContent("white Dialog with tips")
            .setCancel("Cancel")
            .setConfirm("OK")
            .setLineView(View.INVISIBLE, View.GONE)
            .setButtonPadding(15, 5, 15, 30)
            .setCancelStyle(R.color.black_03, background = R.drawable.shape_gray_40)
            .setConfirmStyle(R.color.white, background = R.drawable.shape_red_40)
            .create()
            .show()
    }

    fun red4(view: View) {
        AngryDialog.Builder(this)
            .setContent("white Dialog with tips")
            .setConfirm("OK")
            .setLineView(View.INVISIBLE, View.GONE)
            .setButtonPadding(15, 5, 15, 30)
            .setConfirmStyle(R.color.white, background = R.drawable.shape_red_40)
            .create()
            .show()
    }
}