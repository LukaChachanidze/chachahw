package com.example.newapp



import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class imageAdapter(private var urls:List<Images>, private val context:Context): RecyclerView.Adapter<imageAdapter.ImageViewHolder>() {

    class ImageViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val imageView:ImageView = itemView.findViewById(R.id.imageView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.photos, parent, false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val pos = urls[position]

        Glide.with(context)
            .load(pos.url)
            .placeholder(R.drawable.ic_launcher_background)
            .centerCrop()
            .into(holder.imageView)



    }

    override fun getItemCount(): Int  = urls.size

}
