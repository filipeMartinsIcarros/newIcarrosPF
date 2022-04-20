package com.example.newicarrosexamplepf.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.newicarrosexamplepf.R
import com.example.newicarrosexamplepf.databinding.ActivityHomeBinding
import com.example.newicarrosexamplepf.ui.home.favorites.FavoritesFragment
import com.example.newicarrosexamplepf.ui.home.profile.ProfileFragment
import com.example.newicarrosexamplepf.ui.home.search.SearchFragment
import com.example.newicarrosexamplepf.ui.home.start.StartFragment

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupBottomSheet()
        setFragment(StartFragment.newInstance())
    }

    private fun setupBottomSheet() = with(binding) {
        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home_menu -> {
                    setFragment(StartFragment.newInstance())
                }
                R.id.search_menu -> {
                    setFragment(SearchFragment.newInstance())
                }
                R.id.favorite_menu -> {
                    setFragment(FavoritesFragment.newInstance())
                }
                R.id.profile_menu -> {
                    setFragment(ProfileFragment.newInstance())
                }
            }
            return@setOnNavigationItemSelectedListener true
        }
    }

    private fun setFragment(fragment: Fragment, popBackStack: Boolean = false) {
        val transition = supportFragmentManager.beginTransaction()
            .replace(R.id.navHostFragment, fragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)

        if (popBackStack) {
            transition.addToBackStack(null)
        }

        transition.commit()
    }
}