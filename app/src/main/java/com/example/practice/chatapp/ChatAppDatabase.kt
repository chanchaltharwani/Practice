package com.example.practice.chatapp

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Chatmodel::class], version = 1)
abstract class ChatAppDatabase:RoomDatabase() {
    abstract fun ChatappDao(): ChatappDao

}