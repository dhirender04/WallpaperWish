package com.app.wallpaperwish.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.app.wallpaperwish.R
import com.app.wallpaperwish.adapters.WallpaperListingAdapter
import kotlinx.android.synthetic.main.activity_wallpaper_listing.*

class WallpaperListing : AppCompatActivity() {

    val list = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wallpaper_listing)

        //color listing
        list.add(resources.getColor(R.color.black))
        list.add(resources.getColor(R.color.blue))
        list.add(resources.getColor(R.color.green))
        list.add(resources.getColor(R.color.rose))
        list.add(resources.getColor(R.color.red))
        list.add(resources.getColor(R.color.yellow))
        setAdapter()

    }



    private  fun setAdapter(){
        val adapterView = WallpaperListingAdapter()
        rvWallpaperListing.adapter = adapterView
    }
}