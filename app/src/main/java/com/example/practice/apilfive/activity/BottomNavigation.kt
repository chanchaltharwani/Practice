package com.example.practice.apilfive.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.practice.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavigation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)

        val navController= findNavController(R.id.container_fragment)
        val bottomnavview = findViewById<BottomNavigationView>(R.id.bottom_nav_view)
        bottomnavview.setupWithNavController(navController)


    }
}