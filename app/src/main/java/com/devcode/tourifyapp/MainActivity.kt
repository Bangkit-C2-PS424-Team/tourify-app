package com.devcode.tourifyapp

import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.ContextCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.devcode.tourifyapp.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupView()
        setupNavigationBottom()
    }

    private fun setupView() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            binding.navView.outlineAmbientShadowColor = getColor(R.color.shadowColor)
            binding.navView.outlineSpotShadowColor = getColor(R.color.shadowColor)
        } else {
            binding.navView.elevation = 6f
        }
    }

    private fun setupNavigationBottom(){
        val navView: BottomNavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment)
        AppBarConfiguration.Builder(
            R.id.navigation_home, R.id.navigation_explore, R.id.navigation_favourite, R.id.navigation_settings
        ).build()
        navView.setupWithNavController(navController)
    }
}