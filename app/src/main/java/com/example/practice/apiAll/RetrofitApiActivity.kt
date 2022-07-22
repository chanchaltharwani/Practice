package com.example.practice.apiAll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practice.R
import com.example.practice.databinding.ActivityRetrofitApiBinding
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class RetrofitApiActivity : AppCompatActivity() {
    lateinit var adapter: NewsAdapterApi
    private lateinit var binding: ActivityRetrofitApiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_retrofit_api)

        //method bnaege ek news access karne k liye
        getNews()


    }

    private fun getNews() {
        val news = NewsService.newsInstance.getHeadlines("in", 1)
        news.enqueue(object : retrofit2.Callback<News> {

            override fun onFailure(call: Call<News>, t: Throwable) {
                Log.d("chanchal", news.toString())

            }

            override fun onResponse(call: Call<News>, response: Response<News>) {
                val news = response.body()
                if (news != null) {
                    Log.d("apppiii", news.toString())
                    adapter = NewsAdapterApi(this@RetrofitApiActivity,news.articles)
                   binding. NewsListRv.adapter = adapter
                  binding.  NewsListRv.layoutManager = LinearLayoutManager(this@RetrofitApiActivity)


                }

            }


        })
    }
}