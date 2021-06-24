package com.movied.facebookcloneeko

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tombolmyfriends = findViewById<TextView>(R.id.id_myfriend)
        tombolmyfriends.setOnClickListener {
            val intent = Intent(this,Activity_MyFriends::class.java)
            startActivity(intent)
        }

        val tombolprofile = findViewById<TextView>(R.id.id_profile)
        tombolprofile.setOnClickListener {
            val intent = Intent(this,Activity_Profile::class.java)
            startActivity(intent)
        }

        val tombolposts = findViewById<TextView>(R.id.btn_post)
        tombolposts.setOnClickListener {
            val intent = Intent(this,Activity_Posts::class.java)
            startActivity(intent)
        }
    }
}