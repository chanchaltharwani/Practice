package com.example.practice.faltufragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.practice.R
import com.example.practice.databinding.ActivityFaltuFragmentBinding

class FaltuFragmentActivity : AppCompatActivity() {
    lateinit var binding:ActivityFaltuFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_faltu_fragment)
        binding.firstfrag.setOnClickListener {
            loadFrag1()



        }
        binding.secondfrag.setOnClickListener {
            loadFrag2()
        }

    }

    private fun loadFrag2() {
        val fram = supportFragmentManager.beginTransaction()
        fram.replace(R.id.framelayout,SecondFragment())
        fram.commit()
    }

    private fun loadFrag1() {
        val fram = supportFragmentManager.beginTransaction()
        fram.replace(R.id.framelayout,FirstFragment())
        fram.commit()
    }
}