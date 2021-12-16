package com.umbat.app_sederhana_dicoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var tvGreeting: TextView
    private lateinit var rvPlayers: RecyclerView
    private var title = "Mode List"
    private var list = ArrayList<Players>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvGreeting = findViewById(R.id.tv_greeting)
        rvPlayers = findViewById(R.id.rv_players)
        rvPlayers.setHasFixedSize(true)

        list.addAll(PlayersData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvPlayers.layoutManager = LinearLayoutManager(this)
        val listPlayerAdapter = ListPlayerAdapter(list)
        rvPlayers.adapter = listPlayerAdapter

    }
}