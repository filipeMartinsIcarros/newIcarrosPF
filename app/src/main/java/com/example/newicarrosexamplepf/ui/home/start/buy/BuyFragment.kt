package com.example.newicarrosexamplepf.ui.home.start.buy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.newicarrosexamplepf.databinding.FragmentBuyBinding
import com.example.newicarrosexamplepf.models.buy.*
import com.example.newicarrosexamplepf.ui.home.start.buy.adapter.*

class BuyFragment : Fragment() {

    private lateinit var binding: FragmentBuyBinding
    private lateinit var adapterMostMakes: MostSearchedMakesAdapter
    private lateinit var adapterLastDeals: LastDealsAdapter
    private lateinit var adapterMostModels: MostSearchedModelsAdapter
    private lateinit var adapterSearchByPrice: SearchByPriceAdapter
    private lateinit var adapterStore: StoreAdapter
    private lateinit var adapterDealersPartners: DealersPartnersAdapter

    companion object {
        fun newInstance() = BuyFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBuyBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setViews()
    }
    private fun setViews() = with(binding) {
        binding.includeSearchLocation.root.setOnClickListener{

        }
        adapterMostMakes = MostSearchedMakesAdapter(getMakes())
        recyclerViewMostSearchedBrands.adapter = adapterMostMakes

        binding.includeBannerFeirao.root.setOnClickListener{

        }

        adapterLastDeals = LastDealsAdapter(getDeals())
        recyclerViewLastDeals.adapter = adapterLastDeals

        binding.includeMockFinancing.root.setOnClickListener{

        }

        adapterMostModels = MostSearchedModelsAdapter(getModels())
        recyclerViewMostSearchModels.adapter = adapterMostModels

        adapterSearchByPrice = SearchByPriceAdapter(getSearchPrice())
        recyclerViewSearchByPrice.adapter = adapterSearchByPrice

        adapterStore = StoreAdapter(getListStore().filter { !it.isDealer })
        recyclerViewStore.adapter = adapterStore

        adapterDealersPartners = DealersPartnersAdapter(getDealersPartners())
        recyclerViewDealersPartners.adapter = adapterDealersPartners
    }
}