package com.example.practice.camera

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.FileProvider
import androidx.databinding.DataBindingUtil
import com.example.practice.R
import com.example.practice.databinding.ActivityCameraBinding
import java.io.File
import kotlin.contracts.contract

class CameraActivity : AppCompatActivity() {
    lateinit var binding:ActivityCameraBinding
    lateinit var imgview : ImageView
    lateinit var btnChange:Button
    lateinit var imageUri: Uri
    private val contract = registerForActivityResult(ActivityResultContracts.TakePicture()){
        binding.imageView.setImageURI(imageUri)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_camera)
     //   setContentView(R.layout.activity_camera)

        imgview = binding.imageView
        btnChange = findViewById(R.id.btnchange)
        imageUri = createImageUri()!!

       binding. btnchange.setOnClickListener {
            contract.launch(imageUri)
        }
    }
    private fun createImageUri(): Uri? {
        val image = File(applicationContext.filesDir,"camera_photo.png")

        return FileProvider.getUriForFile(applicationContext,"com.example.practice.fileProvider"
        ,image
        )

    }
}