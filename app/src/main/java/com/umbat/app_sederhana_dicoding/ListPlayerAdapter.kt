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
    private val listPlayers: List<Players>
    ) :
    RecyclerView.Adapter<ListPlayerAdapter.ListViewHolder>(){

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_list_player,viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val players = listPlayers[position]

        Glide.with(holder.itemView.context)
            .load(players.photo)
            .apply(RequestOptions().override(55,55))
            .into(holder.ivImagePlayers)

        holder.tvNamePlayers.text = players.name

        holder.itemView.setOnClickListener {onItemClickCallback.onItemClicked(listPlayers[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listPlayers.size
    }

    inner class ListViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val ivImagePlayers = itemView.findViewById<ImageView>(R.id.iv_player)
        val tvNamePlayers = itemView.findViewById<TextView>(R.id.tv_player_name)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Players)
    }
}