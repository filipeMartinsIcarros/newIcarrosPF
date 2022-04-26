package com.example.newicarrosexamplepf.ui.home.start.buy.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.newicarrosexamplepf.R
import com.example.newicarrosexamplepf.databinding.ItemSearchStoreBinding
import com.example.newicarrosexamplepf.models.buy.Store

class StoreAdapter(private val makesList: List<Store>)
    : RecyclerView.Adapter<StoreAdapter.StoreViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoreViewHolder {
        val binding = ItemSearchStoreBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return StoreViewHolder(binding)
    }

    override fun getItemCount() = makesList.size

    override fun onBindViewHolder(holder: StoreViewHolder, position: Int) {
        with(holder){
            with(makesList[position]) {
                binding.nameStore.text = name
                binding.storeLocation.text = "$locationCity $locationAddress"
                if(isFavorite) binding.storeFav.setImageResource(R.drawable.ic_favorite_true_36)
                else binding.storeFav.setImageResource(R.drawable.ic_favorite_false_36)
                Glide.with(holder.itemView.context)
                    .load(pathImage)
                    .into(binding.storeIcon)
                holder.itemView.setOnClickListener {
                    //Busca oferas pela marca
                }
                binding.storeFav.setOnClickListener {

                }
            }
        }
    }

    inner class StoreViewHolder(val binding: ItemSearchStoreBinding)
        : RecyclerView.ViewHolder(binding.root)

}