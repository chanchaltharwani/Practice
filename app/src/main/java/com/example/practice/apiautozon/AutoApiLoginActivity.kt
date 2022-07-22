package com.example.practice.apiautozon

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.practice.R
import com.example.practice.activity.MainActivityPraticeRV
import com.example.practice.databinding.ActivityAutoApiBinding
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class AutoApiLoginActivity : AppCompatActivity() {
    companion object {
        var BASE_URL = "https://demo.exultcybersolution.com/auto-zon/"

    }

    lateinit var binding: ActivityAutoApiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_auto_api)
        val logging = HttpLoggingInterceptor()
        logging.setLevel(HttpLoggingInterceptor.Level.BODY)
        val builder: OkHttpClient.Builder = OkHttpClient().newBuilder()
        builder.addInterceptor(logging)
        var retrofit =
            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(builder.build())
                .build()
        binding.btnSubmit.setOnClickListener {

            var apiInterface =
                retrofit.create(ApiInterface::class.java)//retrofit ko api interface se connect karte hai
                    .login(
                        binding.username.text.toString(),
                        binding.pass.text.toString()
                    )

            apiInterface.enqueue(object : Callback<AutoLoginResponseModel> {

                override fun onResponse(
                    call: Call<AutoLoginResponseModel>,
                    response: Response<AutoLoginResponseModel>
                ) {
                    if (response.body() != null) {
                        if (response.body()!!.status == "success") {

                            Toast.makeText(
                                this@AutoApiLoginActivity,
                                "succcess",
                                Toast.LENGTH_SHORT
                            ).show()

                            startActivity(
                                Intent(
                                    this@AutoApiLoginActivity,
                                    SellAutoZonActivity::class.java
                                )
                            )
                            //1st step object bate hai agr fragment m h to requiredactvity lti h

                            var  sharedpreferences : SharedPreferences = getSharedPreferences("my_db", Context.MODE_PRIVATE)
                            //2nd step editor bnate hai
                            val editor: SharedPreferences.Editor = sharedpreferences.edit()
                            //3rd step value put karne k liye
                            editor.putString("token", response.body()!!.data!!.token)
                            //4th step commit (save) karte hai
                            editor.commit()


                        } else {
                            Toast.makeText(this@AutoApiLoginActivity, "error", Toast.LENGTH_SHORT)
                                .show()
                        }

                        Log.d("suc", "success")

                    }

                }

                override fun onFailure(call: Call<AutoLoginResponseModel>, t: Throwable) {
                    Log.d("fail", "failure")
                }

            })


        }
    }
}