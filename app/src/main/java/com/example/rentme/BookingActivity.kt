package com.example.rentme

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class BookingActivity : AppCompatActivity() {
    private lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking)

        var btn_booking = findViewById(R.id.btn_booking) as Button

        btn_booking.setOnClickListener {
            AlertDialog.Builder(this)
                    val intent = Intent(this, DataActivity::class.java)
                    startActivity(intent)
                }
        }
    }
