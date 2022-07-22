package com.example.practice.aprilfourteen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import androidx.databinding.DataBindingUtil
import com.example.practice.R
import com.example.practice.databinding.ActivityStopwatchBinding

class StopwatchActivity : AppCompatActivity() {
    var pauseAt: Long = 0
    lateinit var binding: ActivityStopwatchBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_stopwatch)
        //setContentView(R.layout.activity_stopwatch)

        binding.btnstart.setOnClickListener {

          binding.  stopwatch.base = SystemClock.elapsedRealtime() - pauseAt

            binding.stopwatch.start()


        }

        binding.btnpause.setOnClickListener {
            pauseAt = SystemClock.elapsedRealtime() -binding. stopwatch.base
            binding.stopwatch.stop()
        }

        binding.btnreset.setOnClickListener {
          binding.  stopwatch.base = SystemClock.elapsedRealtime()
        }

    }
}