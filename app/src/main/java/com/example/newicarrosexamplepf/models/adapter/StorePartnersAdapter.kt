package com.example.newicarrosexamplepf.models.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.newicarrosexamplepf.R
import com.example.newicarrosexamplepf.databinding.ItemDealerBinding
import com.example.newicarrosexamplepf.models.buy.Store

class StorePartnersAdapter(private val makesList: List<Store>)
    : RecyclerView.Adapter<StorePartnersAdapter.DealsPartnersViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DealsPartnersViewHolder {
        val binding = ItemDealerBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return DealsPartnersViewHolder(binding)
    }

    override fun getItemCount() = makesList.size

    override fun onBindViewHolder(holder: DealsPartnersViewHolder, position: Int) {
        with(holder){
            with(makesList[position]) {
                binding.dealerNameText.text = name
                binding.dealerLocationText.text = "$locationCity $locationAddress"
                if(isFavorite) binding.dealerFav.setImageResource(R.drawable.ic_favorite_true_36)
                else binding.dealerFav.setImageResource(R.drawable.ic_favorite_false_36)
                Glide.with(holder.itemView.context)
                    .load(pathImage)
                    .into(binding.dealerImage)
                holder.itemView.setOnClickListener {
                    //Busca oferas pela marca
                }
                binding.dealerFav.setOnClickListener {

                }
            }
        }
    }

    inner class DealsPartnersViewHolder(val binding: ItemDealerBinding)
        : RecyclerView.ViewHolder(binding.root)

}