package com.example.practice.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.practice.R
import com.example.practice.databinding.ActivityTabLayoutBinding
import com.example.practice.tablayout.adapters.ViewPagerAdapter
import com.example.practice.tablayout.fragment.PhotosFragment
import com.google.android.material.tabs.TabLayoutMediator

class TabLayoutActivity : AppCompatActivity() {
    lateinit var binding:ActivityTabLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_tab_layout)
        // variable for viewpager and tablayout  or id add kar denge jo xml file m h
        val viewpager2 = binding.viewPager
        val tablayout = binding.tabLayout


        // view pager m adapter set krege
        viewpager2.adapter = ViewPagerAdapter(this.supportFragmentManager,lifecycle)

        TabLayoutMediator(tablayout,viewpager2){
            tab,position->
            when(position){
                0->{
                   tab.text="photos"
                }
                1->{
                    tab.text="videos"
                }
                2->{
                    tab.text="trainers"
                }
            }
        }.attach()


    }
}