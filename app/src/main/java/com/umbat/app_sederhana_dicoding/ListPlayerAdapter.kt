package com.umbat.app_sederhana_dicoding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import coil.load
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListPlayerAdapter(
    val listPlayers: List<Players>,
    val listener: (Players) -> Unit
    ):
    RecyclerView.Adapter<ListPlayerAdapter.PlayersViewHolder>(){

    inner class PlayersViewHolder(view: View): RecyclerView.ViewHolder(view){
        val iv_players = itemView.findViewById<ImageView>(R.id.iv_details)

        fun bind(players: Players){
            iv_players.load(players.photo){
                crossfade(true)

                itemView.setOnClickListener { listener(players) }
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayersViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list_player, parent, false)
        return PlayersViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlayersViewHolder, position: Int) {
        val players = listPlayers[position] }


    override fun getItemCount(): Int {
        return listPlayers.size
    }

}