package com.example.administrator.myapi

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.graphics.Typeface
import khttp.async
import java.util.concurrent.Delayed
import java.util.concurrent.TimeUnit
import kotlin.concurrent.thread
import kotlin.concurrent.timer
import java.util.*
import kotlin.concurrent.schedule


class Welcome : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)


        Timer().schedule(10000){
            StartHome()
        }

    }

    fun StartHome()
    {
        intent = Intent(this, Home::class.java)
        startActivity(intent)
    }

}
