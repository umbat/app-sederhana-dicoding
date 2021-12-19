package com.umbat.app_sederhana_dicoding

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import coil.load
import coil.transform.CircleCropTransformation

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "About"

        val aboutImages = findViewById<ImageView>(R.id.iv_about_photo)
        val aboutName = findViewById<TextView>(R.id.tv_about_nama)
        val aboutKet = findViewById<TextView>(R.id.tv_about_ket)
        val aboutDesc = findViewById<TextView>(R.id.tv_about_desc)

        aboutImages.load(R.drawable.my_photo) {
            crossfade(true)
            transformations(CircleCropTransformation())
        }
        aboutName.text = "Muhammad Farhan Pratama"
        aboutKet.text = "Mahasiswa"
        aboutDesc.text = "Lahir di Magelang pada 8 Juni 2000 dan sekarang sedang berkuliah di STMKG program studi Instruentasi Meteorologi Klimatologi dan Geofisika"
    }
}