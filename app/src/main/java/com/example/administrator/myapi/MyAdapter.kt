package layout

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.administrator.myapi.R
import com.example.administrator.myapi.Track

class MyAdapter(val Tracks: ArrayList<Track>, val context: Context) : RecyclerView.Adapter<MyAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.ViewHolder{
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.tracks, parent, false))
    }

    override fun getItemCount() = Tracks.size

    override fun onBindViewHolder(holder: MyAdapter.ViewHolder, position: Int) {
        holder.bindTrack(Tracks[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val trackName: TextView = itemView.findViewById(R.id.tracks_track_name)
        private val trackLength: TextView = itemView.findViewById(R.id.tracks_track_length)

        fun bindTrack(track:Track) {
            trackName.text = track.name
            trackLength.text = track.length
        }
    }


}




