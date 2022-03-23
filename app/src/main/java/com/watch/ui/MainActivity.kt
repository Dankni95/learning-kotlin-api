package com.watch.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.watch.adapter.CryptoAdapter
import com.watch.data.vo.AddressDetails


class MainActivity : AppCompatActivity() {
    private lateinit var staggeredLayoutManager: StaggeredGridLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()





    }

    private fun loadData() {
        val githubInitViewModel = ViewModelProvider(this).get(CryptoViewModel::class.java)
        githubInitViewModel.getCryptoData()
        githubInitViewModel.cryptoData.observe(this) {
            initAdapter(it)
        }
    }
    private fun initAdapter(data: AddressDetails){
        val recyclerView : RecyclerView = findViewById(R.id.list)

        staggeredLayoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = staggeredLayoutManager
        // This will pass the ArrayList to our Adapter
        val adapter = CryptoAdapter(data)
        // Setting the Adapter with the recyclerview
        recyclerView.adapter = adapter
    }

}