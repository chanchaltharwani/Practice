package com.example.practice.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.practice.dataclass.Student

@Dao
interface StudentDAO {

    @Insert
    suspend fun insertStudent(student: Student)

    @Update
    suspend fun updateStudent(student: Student)

//    @Delete
//  suspend fun deleteStudent(student: Student)

    @Query("DELETE FROM student WHERE id = :id")
   abstract fun deleteStudent(id:Int)


    @Query("SELECT * FROM student")
    fun getStudent(): LiveData<List<Student>>

}