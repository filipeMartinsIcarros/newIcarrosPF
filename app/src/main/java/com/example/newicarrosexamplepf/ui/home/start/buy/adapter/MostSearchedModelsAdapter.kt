package com.example.newicarrosexamplepf.ui.home.start.buy.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.newicarrosexamplepf.databinding.ItemMostSearchModelsBinding
import com.example.newicarrosexamplepf.models.buy.Models

class MostSearchedModelsAdapter(private val modelsList: List<Models>)
    : RecyclerView.Adapter<MostSearchedModelsAdapter.HoursViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HoursViewHolder {
        val binding = ItemMostSearchModelsBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return HoursViewHolder(binding)
    }

    override fun getItemCount() = modelsList.size

    override fun onBindViewHolder(holder: HoursViewHolder, position: Int) {
        with(holder){
            with(modelsList[position]) {
                binding.text.text = nameModel
                binding.subText.text = nameBrand
                Glide.with(holder.itemView.context)
                    .load(pathImage)
                    .dontAnimate()
                    .centerCrop()
                    .into(binding.image)
                holder.itemView.setOnClickListener {
                    //Busca oferas pela marca
                }
            }
        }
    }

    inner class HoursViewHolder(val binding: ItemMostSearchModelsBinding)
        : RecyclerView.ViewHolder(binding.root)

}