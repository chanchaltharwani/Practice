package com.example.practice.apiautozon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practice.R
import com.example.practice.databinding.ActivityHomeAutoZonBinding
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


class HomeAutoZonActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeAutoZonBinding
    companion object {
        var BASE_URL = "https://demo.exultcybersolution.com/auto-zon/"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home_auto_zon)

        val logging = HttpLoggingInterceptor()
        logging.setLevel(HttpLoggingInterceptor.Level.BODY)

        //builder ... isko apn retrofit client me pass krte h (interseptor) ->2
        val builder: OkHttpClient.Builder = OkHttpClient().newBuilder().readTimeout(5 , TimeUnit.MINUTES).connectTimeout(5 , TimeUnit.MINUTES).writeTimeout(5 , TimeUnit.MINUTES)


        //logger obj add kr diya ->3
        builder.addInterceptor(logging)

        var retrofit =
            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()) // we need to add converter factory to // convert JSON object to Java object
                //-> 4 buiilder added to client
                .client(builder.build())
                .build()

        var apiInterface = retrofit.create(ApiInterface::class.java).getHomeDetails(
          ""

        )
        apiInterface.enqueue(object : Callback<HomeAutozonResponseModel> {

            override fun onResponse(
                call: Call<HomeAutozonResponseModel>,
                response: Response<HomeAutozonResponseModel>
            ) {
                if (response.body() != null) {
                    if (response.body()!!.code == 200) {
                        Log.d("suc`", response.body()!!.status.toString())
                    }



                }
            }

            override fun onFailure(call: Call<HomeAutozonResponseModel>, t: Throwable) {
                Log.d("fail", "failure")
            }
        }
        )


    }
}