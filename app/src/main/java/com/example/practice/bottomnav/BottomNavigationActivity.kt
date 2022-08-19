package com.example.practice.bottomnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.practice.R
import com.example.practice.bottomnav.fragment.HealthyfyProFragment
import com.example.practice.databinding.ActivityBottomNavigation2Binding
import com.example.practice.fragment.*
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavigationActivity : AppCompatActivity() {
    lateinit var binding:ActivityBottomNavigation2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_bottom_navigation2)
        binding.bottomNavigation.setOnNavigationItemReselectedListener { item: MenuItem ->
        when (item.itemId) {
            R.id.navigation_home -> {
                loadfragment(com.example.practice.bottomnav.fragment.HomeFragment())
                true
            }
            R.id.navigation_me -> {
                loadfragment(com.example.practice.bottomnav.fragment.MeFragment())
                true
            }
            R.id.navigation_plan -> {
                loadfragment(com.example.practice.bottomnav.fragment.PlansFragment())
                true
            }
            R.id.navigation_healthyfypro -> {
                loadfragment(com.example.practice.bottomnav.fragment.HealthyfyProFragment())
                true
            }
        }
        val homeFragment = HomeFragment()
        val plansFragment = PlansFragment()
        val meFragment = MeFragment()
        val healthFrament = HealthyfyProFragment()
        val BottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        //replaceFragment(homeFragment)
    }



//    private fun replaceFragment(fragment: Fragment?){
//        if (fragment!=null){
//            val transaction = supportFragmentManager.beginTransaction()
//            transaction.replace(R.id.framelayout,fragment)
//            transaction.commit()
//        }
    }
    fun loadfragment(frag1: Fragment) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.framelayout, frag1)
        ft.commit()
    }


}