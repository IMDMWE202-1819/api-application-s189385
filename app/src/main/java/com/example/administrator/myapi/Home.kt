package com.example.administrator.myapi

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val MySearchButton = findViewById<Button>(R.id.searchbutton)

        MySearchButton.setOnClickListener{
            intent = Intent(this, searchandresults :: class.java)
            startActivity(intent)
        }
    }
}
