package com.example.practice.dataclass

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "student")
data class Student(
    @PrimaryKey(autoGenerate = true)
    var id:Int = 0,
    var name:String="",
    var phone:String=""

)