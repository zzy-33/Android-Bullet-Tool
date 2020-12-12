package com.example.android_tool

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
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

    fun whiteDialog(view: View) {
        AngryDialog.Builder(this)
            .setDialogTheme("white")
            .create()
            .show()
    }

}