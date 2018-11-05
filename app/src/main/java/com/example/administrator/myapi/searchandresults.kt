package com.example.administrator.myapi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.widget.Button
import android.widget.TextView
import com.beust.klaxon.Klaxon
import kotlinx.android.synthetic.main.activity_searchandresults.*
import org.w3c.dom.Text


class searchandresults : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searchandresults)

        val MySubmitButton = findViewById<Button>(R.id.submitbutton)
        val MyRecyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        MySubmitButton.setOnClickListener{
            val ArtistName = findViewById<TextView>(R.id.artistname).text.toString()
            println(ArtistName)
        }
    }




    
}
