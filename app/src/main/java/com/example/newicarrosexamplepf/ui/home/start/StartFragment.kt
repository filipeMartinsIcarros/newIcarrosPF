package com.example.newicarrosexamplepf.ui.home.start

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.newicarrosexamplepf.databinding.FragmentStartBinding
import com.google.android.material.tabs.TabLayoutMediator

class StartFragment : Fragment() {

    private lateinit var startPageAdapter: StartPageAdapter
    private lateinit var binding: FragmentStartBinding

    companion object {
        fun newInstance() = StartFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStartBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        configTabs()
    }

    private fun configTabs() {
        startPageAdapter = StartPageAdapter(this)
        binding.startViewPager.adapter = startPageAdapter
        TabLayoutMediator(binding.tabLayout, binding.startViewPager) { tab, position ->
            tab.text = when (position) {
                0 -> "Comprar"
                1 -> "Vender"
                2 -> "Catálogo"
                3 -> "Fipe"
                4 -> "Financiar"
                5 -> "Revista"
                else -> "Comprar" //Testar
            }
        }.attach()
    }
}