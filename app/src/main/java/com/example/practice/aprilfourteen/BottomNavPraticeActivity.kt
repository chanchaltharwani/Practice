package com.example.practice.aprilfourteen

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.practice.R


class BottomNavPraticeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val navController= findNavController(R.id.container_fragment)
        val bottomnavview = findViewById<BottomNavigationView>(R.id.bottom_nav_view)
        bottomnavview.setupWithNavController(navController)

    }
}