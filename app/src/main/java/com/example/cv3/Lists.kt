package com.example.cv3

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment

class Lists : AppCompatActivity() {
    private lateinit var btnExp: Button
    private lateinit var btnEducation: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lists)
        title = "Your Career"
        /*val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)*/

        btnExp = findViewById(R.id.btnExp)
        btnEducation = findViewById(R.id.btnEducation)

        btnExp.setOnClickListener {
            changeFragment(ExperienceFragment(), "")
        }

        btnEducation.setOnClickListener {
            changeFragment(EducationFragment(), "")
        }


        supportFragmentManager.beginTransaction().add(R.id.fragment_container, ExperienceFragment())
            .commit()

    }

    private fun changeFragment(fragment: Fragment, name: String) {

        if (name.isEmpty())
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment)
                .commit()
        else
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment)
                .addToBackStack(name).commit()

    }
}