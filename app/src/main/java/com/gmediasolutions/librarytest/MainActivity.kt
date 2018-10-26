package com.gmediasolutions.librarytest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.gmediasolutions.toastlibrary.MsgDisplay
import com.gmediasolutions.toastlibrary.showToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showToast(this,"Show 1st toast")
        tv.setOnClickListener(View.OnClickListener {
            MsgDisplay(this,"Display message",15,1)
        })

    }
}
