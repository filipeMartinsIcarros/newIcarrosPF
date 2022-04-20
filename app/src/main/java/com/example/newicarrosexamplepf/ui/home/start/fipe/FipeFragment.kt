package com.example.newicarrosexamplepf.ui.home.start.fipe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.newicarrosexamplepf.databinding.FragmentFipeBinding

class FipeFragment : Fragment() {

    private lateinit var binding: FragmentFipeBinding

    companion object {
        fun newInstance() = FipeFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFipeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}