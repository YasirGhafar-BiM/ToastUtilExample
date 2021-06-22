package com.techlads.toastutilexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.techlads.toasterlib.ToastMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToastMessage.s(this, "Used Example Lib to show this Toast")

    }
}