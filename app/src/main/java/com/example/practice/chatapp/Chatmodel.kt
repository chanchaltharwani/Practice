package com.example.practice.chatapp
import android.net.Uri
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "chat")
class Chatmodel(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var msg: String,
    var flag: Boolean
)