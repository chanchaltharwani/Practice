package com.example.practice.tablayout.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.practice.tablayout.fragment.PhotosFragment
import com.example.practice.tablayout.fragment.TrainersFragment
import com.example.practice.tablayout.fragment.VideosFragment

class ViewPagerAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle):FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int) : Fragment {
       return  when(position){
           0->{
               PhotosFragment()
           }
           1->{
               VideosFragment()
           }
            2->{
                TrainersFragment()
            }
            else->{
                PhotosFragment()
            }
       }
    }
}