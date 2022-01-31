package com.app.wallpaperwish.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.app.wallpaperwish.R
import com.app.wallpaperwish.adapters.WallpaperListingAdapter
import com.unsplash.pickerandroid.photopicker.UnsplashPhotoPicker
import com.unsplash.pickerandroid.photopicker.presentation.UnsplashPickerActivity
import kotlinx.android.synthetic.main.activity_wallpaper_listing.*

class WallpaperListing : AppCompatActivity() {

    val list = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wallpaper_listing)





        UnsplashPhotoPicker.init(
            application, // application
            "dAsC4eDB3l52Yc9SkFYjhZ8a6jcUl-zn3u17K_Zm3sg",
            "-hkfGFK9ym-uiRAiKM5_vDdNVwrpY4QIQUuwcp8IJ78"
            /* optional page size */
        )



        startActivityForResult(
            UnsplashPickerActivity.getStartingIntent(
                this, // context
                isMultipleSelection
            ), REQUEST_CODE
        )



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