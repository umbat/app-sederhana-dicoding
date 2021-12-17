package com.umbat.app_sederhana_dicoding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import coil.load
import androidx.recyclerview.widget.RecyclerView

class ListPlayerAdapter(
    val listPlayers: List<Players>,
    val onClickListener: (Players) -> Unit) :
    RecyclerView.Adapter<ListPlayerAdapter.ListViewHolder>(){

    inner class ListViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val ivImagePlayers = itemView.findViewById<ImageView>(R.id.iv_player)
        val tvNamePlayers = itemView.findViewById<TextView>(R.id.tv_player_name)

        fun bind(players: Players){
            ivImagePlayers.load(players.photo)
            tvNamePlayers.text = players.name

            itemView.setOnClickListener {onClickListener(players)}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list_player, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listPlayers[position])
    }

    override fun getItemCount(): Int {
        return listPlayers.size
    }
}