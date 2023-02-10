package com.example.colormixer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonMix = findViewById<Button>(R.id.test)

        buttonMix.setOnClickListener() {
            intent = Intent(this, SecondActivity::class.java)

           /* intent.putExtra("id_value", id)
            intent.putExtra("language_value", language)*/
            startActivity(intent)
        }
    }
}

