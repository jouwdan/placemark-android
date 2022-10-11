package com.jordharr.placemark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.jordharr.placemark.databinding.ActivityMainBinding
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Timber.plant(Timber.DebugTree())

        Timber.i("Placemark Activity has started...")

        binding.btnAdd.setOnClickListener() {
            val placemarkTitle = binding.placemarkTitle.text.toString()
            if (placemarkTitle.isNotEmpty()) {
                Timber.i("add Button Pressed: $placemarkTitle")
            }
            else {
                Snackbar
                    .make(it,"Please Enter a title", Snackbar.LENGTH_LONG)
                    .show()
            }
        }
    }
}