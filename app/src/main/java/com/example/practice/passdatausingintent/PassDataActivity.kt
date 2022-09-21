package com.example.practice.passdatausingintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.databinding.DataBindingUtil
import com.example.practice.R
import com.example.practice.databinding.ActivityPassDataBinding

class PassDataActivity : AppCompatActivity() {
lateinit var binding:ActivityPassDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = DataBindingUtil. setContentView(this,R.layout.activity_pass_data)

binding.button.setOnClickListener {
    val name = binding.editTextone.text.toString()
    val age = binding.editTexttwo.text.toString()



    val intent = Intent(this,SecondActivity::class.java)
    intent.putExtra(SecondActivity.NAME,name)
    intent.putExtra(SecondActivity.AGE,age)
    startActivity(intent)

}
    }




}