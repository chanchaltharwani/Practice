package com.example.practice.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.practice.R
import com.example.practice.database.StudentDatabse
import com.example.practice.dataclass.Student
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MyAdapterNamePhone(val students: List<Student>, var database: StudentDatabse) :
    RecyclerView.Adapter<MyAdapterNamePhone.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_view_name_phone, parent, false)
        //return MyViewHolder(view)
        return MyAdapterNamePhone.MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.editname.text = students[position].name
        holder.editphone.text = students[position].phone

        holder.buttondelete.setOnClickListener {
            GlobalScope.launch {
                database.studentDao().deleteStudent(students[position].id)
            }
        }
//        holder.buttonupdate.setOnClickListener{
//            GlobalScope.launch {
//                database.studentDao().updateStudent(students[id  ])
//            }
//        }


    }

    override fun getItemCount(): Int {
        return students.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var editname = itemView.findViewById<TextView>(R.id.tvname)
        var editphone = itemView.findViewById<TextView>(R.id.tvphone)
        var buttondelete = itemView.findViewById<TextView>(R.id.btndelete)
        var buttonupdate = itemView.findViewById<TextView>(R.id.btnupdate)

    }
}