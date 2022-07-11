package com.example.practice.activity

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.practice.R
import com.example.practice.adapter.MyAdapterNamePhone
import com.example.practice.database.StudentDatabse
import com.example.practice.databinding.ActivityMainPraticeRvBinding
import com.example.practice.databinding.ActivityMainRoomDatabsePraticeBinding
import com.example.practice.dataclass.Student
import kotlinx.android.synthetic.main.activity_main_room_databse_pratice.*
import kotlinx.android.synthetic.main.item_view_name_phone.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivityRoomDatabsePratice : AppCompatActivity() {
    lateinit var binding: ActivityMainRoomDatabsePraticeBinding
    lateinit var database: StudentDatabse
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main_room_databse_pratice)
        //setContentView(R.layout.activity_main_room_databse_pratice)
        database = Room.databaseBuilder(applicationContext, StudentDatabse::class.java, "studentDB")
                .build()
//
//        btndelete.setOnClickListener {
//            GlobalScope.launch {
//                database.studentDao().deleteStudent(students[position].id)
//            }
//
//        }
        binding.btnSubmit.setOnClickListener {
            GlobalScope.launch {
                database.studentDao().insertStudent(Student(0, "chanchal tharwani", "8976543234["))
                database.studentDao()
                    .insertStudent(Student(0, name.text.toString(), phone.text.toString()))


            }
            getData()


//            // deleteStudent(11)
            // updateStudent()
//
//        }
        }


        //    fun  deleteStudent( id :Int){
//        GlobalScope.launch {
//            database.studentDao().deleteStudent(id)
//        }
//        getData()
//    }
//        fun updateStudent(){
//            GlobalScope.launch {
//                database.studentDao().updateStudent(student = Student(14,"garvit","76547688"))
//            }
//            getData()
//        }
    }

    fun getData() {
        database.studentDao().getStudent().observe(this, Observer {
            Log.d("chanchal", it.toString())
            binding.RVNamePhone.adapter = MyAdapterNamePhone(it, database)
            binding.RVNamePhone.layoutManager = LinearLayoutManager(this)
        })

    }


}


//
//btnsave.setOnClickListener {
//
//    GlobalScope.launch {
//
//        database.EdsDAO().insertEds(Usereds(0,editText1.text.toString(),spinnerid.selectedItem.toString(),editText2.text.toString()))
//
//    }
//    getData()
//}
////        deleteEds(5)
////        updateEds(2)
//}
//fun getData() {
//    database.EdsDAO().getEds().observe(this, Observer {
//        Log.d("chanchal",it.toString())
//        EDS.adapter = MyAdapter(it,database)
//        EDS.layoutManager = LinearLayoutManager(this)
//
//    })
//}