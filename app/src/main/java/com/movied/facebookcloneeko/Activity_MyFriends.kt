package com.movied.facebookcloneeko

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.movied.facebookcloneeko.R

class Activity_MyFriends : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.myfriend_page)
        val namabudi = findViewById<TextView>(R.id.id_akun)
        namabudi.setOnClickListener {
            val intent = Intent(this, Activity_Detail_Budi::class.java)
            startActivity(intent)
        }
        val namaadam = findViewById<TextView>(R.id.id_akun2)
        namaadam.setOnClickListener {
            val intent = Intent(this, Activity_Detail_adam::class.java)
            startActivity(intent)
        }
        val namatedi = findViewById<TextView>(R.id.id_akun3)
        namatedi.setOnClickListener {
            val intent = Intent(this, Activity_Detail_tedi::class.java)
            startActivity(intent)
        }
    }
}