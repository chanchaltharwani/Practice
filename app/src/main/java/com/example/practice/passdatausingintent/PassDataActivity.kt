package com.example.practice.passdatausingintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.practice.R

class PassDataActivity : AppCompatActivity() {
    lateinit var editText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pass_data)
        this.editText = findViewById(R.id.editText)
    }
    fun onButtonClicked(view: View) {
        val i = Intent(this, SecondActivity::class.java).apply {
            putExtra("Data",editText.text.toString())
        }

        startActivity(i)
    }



}