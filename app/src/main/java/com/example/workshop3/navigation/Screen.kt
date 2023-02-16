package com.example.workshop3.navigation

sealed class Screen(val route: String) {
    object Splash : Screen("splash_screen")
    object Home : Screen("home_screen")
    object SecondInterface : Screen("second_screen")
    object ThirdInterface : Screen("third_screen")
}