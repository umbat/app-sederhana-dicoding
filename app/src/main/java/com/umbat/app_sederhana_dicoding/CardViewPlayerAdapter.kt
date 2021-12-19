package com.umbat.app_sederhana_dicoding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewPlayerAdapter (
    private val listPlayers: ArrayList<Players>):
    RecyclerView.Adapter<CardViewPlayerAdapter.CardViewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewPlayerAdapter.CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_player, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewPlayerAdapter.CardViewViewHolder, position: Int) {
        val players = listPlayers[position]

        Glide.with(holder.itemView.context)
            .load(players.photo)
            .apply(RequestOptions().override(350,550))
            .into(holder.imgPhoto)

        holder.tvName.text = players.name
        holder.tvDetails.text = players.detail

        holder.btnFavorite.setOnClickListener { Toast.makeText(
            holder.itemView.context,
            "Favorite" + listPlayers[holder.adapterPosition].name,
            Toast.LENGTH_SHORT
        ).show()
        }
        holder.btnShare.setOnClickListener { Toast.makeText(
            holder.itemView.context,
            "Share" + listPlayers[holder.adapterPosition].name,
            Toast.LENGTH_SHORT
        ).show()
        }
        holder.itemView.setOnClickListener { Toast.makeText(
            holder.itemView.context,
            "You choose " + listPlayers[holder.adapterPosition].name,
            Toast.LENGTH_SHORT
        ).show()}
    }

    override fun getItemCount(): Int {
        return listPlayers.size
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.iv_player)
        var tvName: TextView = itemView.findViewById(R.id.tv_player_name)
        var tvDetails: TextView = itemView.findViewById(R.id.tv_player_details)
        var btnFavorite: Button = itemView.findViewById(R.id.btn_set_favorite)
        var btnShare: Button = itemView.findViewById(R.id.btn_set_share)
    }
}