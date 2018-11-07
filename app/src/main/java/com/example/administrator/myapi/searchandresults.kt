package com.example.administrator.myapi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.beust.klaxon.Klaxon
import khttp.async
import kotlinx.android.synthetic.main.activity_searchandresults.*
import layout.MyAdapter
import org.w3c.dom.Text


class searchandresults : AppCompatActivity() {

    val searchUrl = "https://api.deezer.com/search/artist?q="

    var ListOfTracks = arrayListOf<Track>()
    lateinit var adapter:MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searchandresults)

        adapter = MyAdapter(ListOfTracks, this)

        track_recyclerView.adapter = adapter

        track_recyclerView.layoutManager = LinearLayoutManager(this)

    }
    fun PopulateTracks(view:View) {
        async.get(searchUrl + artistname.text.toString(), onResponse = {
            // use klaxon to parse the response (this.text)
            // Klaxon().converter(MyConverter()).parse(this.text)
        })

        var i = 100

       while (i != 1)
       {
           ListOfTracks.add(Track(i.toString(), i.toString()))
           i -= 1
       }

        adapter.notifyDataSetChanged()
    }

}
