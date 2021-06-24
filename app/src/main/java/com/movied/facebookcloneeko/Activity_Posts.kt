package com.movied.facebookcloneeko

import Model.Posts
import Network.ApiClient
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.Dispatchers

class Activity_Posts : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.rv_posts)

        var listpost : List<Posts> = listOf()
        lifecycleScope.launchWhenCreated {
            with(Dispatchers.IO){
                val response : List<Posts> = ApiClient.geApiServices().getFacebook()

                listpost = response
                println ("ceksize ${listpost.size}")

                val adapterpost = Adapter_Posts(listpost)

                val postrv = findViewById<RecyclerView>(R.id.recyclerview)
                postrv.adapter = adapterpost
            }
        }
    }
}