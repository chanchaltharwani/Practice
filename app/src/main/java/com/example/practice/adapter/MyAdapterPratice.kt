package com.example.practice.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.practice.MainActivity
import com.example.practice.R
import com.example.practice.activity.MainActivityPraticeRV
import com.example.practice.databinding.ActivityMainPraticeRvBinding
import com.example.practice.databinding.ItemViewPraticeBinding

class MyAdapterPratice(var Songs:List<String>):RecyclerView.Adapter<MyAdapterPratice.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val inflater:LayoutInflater = LayoutInflater.from((parent.context))
        val view = inflater.inflate(R.layout.item_view_pratice,parent,false)
        val a = ItemViewPraticeBinding.bind(view)
        return MyViewHolder(a)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

    holder.binding.data = Songs[position]
    }

    override fun getItemCount(): Int {
      return Songs.size
    }

class MyViewHolder( val binding:ItemViewPraticeBinding):RecyclerView.ViewHolder(binding.root){
//    var button = itemView.findViewById<TextView>(R.id.btn1)

}


}