package com.example.practice.passdatausingintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.practice.R
import com.example.practice.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding:ActivitySecondBinding
    companion object{
        const val NAME = "NAME"
        const val AGE = "AGE"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_second)


        val name = intent.getStringExtra(NAME)
        val age = intent.getStringExtra(AGE)

        binding.TextViewOne.text = "Hi  "+name
        binding.TextViewTwo.text = "Your age is  "+age

        }
    }
