package com.movied.facebookcloneeko

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.bottomsheet.BottomSheetDialog
import java.util.zip.Inflater

class Activity_Profile : AppCompatActivity(){

    var issportclicked = false
    var ismovieclicked = false
    var ismusicclicked = false
    var isgamesclicked = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.profile_page)

        val clickprivacy = findViewById<TextView>(R.id.textView3)
        clickprivacy.setOnClickListener {
            val bottomsheet = BottomSheetDialog(this)
            val layoutbottomsheet = layoutInflater.inflate(R.layout.bottomsheet_privacy,null)

            val private = layoutbottomsheet.findViewById<TextView>(R.id.btn_private)
            private.setOnClickListener {
                clickprivacy.text = ("Private")
                bottomsheet.dismiss()
            }
            val public = layoutbottomsheet.findViewById<TextView>(R.id.btn_public)
            public.setOnClickListener {
                clickprivacy.text = ("Public")
                bottomsheet.dismiss()
            }
            bottomsheet.setContentView(layoutbottomsheet)
            bottomsheet.show()
        }

        val clickinterest = findViewById<TextView>(R.id.textView5)
        clickinterest.setOnClickListener {
            val bottomsheet = BottomSheetDialog(this)
            val layoutbottomsheet = layoutInflater.inflate(R.layout.bottomsheet_interest,null)
            val clicksave = layoutbottomsheet.findViewById<TextView>(R.id.btn_save)
            clicksave.setOnClickListener {
                var chooseinterest = ""

                if (issportclicked){
                    chooseinterest += " Sport "
                }
                if (ismovieclicked){
                    chooseinterest += " Movie "
                }
                if (ismusicclicked){
                    chooseinterest += " Music "
                }
                if (isgamesclicked){
                    chooseinterest += " Game "
                }
                clickinterest.setText(chooseinterest)
                bottomsheet.dismiss()
            }

            val itemsport = layoutbottomsheet.findViewById<TextView>(R.id.btn_sport)
            val itemmovie = layoutbottomsheet.findViewById<TextView>(R.id.btn_movie)
            val itemmusic = layoutbottomsheet.findViewById<TextView>(R.id.btn_music)
            val itemgame = layoutbottomsheet.findViewById<TextView>(R.id.btn_game)

            if (issportclicked) {
                itemsport.background = ResourcesCompat.getDrawable(resources, R.color.blue, theme)
            }
            itemsport.setOnClickListener {
                issportclicked = !issportclicked
                if (issportclicked){
                    itemsport.background = ResourcesCompat.getDrawable(resources, R.color.blue, theme)
                }else{
                    itemsport.background = ResourcesCompat.getDrawable(resources,R.color.white,theme)
                }
            }

            if (ismovieclicked){
                itemmovie.background  = ResourcesCompat.getDrawable(resources, R.color.blue, theme)
                }
            itemmovie.setOnClickListener {
                ismovieclicked = !ismovieclicked
                if (ismovieclicked){
                    itemmovie.background = ResourcesCompat.getDrawable(resources, R.color.blue, theme)
            }else{
                    itemmovie.background = ResourcesCompat.getDrawable(resources,R.color.white,theme)
                }
            }

            if (ismusicclicked){
                itemmusic.background  = ResourcesCompat.getDrawable(resources, R.color.blue, theme)
            }
            itemmusic.setOnClickListener {
                ismusicclicked = !ismusicclicked
                if(ismusicclicked){
                    itemmusic.background = ResourcesCompat.getDrawable(resources, R.color.blue, theme)
                }else{
                    itemmusic.background = ResourcesCompat.getDrawable(resources,R.color.white,theme)
                }
            }

            if (isgamesclicked){
                itemgame.background  = ResourcesCompat.getDrawable(resources, R.color.blue, theme)
            }
            itemgame.setOnClickListener {
                isgamesclicked = !isgamesclicked
                if(isgamesclicked){
                    itemgame.background = ResourcesCompat.getDrawable(resources, R.color.blue, theme)
                }else{
                    itemgame.background = ResourcesCompat.getDrawable(resources,R.color.white,theme)
                }
            }

            bottomsheet.setContentView(layoutbottomsheet)
            bottomsheet.show()
        }
    }
}