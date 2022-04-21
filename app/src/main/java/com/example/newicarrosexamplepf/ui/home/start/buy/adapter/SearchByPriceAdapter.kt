package com.example.newicarrosexamplepf.ui.home.start.buy.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newicarrosexamplepf.databinding.ItemSearchByPriceBinding
import com.example.newicarrosexamplepf.models.buy.Price

class SearchByPriceAdapter(private val modelsList: List<Price>)
    : RecyclerView.Adapter<SearchByPriceAdapter.HoursViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HoursViewHolder {
        val binding = ItemSearchByPriceBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return HoursViewHolder(binding)
    }

    override fun getItemCount() = modelsList.size

    override fun onBindViewHolder(holder: HoursViewHolder, position: Int) {
        with(holder){
            with(modelsList[position]) {
                binding.title.text = title
                binding.titleText.text = value
                holder.itemView.setOnClickListener {
                    //Busca oferas pela marca
                }
            }
        }
    }

    inner class HoursViewHolder(val binding: ItemSearchByPriceBinding)
        : RecyclerView.ViewHolder(binding.root)

}