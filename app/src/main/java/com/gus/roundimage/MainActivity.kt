package com.gus.roundimage

import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val img = BitmapFactory.decodeResource(resources, R.drawable.roundimage)
        val round = RoundedBitmapDrawableFactory.create(resources, img)

        //Radius Rounded
        round.cornerRadius = 25f
        //make Circle image
        //round.isCircular = true
        imageView2.setImageDrawable(round)

    }
}
