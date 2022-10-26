package com.example.practice.gallryimage

import android.annotation.SuppressLint
import android.content.ContentResolver
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.provider.OpenableColumns
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.practice.R
import com.example.practice.databinding.ActivityGalleryImageBinding
import java.io.File


class GalleryImageActivity : AppCompatActivity() {
    lateinit var binding: ActivityGalleryImageBinding
    lateinit var imageView: ImageView
    lateinit var button: Button
    private val pickImage = 100
    private var imageUri: Uri? = null
    private lateinit var textView:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_gallery_image)

        imageView = binding.imageView
        button = binding.buttonLoadPicture
        textView = binding.name
        button.setOnClickListener {
            //select image
            val galleryone = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI)
            //select pdf
            val gallerytwo = Intent(Intent.ACTION_GET_CONTENT, MediaStore.Images.Media.INTERNAL_CONTENT_URI)
            startActivityForResult(gallerytwo, pickImage)
            startActivity(gallerytwo)
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK && requestCode == pickImage) {
            imageUri = data?.data
           // Log.e("GGGGGGG", "onActivityResult:--- " + imageUri)
            val uri = data!!.data
            val file = File(uri!!.path)
            val nameView = binding.name
            nameView.setText("" + getFileMetaData(this,imageUri!!)!!.displayName.toString())
            Log.e("GGGGGGG", "onActivityResult:--- " +  getFileMetaData(this, imageUri!!)!!.displayName.toString())
            imageView.setImageURI(imageUri)
        }
    }



    @SuppressLint("Range")
    fun getFileMetaData(context: Context, uri: Uri): FileMetaData? {
        val fileMetaData = FileMetaData()
        return if ("file".equals(uri.scheme, ignoreCase = true)) {
            val file = File(uri.path)
            fileMetaData.displayName = file.name
            fileMetaData.size = file.length()
            fileMetaData.path = file.path
            fileMetaData
        } else {
            val contentResolver: ContentResolver = context.getContentResolver()
            val cursor = contentResolver.query(uri, null, null, null, null)
            fileMetaData.mimeType = contentResolver.getType(uri)
            try {
                if (cursor != null && cursor.moveToFirst()) {
                    val sizeIndex = cursor.getColumnIndex(OpenableColumns.SIZE)
                    fileMetaData.displayName =
                        cursor.getString(cursor.getColumnIndex(OpenableColumns.DISPLAY_NAME))
                    if (!cursor.isNull(sizeIndex)) fileMetaData.size =
                        cursor.getLong(sizeIndex) else fileMetaData.size = -1
                    try {
                        fileMetaData.path = cursor.getString(cursor.getColumnIndexOrThrow("_data"))
                    } catch (e: Exception) {
                        // DO NOTHING, _data does not exist
                    }
                    return fileMetaData
                }
            } catch (e: Exception) {
                // Log.e(Log.TAG_CODE, e)
            } finally {
                cursor?.close()
            }
            null
        }
    }

}


class FileMetaData {
    var displayName: String? = null
    var size: Long = 0
    var mimeType: String? = null
    var path: String? = null
    override fun toString(): String {
        return "name : $displayName ; size : $size ; path : $path ; mime : $mimeType"
    }
}

