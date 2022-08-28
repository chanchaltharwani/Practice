package com.example.practice.chatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.example.practice.R
import com.example.practice.databinding.ActivityChatBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ChatActivity : AppCompatActivity() {
    lateinit var binding: ActivityChatBinding
    //property of database
    lateinit var database: ChatAppDatabase
    var flag: Boolean = true
    lateinit var btnShare: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_chat)
        //initialize the database property
        database = Room.databaseBuilder(applicationContext, ChatAppDatabase::class.java, "chatDB")
            .build()
        getData()
        binding.buttonChatDelete.setOnClickListener {
            GlobalScope.launch {
                database.ChatappDao().deleteAll()
            }
        }
        binding.sendbtn.setOnClickListener {
            //editTextLeftMsg.setText("")
            var msg = binding.editTextLeftMsg.text.toString().trim()

         //   Log.d("tag", msg)
            GlobalScope.launch {
                database.ChatappDao()
                    .insertChatData(
                        Chatmodel(
                            0,
                            binding.editTextLeftMsg.text.toString(),
                            true

                        )
                    )
            }
            getData()
            binding.editTextLeftMsg.setText("")
        }
        binding.sendbtnn.setOnClickListener {
            var msgg = binding.editTextRightMsg.text.toString().trim()
            //Log.d("1st", msgg)

            GlobalScope.launch {
                database.ChatappDao()
                    .insertChatData(
                        Chatmodel(
                            0,
                            binding.editTextRightMsg.text.toString(),
                            false

                        )
                    )
            }
            getData()
            binding.editTextRightMsg.setText("")
        }
    }

    private fun getData() {
        database.ChatappDao().getChatData().observe(this, Observer {
            //Log.d("chanchal", it.toString())

           binding. rvChat.adapter = MyAdapterChatApp(this,it, database)
            binding.rvChat.layoutManager = LinearLayoutManager(this)
            if(it.size>0)
               binding. rvChat.smoothScrollToPosition(it.size -1)
        })
    }
}