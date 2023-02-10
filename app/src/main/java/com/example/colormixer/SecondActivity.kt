package com.example.colormixer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_interface)

        //val bundle:Bundle? = intent.extras
        /*val id = bundle.getBundle("id_value") get("id_value")
        val language = bundle.get("language_value")*/
       /* Toast.makeText(applicationContext,id.toString()+" "+language,Toast.LENGTH_LONG).show()
        button2.setOnClickListener(){
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }*/
    }
}