package com.example.practice.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.practice.R
import com.example.practice.fragment.HealthyFragment
import com.example.practice.fragment.HomeFragment
import com.example.practice.fragment.MeFragment
import com.example.practice.fragment.PlansFragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class bottomjulyActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottomjuly)

        val homeFragment = HomeFragment()
        val plansFragment = PlansFragment()
        val meFragment = MeFragment()
         val healthFrament = HealthyFragment()

val BottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        replaceFragment(homeFragment)

    }

    private fun replaceFragment(fragment: Fragment?){
        if (fragment!=null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.framelayoutxx,fragment)
            transaction.commit()
        }
    }

}