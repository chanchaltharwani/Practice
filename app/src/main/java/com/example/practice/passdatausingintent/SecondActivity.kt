package com.example.practice.passdatausingintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.practice.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intentValue = intent.getStringExtra("Data")
        findViewById<TextView>(R.id.secondTextView).apply {
            text = intentValue.toString()


        }
    }
}