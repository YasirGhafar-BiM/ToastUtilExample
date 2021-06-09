package com.techlads.toasterlib

import android.content.Context
import android.widget.Toast

object ToastMessage {
    fun s(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}