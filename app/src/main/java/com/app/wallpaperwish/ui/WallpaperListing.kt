package com.app.wallpaperwish.ui

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.viewpager2.widget.ViewPager2
import com.app.wallpaperwish.MainActivity
import com.app.wallpaperwish.R
import com.app.wallpaperwish.UnplashApplication
import com.app.wallpaperwish.adapters.WallpaperListingAdapter
import com.unsplash.pickerandroid.photopicker.UnsplashPhotoPicker
import com.unsplash.pickerandroid.photopicker.data.UnsplashPhoto
import com.unsplash.pickerandroid.photopicker.presentation.UnsplashPickerActivity
import kotlinx.android.synthetic.main.activity_wallpaper_listing.*

class WallpaperListing : AppCompatActivity() {

    val list = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wallpaper_listing)








// Receiver
        val getResult =
            registerForActivityResult(
                ActivityResultContracts.StartActivityForResult()) {
                Log.e( "PHOTOLISTING====>",  it.resultCode.toString())
                if(it.resultCode == Activity.RESULT_OK && it.resultCode == REQUEST_CODE){
                    // getting the photos
                    val photos: ArrayList<UnsplashPhoto>? = it.data?.getParcelableArrayListExtra(UnsplashPickerActivity.EXTRA_PHOTOS)
                    // showing the preview
                    setAdapter(photos)
                    Log.e( "PHOTOLISTING", photos.toString())
                    // telling the user how many have been selected
                    Toast.makeText(this, "number of selected photos: " + photos?.size, Toast.LENGTH_SHORT).show()
                } else {
                    Log.e( "PHOTOLISTING", "Errorororrorororo")
                }
            }


        // Caller




        getResult.launch(UnsplashPickerActivity.getStartingIntent(
            this,true)
        )





        //color listing
        list.add(resources.getColor(R.color.black))
        list.add(resources.getColor(R.color.blue))
        list.add(resources.getColor(R.color.green))
        list.add(resources.getColor(R.color.rose))
        list.add(resources.getColor(R.color.red))
        list.add(resources.getColor(R.color.yellow))

    }
    private  fun setAdapter( photos:ArrayList<UnsplashPhoto>?){
        val adapterView = WallpaperListingAdapter(photos)
        rvWallpaperListing.adapter = adapterView
    }
    companion object {
        // dummy request code to identify the request
        private const val REQUEST_CODE = 123
    }
}