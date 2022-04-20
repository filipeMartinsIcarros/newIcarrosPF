package com.example.newicarrosexamplepf.ui.home.start

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.newicarrosexamplepf.ui.home.start.buy.BuyFragment
import com.example.newicarrosexamplepf.ui.home.start.catalog.CatalogFragment
import com.example.newicarrosexamplepf.ui.home.start.financing.FinancingFragment
import com.example.newicarrosexamplepf.ui.home.start.fipe.FipeFragment
import com.example.newicarrosexamplepf.ui.home.start.magazine.MagazineFragment
import com.example.newicarrosexamplepf.ui.home.start.sell.SellFragment

class StartPageAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 6

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> BuyFragment.newInstance()
            1 -> SellFragment.newInstance()
            2 -> CatalogFragment.newInstance()
            3 -> FipeFragment.newInstance()
            4 -> FinancingFragment.newInstance()
            5 -> MagazineFragment.newInstance()
            else -> BuyFragment.newInstance() //Testar
        }
    }
}