package com.example.administrator.myapi
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.beust.klaxon.*
import com.beust.klaxon.Klaxon
import com.google.gson.Gson
import khttp.async
import khttp.async.Companion.get
import khttp.get
import kotlinx.android.synthetic.main.activity_searchandresults.*
import layout.MyAdapter
import org.w3c.dom.Text
import kotlinx.android.parcel.Parcelize
import android.graphics.ColorSpace.Model



//This is the kotlin file used for the search and results page. this will contain all code relating to onclick events.
//Furthermore it will contain all code relating to the calling of recyclerview methods and Deezer api functionality


class searchandresults : AppCompatActivity() {

    //Declaring values to be referenced during runtime
    var SearchUrlforArist = "https://api.deezer.com/search/artist?q="
    var ListOfTracks = arrayListOf<Track>()

    //Late init tells the system that this variable is to be assigned to during runtime however needs to be non-null.
    lateinit var adapter:MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searchandresults)

        //Passing adapter list of tracks which will enable each view holder to be created.
        adapter = MyAdapter(ListOfTracks, this)

        //Declaring the adapter to be used with the referenced recycler view.
        track_recyclerView.adapter = adapter

        //Setting the layout type to linear layout.
        track_recyclerView.layoutManager = LinearLayoutManager(this)

    }
    //This function sends a get request to the Deezer api and builds a list of tracks with the response which are to be passed to the recycler view adapter.
    fun PopulateTracks(view:View) {

      async.get(SearchUrlforArist + artistname.text, onResponse = {


          var gson = Gson()
          var artistdata = this.text
          var testModel = gson.fromJson(artistdata, ArtistSearch::class.java)



            async.get("https://api.deezer.com/artist/${testModel.data[0].id}/top", onResponse = {
                var trackModel = gson.fromJson(this.text, ArtistTracks::class.java)
                for (track in trackModel.data) {
                    ListOfTracks.add(track)
                }

                runOnUiThread { adapter.notifyDataSetChanged() }
            })






        })
        adapter.notifyDataSetChanged()


    }

}
