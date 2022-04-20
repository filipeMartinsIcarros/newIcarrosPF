package com.example.newicarrosexamplepf.ui.home.start.buy.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.newicarrosexamplepf.databinding.ItemLayoutMostMakesBinding
import com.example.newicarrosexamplepf.models.buy.Make

class MostSearchedMakesAdapter(private val makesList: List<Make>)
    : RecyclerView.Adapter<MostSearchedMakesAdapter.HoursViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HoursViewHolder {
        val binding = ItemLayoutMostMakesBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return HoursViewHolder(binding)
    }

    override fun getItemCount() = makesList.size

    override fun onBindViewHolder(holder: HoursViewHolder, position: Int) {
        with(holder){
            with(makesList[position]) {
                binding.nameText.text = name
                Glide.with(holder.itemView.context)
                    .load(pathImage)
                    .into(binding.image)
                holder.itemView.setOnClickListener {
                    //Busca oferas pela marca
                }
            }
        }
    }

    inner class HoursViewHolder(val binding: ItemLayoutMostMakesBinding)
        :RecyclerView.ViewHolder(binding.root)

}