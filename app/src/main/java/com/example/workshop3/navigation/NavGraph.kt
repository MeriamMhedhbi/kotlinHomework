package com.example.workshop3.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.workshop3.AnimatedSplashScreen
import com.example.workshop3.FirstInterface
import com.example.workshop3.SecondInterface
import com.example.workshop3.ThirdInterface

@Composable
fun setupNavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {
        composable(route = Screen.Splash.route) {
            AnimatedSplashScreen(navController = navController)
        }
        composable(route = Screen.Home.route) {
            FirstInterface(navController = navController)
        }
        composable(route = Screen.SecondInterface.route+"/{fullName}"+"/{email}"+"/{age}"+"/{selected}") { navBackStack ->

            // Extracting the argument
            val fullName = navBackStack.arguments?.getString("fullName")
            val email = navBackStack.arguments?.getString("email")
            val age = navBackStack.arguments?.getString("age")
            val selected = navBackStack.arguments?.getString("selected")

            SecondInterface(navController = navController,fullName= fullName,email=email,age=age,selected=selected)

        }
        composable(route = Screen.ThirdInterface.route+"/{fullName}"+"/{email}"+"/{age}"+"/{selected}"+"/{sliderAndroid}"+"/{sliderIos}"+"/{sliderFlutter}"+"/{lang1}"+"/{lang2}"+"/{lang3}"+"/{hobby1}"+"/{hobby2}"+"/{hobby3}") { navBackStack ->

            // Extracting the argument
            val fullName = navBackStack.arguments?.getString("fullName")
            val email = navBackStack.arguments?.getString("email")
            val age = navBackStack.arguments?.getString("age")
            val selected = navBackStack.arguments?.getString("selected")
            val sliderAndroid = navBackStack.arguments?.getString("sliderAndroid")
            val sliderIos = navBackStack.arguments?.getString("sliderIos")
            val sliderFlutter = navBackStack.arguments?.getString("sliderFlutter")
            val lang1 = navBackStack.arguments?.getString("lang1")
            val lang2 = navBackStack.arguments?.getString("lang2")
            val lang3 = navBackStack.arguments?.getString("lang3")
            val hobby1 = navBackStack.arguments?.getString("hobby1")
            val hobby2 = navBackStack.arguments?.getString("hobby2")
            val hobby3 = navBackStack.arguments?.getString("hobby3")

            ThirdInterface(navController = navController, fullName = fullName , email = email, age = age, selected =selected,sliderAndroid=sliderAndroid,sliderIos = sliderIos,sliderFlutter=sliderFlutter,lang1=lang1,lang2=lang2,lang3=lang3,hobby1=hobby1,hobby2=hobby2,hobby3=hobby3 )

        }
    }
}