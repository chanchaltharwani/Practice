package com.example.practice.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.practice.dao.StudentDAO
import com.example.practice.dataclass.Student


@Database(entities = [Student::class], version = 3)
    abstract class StudentDatabse:RoomDatabase() {

    abstract fun studentDao():StudentDAO
}