package layout

import android.support.v7.app.AppCompatActivity
import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.view.menu.MenuView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.administrator.myapi.R
import com.example.administrator.myapi.R.id.parent
import com.example.administrator.myapi.Track

class MyAdapter(val users: ArrayList<Track>) : RecyclerView.Adapter<MyAdapter.ViewHolder>(){

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyAdapter.ViewHolder {
    }

    override fun getItemCount() = users.size

    override fun onBindViewHolder(p0: MyAdapter.ViewHolder, p1: Int) {

    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }


}




