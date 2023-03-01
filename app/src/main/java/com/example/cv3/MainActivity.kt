package com.example.cv3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private var btnCareer : Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title= "Curriculum Vitae"
        btnCareer= findViewById(R.id.buttonCareer)
        btnCareer!!.setOnClickListener {
            val intent = Intent(this, Lists::class.java)
            startActivity(intent)
        }
    }
}