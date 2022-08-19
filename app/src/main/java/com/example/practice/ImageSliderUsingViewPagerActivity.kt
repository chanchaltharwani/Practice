package com.example.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import androidx.databinding.DataBindingUtil
import androidx.viewpager.widget.PagerAdapter
import com.example.practice.adapter.ImageSliderAdapter
import com.example.practice.databinding.ActivityImageSliderUsingViewPagerBinding
import com.example.practice.databinding.SliderImageItemviewBinding
import me.relex.circleindicator.CircleIndicator

class ImageSliderUsingViewPagerActivity : AppCompatActivity() {
    lateinit var binding:ActivityImageSliderUsingViewPagerBinding
    lateinit var indicator: CircleIndicator
    var images:Array<Int> = arrayOf(R.drawable.morningwalk,R.drawable.beforeafterimg,R.drawable.imghealthyfyme)
    var adapter:PagerAdapter=ImageSliderAdapter(this,images)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_image_slider_using_view_pager)

        binding.viewpager.adapter=adapter
        indicator = this.findViewById(R.id.indicator) as CircleIndicator
        indicator.setViewPager(binding.viewpager)
    }
}