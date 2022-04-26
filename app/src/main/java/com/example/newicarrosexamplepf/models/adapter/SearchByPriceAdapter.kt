package com.example.newicarrosexamplepf.models.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newicarrosexamplepf.databinding.ItemSearchByPriceBinding
import com.example.newicarrosexamplepf.models.buy.Price

class SearchByPriceAdapter(private val modelsList: List<Price>)
    : RecyclerView.Adapter<SearchByPriceAdapter.SearchByPriceViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchByPriceViewHolder {
        val binding = ItemSearchByPriceBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return SearchByPriceViewHolder(binding)
    }

    override fun getItemCount() = modelsList.size

    override fun onBindViewHolder(holder: SearchByPriceViewHolder, position: Int) {
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

    inner class SearchByPriceViewHolder(val binding: ItemSearchByPriceBinding)
        : RecyclerView.ViewHolder(binding.root)

}