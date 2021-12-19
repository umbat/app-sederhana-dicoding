package com.umbat.app_sederhana_dicoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var tvGreeting: TextView
    private lateinit var rvPlayers: RecyclerView
    private var title = "Mode List"
    private var list: ArrayList<Players> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)
        supportActionBar?.title = "Players"

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

        listPlayerAdapter.setOnItemClickCallback(object : ListPlayerAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Players) {
                showSelectedPlayer(data)
            }
        })
    }

    private fun showRecyclerGrid() {
        rvPlayers.layoutManager = GridLayoutManager(this, 2)
        val gridPlayerAdapter = GridPlayerAdapter(list)
        rvPlayers.adapter = gridPlayerAdapter

        gridPlayerAdapter.setOnItemClickCallback(object : GridPlayerAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Players) {
                showSelectedPlayer(data)
            }
        })
    }

    private fun showRecyclerCardView() {
        rvPlayers.layoutManager = LinearLayoutManager(this)
        val cardViewPlayerAdapter = CardViewPlayerAdapter(list)
        rvPlayers.adapter = cardViewPlayerAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
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
        setActionBarTitle(title)
    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }

    private fun showSelectedPlayer(players: Players) {
        val intent= Intent(this, DetailActivity::class.java)
        startActivity(intent)
    }

}