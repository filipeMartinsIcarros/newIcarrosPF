package com.example.newicarrosexamplepf.ui.home.favorites

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.newicarrosexamplepf.databinding.FragmentFavoritesBinding
import com.example.newicarrosexamplepf.models.adapter.*
import com.example.newicarrosexamplepf.models.buy.*

class FavoritesFragment : Fragment() {

    private lateinit var binding: FragmentFavoritesBinding
    private lateinit var adapterFavoriteDeals: LastDealsAdapter
    private lateinit var adapterFavoriteStorePartner: StorePartnersAdapter
    private lateinit var adapterFavoriteStore: StoreAdapter

    companion object {
        fun newInstance() = FavoritesFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFavoritesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setViews()
    }

    private fun setViews() = with(binding) {

        favoriteStoreClearTitle.setOnClickListener {  }
        favoriteStorePartnersClearTitle.setOnClickListener {  }
        favoriteDealsClearTitle.setOnClickListener {  }

        adapterFavoriteDeals = LastDealsAdapter(getDeals())
        recyclerViewFavoriteDeals.adapter = adapterFavoriteDeals

        adapterFavoriteStorePartner = StorePartnersAdapter(getListStore().filter { it.isDealerPartner && it.isFavorite })
        recyclerViewFavoriteStorePartners.adapter = adapterFavoriteStorePartner

        adapterFavoriteStore = StoreAdapter(getListStore().filter { !it.isDealerPartner && it.isFavorite })
        recyclerViewStore.adapter = adapterFavoriteStore
    }
}