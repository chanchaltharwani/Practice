package com.example.practice.apiautozon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.practice.R
import com.example.practice.activity.MainActivityPraticeRV
import com.example.practice.databinding.ActivityAutoApiSignupBinding
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class AutoApiSignupActivity : AppCompatActivity() {
    lateinit var  binding:ActivityAutoApiSignupBinding
    companion object {
        var BASE_URL = "https://demo.exultcybersolution.com/auto-zon/"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = DataBindingUtil.setContentView(this,R.layout.activity_auto_api_signup)
        val logging = HttpLoggingInterceptor()
        logging.setLevel(HttpLoggingInterceptor.Level.BODY)
        val builder: OkHttpClient.Builder = OkHttpClient().newBuilder()
        builder.addInterceptor(logging)
        var retrofit =
            Retrofit.Builder()
                .baseUrl(AutoApiLoginActivity.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(builder.build())
                .build()
        binding.btnSubmit.setOnClickListener {

            var apiInterface =
                retrofit.create(ApiInterface::class.java)//retrofit ko api interface se connect karte hai
                    .signup(
                        binding.username.text.toString(),
                        binding.email.text.toString(),
                        binding.pass.text.toString()
                    )

            apiInterface.enqueue(object : Callback<AutoSignopResponseModel> {

                override fun onResponse(
                    call: Call<AutoSignopResponseModel>,
                    response: Response<AutoSignopResponseModel>
                ) {
                    if (response.body() != null) {
                        if (response.body()!!.status == "success") {
                            startActivity(
                                Intent(
                                    this@AutoApiSignupActivity,
                                    AutoApiLoginActivity::class.java
                                )
                            )
                            Toast.makeText(
                                this@AutoApiSignupActivity,
                                "succcess",
                                Toast.LENGTH_SHORT
                            ).show()
                        } else {
                            Toast.makeText(this@AutoApiSignupActivity, "error", Toast.LENGTH_SHORT)
                                .show()
                        }

                        Log.d("suc", "success")

                    }

                }

                override fun onFailure(call: Call<AutoSignopResponseModel>, t: Throwable) {
                    Log.d("fail", "failure")
                }

            })


        }



    }
}