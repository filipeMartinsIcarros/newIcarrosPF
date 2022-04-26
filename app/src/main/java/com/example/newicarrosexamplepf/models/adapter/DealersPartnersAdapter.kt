package com.example.newicarrosexamplepf.models.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.newicarrosexamplepf.databinding.ItemDealerHomeBinding
import com.example.newicarrosexamplepf.models.buy.DealersPartners

class DealersPartnersAdapter(private val makesList: List<DealersPartners>)
    : RecyclerView.Adapter<DealersPartnersAdapter.DealersViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DealersViewHolder {
        val binding = ItemDealerHomeBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return DealersViewHolder(binding)
    }

    override fun getItemCount() = makesList.size

    override fun onBindViewHolder(holder: DealersViewHolder, position: Int) {
        with(holder){
            with(makesList[position]) {
                binding.dealerNameText.text = name
                Glide.with(holder.itemView.context)
                    .load(pathImage)
                    .into(binding.dealerImage)
                holder.itemView.setOnClickListener {
                    //Busca oferas pela marca
                }
            }
        }
    }

    inner class DealersViewHolder(val binding: ItemDealerHomeBinding)
        : RecyclerView.ViewHolder(binding.root)

}