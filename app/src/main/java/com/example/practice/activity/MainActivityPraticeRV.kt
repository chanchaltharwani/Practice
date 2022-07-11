package com.example.practice.activity
import android.os.Bundle
import android.widget.HorizontalScrollView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practice.R
import com.example.practice.adapter.MyAdapterPratice
import com.example.practice.databinding.ActivityMainBinding
import com.example.practice.databinding.ActivityMainPraticeRvBinding

class MainActivityPraticeRV : AppCompatActivity() {
    lateinit var binding:ActivityMainPraticeRvBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main_pratice_rv)
        val songs:List<String> = listOf("One","two","Three","four","One","two","Three","four","One","two","Three","four")
        binding.RV.adapter = MyAdapterPratice(songs)
        binding.RV.layoutManager =LinearLayoutManager(this)

    }
}