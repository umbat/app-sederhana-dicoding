package com.umbat.app_sederhana_dicoding

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import coil.load

class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_PLAYERS = "EXTRA_PLAYERS"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Details"

        val ivDetailImage = findViewById<ImageView>(R.id.iv_details)
        val tvDetailFullName = findViewById<TextView>(R.id.tv_full_name)
        val tvDetailPlaceOfBirth = findViewById<TextView>(R.id.tv_place_of_birth)
        val tvDetailTimeOfBirth = findViewById<TextView>(R.id.tv_time_of_birth)
        val tvDetailPosition = findViewById<TextView>(R.id.tv_position)
        val tvDetailDetails = findViewById<TextView>(R.id.tv_details)

        val players = intent.getParcelableExtra<Players>(EXTRA_PLAYERS)

        players?.let { players ->
            ivDetailImage.load(players.photo) {
                crossfade(true)
            }
            tvDetailFullName.text = players.fullname
            tvDetailPlaceOfBirth.text = players.placeofbirth
            tvDetailTimeOfBirth.text = players.timeofbirth
            tvDetailPosition.text = players.position
            tvDetailDetails.text = players.detail

            supportActionBar?.title = players.name
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_profil, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.menu_about -> {
                val intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}