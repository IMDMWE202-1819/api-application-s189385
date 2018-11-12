package layout

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.administrator.myapi.R
import com.example.administrator.myapi.Track
//This kotlin file is the adapter for the recycler view enabling us to dynamically create view holders based on our requirements.
//Using a recycler view enables us to dynamically manage memory by removing unwanted items as new items are created.

//Declaring a class taking and passing in values for the data, context and recycler view in which it will be placing the layout files.
class MyAdapter(val Tracks: ArrayList<Track>, val context: Context) : RecyclerView.Adapter<MyAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.ViewHolder{
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.tracks, parent, false))
    }

    //Sets the count equal to he number of tracks in the list tracks
    override fun getItemCount() = Tracks.size

    //
    override fun onBindViewHolder(holder: MyAdapter.ViewHolder, position: Int) {
        holder.bindTrack(Tracks[position])
    }

    //Setting the data equal the the track being held by the Viewholder
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val trackName: TextView = itemView.findViewById(R.id.tracks_track_name)
        private val trackLength: TextView = itemView.findViewById(R.id.tracks_track_length)

        //Binds the data from each track to fields within the class
        fun bindTrack(track:Track) {

            trackName.text = track.title_short
            trackLength.text =  ConvertToMinutes(track.duration!!)
        }

        fun ConvertToMinutes(seconds: Int): String {
            var Minutes = seconds / 60
            return Minutes.toString()
        }


    }


}




