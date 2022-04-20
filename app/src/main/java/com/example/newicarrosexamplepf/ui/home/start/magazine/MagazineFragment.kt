package com.example.newicarrosexamplepf.ui.home.start.magazine

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.newicarrosexamplepf.databinding.FragmentMagazineBinding

class MagazineFragment : Fragment() {

    private lateinit var binding: FragmentMagazineBinding

    companion object {
        fun newInstance() = MagazineFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMagazineBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}