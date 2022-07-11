package com.example.practice.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.widget.SearchView
import com.example.practice.R


class SearchActivityPratice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_pratice)

        val search = findViewById<SearchView>(R.id.searchview)
        val list = findViewById<ListView>(R.id.listview)
        //Log.d("tag","")
        val countries =  arrayOf("India"," USA","China","Sri Lanka","Germany","Fran","Nepal","Brazil",
            "Pakistan","Japan","England")
        val countryAdap:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,countries)
         list.adapter = countryAdap
        search.setOnQueryTextListener(object:SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
               return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {

                countryAdap.filter.filter(newText)
               return false
            }

        })
    }
}

private fun SearchView.setOnQueryTextListener(onQueryTextListener: SearchView.OnQueryTextListener, function: () -> Unit) {

}
