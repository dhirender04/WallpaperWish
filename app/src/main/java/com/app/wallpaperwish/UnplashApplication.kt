package com.app.wallpaperwish

import android.app.Application
import com.unsplash.pickerandroid.photopicker.UnsplashPhotoPicker

class UnplashApplication   : Application() {

    override fun onCreate() {
        super.onCreate()
        // initializing the picker library
        UnsplashPhotoPicker.init(
            this,
            "dAsC4eDB3l52Yc9SkFYjhZ8a6jcUl-zn3u17K_Zm3sg",
            "-hkfGFK9ym-uiRAiKM5_vDdNVwrpY4QIQUuwcp8IJ78"
            /* optional page size (number of photos per page) */
        )
        /* .setLoggingEnabled(true) // if you want to see the http requests */
    }
}
