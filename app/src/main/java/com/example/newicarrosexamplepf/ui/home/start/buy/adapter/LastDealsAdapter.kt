package com.example.newicarrosexamplepf.ui.home.start.buy.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.newicarrosexamplepf.databinding.ItemLastDealsBinding
import com.example.newicarrosexamplepf.models.buy.Deals
import java.text.NumberFormat

class LastDealsAdapter(private val makesList: List<Deals>)
    : RecyclerView.Adapter<LastDealsAdapter.LastDealsHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LastDealsHolder {
        val binding = ItemLastDealsBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return LastDealsHolder(binding)
    }

    override fun getItemCount() = makesList.size

    override fun onBindViewHolder(holder: LastDealsHolder, position: Int) {
        with(holder){
            with(makesList[position]) {
                binding.trimNameText.text = name
                binding.dealPriceText.text = NumberFormat.getCurrencyInstance().format(price)
                Glide.with(holder.itemView.context)
                    .load(listPathImage[0])
                    .into(binding.modelImage)
                holder.itemView.setOnClickListener {
                    //Busca oferas pela marca
                }
            }
        }
    }

    inner class LastDealsHolder(val binding: ItemLastDealsBinding)
        : RecyclerView.ViewHolder(binding.root)

}