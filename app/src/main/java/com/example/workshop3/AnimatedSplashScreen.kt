package com.example.workshop3

import android.annotation.SuppressLint
import android.app.Activity
import android.graphics.drawable.PaintDrawable
import android.media.Image
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import androidx.navigation.NavHostController
import com.example.workshop3.navigation.Screen
import com.example.workshop3.ui.theme.primary
import com.example.workshop3.ui.theme.primaryLight
import kotlinx.coroutines.delay

@Composable
fun AnimatedSplashScreen(navController: NavHostController){
    //coloring the top of the screen
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = primary.toArgb()
            window.navigationBarColor = primary.toArgb()

            WindowCompat.getInsetsController(window, view)
                .isAppearanceLightStatusBars = false

        }
    }
 //
    var startAnimation by remember { mutableStateOf(false) }
    val alphaAnim = animateFloatAsState(
        targetValue = if (startAnimation) 1f else 0f,
        animationSpec = tween(
            durationMillis = 3000
        )
    )

    LaunchedEffect(key1 = true) {
        startAnimation = true
        delay(4000)

        navController.popBackStack()
        navController.navigate(Screen.Home.route)
    }
    Splash(alpha = alphaAnim.value)


}


@Composable
fun Splash(alpha: Float) {


    Box(
        modifier = Modifier
            .background(if (isSystemInDarkTheme()) Color.Black else primary)
            .fillMaxSize(),

        contentAlignment = Alignment.Center
    ) {

        Image(
            painterResource(
                R.drawable.ic_curriculum_vitae
            ),
            "logo",
            modifier = Modifier
                .size(250.dp)
                .alpha(alpha = alpha),
        )
    }


}
/*@Composable
fun BarColorsTheme(darkTheme: Boolean = isSystemInDarkTheme()) {
    // ...
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = primary.toArgb()
            window.navigationBarColor = primary.toArgb()

            WindowCompat.getInsetsController(window, view)
                .isAppearanceLightStatusBars = darkTheme
            WindowCompat.getInsetsController(window, view)
                .isAppearanceLightNavigationBars = darkTheme
        }
    }
    // ...
}*/

/*
Scaffold(topBar = { TopAppBar(title = {Text("TopAppBar")},backgroundColor = primary)  } ,

    content = {
        Box(
            modifier = Modifier
                .background(if (isSystemInDarkTheme()) Color.Black else primary)
                .fillMaxSize(),

            contentAlignment = Alignment.Center
        ) {

            Image(
                painterResource(
                    R.drawable.ic_curriculum_vitae
                ),
                "logo",
                modifier = Modifier
                    .size(250.dp)
                    .alpha(alpha = alpha),
            )
        }
    })
 */

