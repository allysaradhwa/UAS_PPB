package com.example.rentme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.TelephonyCallback.UserMobileDataStateListener
import android.widget.ImageView

class DuaActivity : AppCompatActivity() {
    private lateinit var img: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dua)
        img = findViewById(R.id.img_scan)
        img.setOnClickListener {
            startActivity(Intent(this, BookingActivity::class.java))
            img = findViewById(R.id.img_scan2)
            img.setOnClickListener {
                startActivity(Intent(this, Informasi::class.java))

            }


        }


    }
}
