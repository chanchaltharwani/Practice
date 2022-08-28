package com.example.practice.chatapp

import android.app.Activity
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.practice.R
import com.example.practice.databinding.ItemViewChatAppBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MyAdapterChatApp(
    var activity: Activity,
    val chat: List<Chatmodel>,
    var database: ChatAppDatabase) : RecyclerView.Adapter<MyAdapterChatApp.MyViewHolder>(){
    var flag:Boolean = false
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapterChatApp.MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_view_chat_app, parent, false)
        val a = ItemViewChatAppBinding.bind(view)
        return MyAdapterChatApp.MyViewHolder(a)
    }
    override fun onBindViewHolder(holder: MyAdapterChatApp.MyViewHolder, position: Int) {

        if (chat[position].flag==true) {
            holder.binding.editTextleftitem.setText(chat[position].msg)
            holder.binding.editTextleftitem.setBackgroundResource(R.drawable.round_image);
            holder.binding.editTextrightitem.visibility  = View.GONE

        }

        if (chat[position].flag==false) {
            holder.binding.editTextrightitem.setText(chat[position].msg)
            holder.binding.editTextrightitem.setBackgroundResource(R.drawable.round_image);
            holder.binding.editTextleftitem.visibility = View.GONE
        }
       // holder.binding.imageitem.setImageURI(chat[position].image.toString())


    }

    override fun getItemCount(): Int {
        return chat.size
    }
            class MyViewHolder(val binding: ItemViewChatAppBinding) : RecyclerView.ViewHolder(binding.root)

        }