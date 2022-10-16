package com.jordharr.placemark.main

import android.app.Application
import com.jordharr.placemark.models.PlacemarkJSONStore
import com.jordharr.placemark.models.PlacemarkMemStore
import com.jordharr.placemark.models.PlacemarkStore
import timber.log.Timber
import timber.log.Timber.Forest.i

class MainApp : Application() {

    lateinit var placemarks: PlacemarkStore

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        placemarks = PlacemarkJSONStore(applicationContext)
        i("Placemark started")
    }
}