package com.umbat.app_sederhana_dicoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
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

    private fun showRecyclerGrid() {
        rvPlayers.layoutManager = GridLayoutManager(this, 2)
        val gridPlayerAdapter = GridPlayerAdapter(list)
        rvPlayers.adapter = gridPlayerAdapter
    }

    private fun showRecyclerCardView() {
        rvPlayers.layoutManager = LinearLayoutManager(this)
        val cardViewPlayerAdapter = CardViewPlayerAdapter(list)
        rvPlayers.adapter = cardViewPlayerAdapter
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                title = "Mode List"
                showRecyclerList()
            }
            R.id.action_grid -> {
                title = "Mode Grid"
                showRecyclerGrid()
            }
            R.id.action_cardview -> {
                title = "Mode Card View"
                showRecyclerCardView()
            }
        }
    }
}