package com.example.my_sdk

import android.content.Context
import android.widget.Toast

object MySdk {
    fun showMsg(context: Context){
        Toast.makeText(context, "MySdk", Toast.LENGTH_SHORT).show()
    }

    fun getSdk(): String{
        return  "MySdk"
    }
}