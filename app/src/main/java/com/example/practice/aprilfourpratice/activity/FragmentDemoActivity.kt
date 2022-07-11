package com.example.practice.aprilfourpratice.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.practice.R
import com.example.practice.aprilfourpratice.fragment.CallFragment
import com.example.practice.aprilfourpratice.fragment.ChatFragment
import com.example.practice.aprilfourpratice.fragment.StatusFragment

class FragmentDemoActivity : AppCompatActivity(), View.OnClickListener {
    var btnchat: Button? = null
    var btncall: Button? = null
    var btnstatus: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        intiView()

        callFragment(ChatFragment())
    }

    private fun callFragment(fragment: Fragment) {
       // Log.e("1","chanchuu")
        supportFragmentManager.beginTransaction().replace(R.id.framelayout, fragment).commit()
    }

    private fun intiView() {
        btnchat = findViewById(R.id.btnchat)
        btncall = findViewById(R.id.btncall)
        btnstatus = findViewById(R.id.btnstatus)
        btnchat?.setOnClickListener(this)
        btncall?.setOnClickListener(this)
        btnstatus?.setOnClickListener(this)

//        btnchat!!.setOnClickListener {
//            callFragment(ChatFragment())
//        }


    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnchat -> {
                callFragment(ChatFragment())
            }

            R.id.btncall -> {
                callFragment(CallFragment())
            }
            R.id.btnstatus -> {
                callFragment(StatusFragment())
            }
        }
    }

}