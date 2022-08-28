package com.example.practice.chatapp

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ChatappDao {


    @Insert
    suspend fun insertChatData(chat: Chatmodel)

    @Update
    suspend fun updateChatdata(chat: Chatmodel)

//   @Delete
//  suspend fun deleteSignupData(signup: SignupModel)


    @Query("DELETE FROM chat")
    fun deleteAll()



    @Query("DELETE FROM chat WHERE id = :id")
    abstract fun deleteChatData(id:Int)


    @Query("SELECT * FROM chat")
    fun getChatData(): LiveData<List<Chatmodel>>



}