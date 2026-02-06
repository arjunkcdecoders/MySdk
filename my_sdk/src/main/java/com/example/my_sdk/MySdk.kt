package com.example.my_sdk

import android.content.Context
import android.widget.Toast
import kotlin.random.Random

object MySdk {
    fun showMsg(context: Context){
        Toast.makeText(context, "MySdk", Toast.LENGTH_SHORT).show()
    }

    fun getSdk(): String{
        return  "MySdk"
    }

    // New method to generate random color
    fun getRandomColor(): String {
        val red = Random.nextInt(256)
        val green = Random.nextInt(256)
        val blue = Random.nextInt(256)
        // Return color in hex format (e.g., "#FF5733")
        return String.format("#%02X%02X%02X", red, green, blue)
    }
}