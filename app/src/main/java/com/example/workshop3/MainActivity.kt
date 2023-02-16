package com.example.workshop3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.workshop3.navigation.setupNavGraph
import com.example.workshop3.ui.theme.SplashScreenTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            SplashScreenTheme {
                val navController = rememberNavController()
                setupNavGraph(navController = navController)
            }
        }
    }
}