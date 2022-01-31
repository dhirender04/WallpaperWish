package com.app.wallpaperwish.adapters



import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

import androidx.recyclerview.widget.RecyclerView
import com.app.wallpaperwish.R
import com.squareup.picasso.Picasso
import com.unsplash.pickerandroid.photopicker.data.UnsplashPhoto

class WallpaperListingAdapter (val photoslist: ArrayList<UnsplashPhoto>?) :RecyclerView.Adapter<WallpaperListingAdapter.ListingViewHolder>()   {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListingViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_wallpaper_listing, parent, false)

        return ListingViewHolder(view)

     }

    override fun onBindViewHolder(holder: ListingViewHolder, position: Int) {


//        Picasso.get().load(R.drawable.dummy).into(holder.image)
        Picasso.get().load(photoslist?.get(position)?.color).into(holder.image)
     }

    override fun getItemCount(): Int {
        return photoslist!!.size
     }

    class ListingViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val image = itemView.findViewById<ImageView>(R.id.list_image)


    }
}