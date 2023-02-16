package com.example.workshop3

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.workshop3.ui.theme.primary
import com.example.workshop3.ui.theme.primaryDark
import com.example.workshop3.ui.theme.primaryLight

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ThirdInterface(
    navController: NavHostController,
    fullName: String?,
    email: String?,
    age: String?,
    selected: String?,
    sliderAndroid: String?,
    sliderIos: String?,
    sliderFlutter: String?,
    lang1: String?,
    lang2: String?,
    lang3: String?,
    hobby1: String?,
    hobby2: String?,
    hobby3: String?,
) {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text("Create Your Resume") },
            backgroundColor = primary
        )
    }) {
        Spacer(modifier = Modifier.height(10.dp))
        Column(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxHeight()
                .fillMaxWidth()
                .border(BorderStroke(2.dp, SolidColor(primary)), RoundedCornerShape(20.dp))
                .padding(20.dp),

        ) {
            Text(
                text = "Name : $fullName",
                style = TextStyle(
                    fontSize = 18.sp,
                    color = primary,
                )
            )
            Text(
                text = "Email : $email",
                style = TextStyle(
                    fontSize = 18.sp,
                    color = primary,
                )

            )
            Text(
                text = "Age : $age",
                style = TextStyle(
                    fontSize = 18.sp,
                    color = primary,
                )

            )
            Text(
                text = "Gender : $selected",
                style = TextStyle(
                    fontSize = 18.sp,
                    color = primary,
                )

            )
            Text(
                text = "Android Skill : $sliderAndroid",
                style = TextStyle(
                    fontSize = 18.sp,
                    color = primary,
                )

            )
            Text(
                text = "Ios Skill : $sliderIos",
                style = TextStyle(
                    fontSize = 18.sp,
                    color = primary,
                )

            )
            Text(
                text = "Flutter Skill : $sliderFlutter",
                style = TextStyle(
                    fontSize = 18.sp,
                    color = primary,
                )

            )
            Text(
                text = "Languages : $lang1 $lang2 $lang3",
                style = TextStyle(
                    fontSize = 18.sp,
                    color = primary,
                )

            )
            Text(
                text = "Hobbies : $hobby1 $hobby2 $hobby3",
                style = TextStyle(
                    fontSize = 18.sp,
                    color = primary,
                )

            )
        }

    }

}

