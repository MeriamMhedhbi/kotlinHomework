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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.workshop3.navigation.Screen
import com.example.workshop3.ui.theme.primary
import com.example.workshop3.ui.theme.primaryDark
import com.example.workshop3.ui.theme.primaryLight

@Composable
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
fun SecondInterface(
    navController: NavHostController,
    fullName: String?,
    email: String?,
    age: String?,
    selected: String?
) {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text("Create Your Resume") },
            backgroundColor = primary
        )
    }) {
        /*Box() {
            Text(text = "helloworld $fullName ** $email ** $age ** $selected")
        }*/
        var sliderAndroid by remember { mutableStateOf(0f) }
        var sliderIos by remember { mutableStateOf(0f) }
        var sliderFlutter by remember { mutableStateOf(0f) }
        var Arabicchecked = remember { mutableStateOf(true) }
        var Frenchchecked = remember { mutableStateOf(true) }
        var Englishchecked = remember { mutableStateOf(true) }

        var Musicchecked = remember { mutableStateOf(true) }
        var Sportchecked = remember { mutableStateOf(true) }
        var Gameschecked = remember { mutableStateOf(true) }
        Column(
            modifier = Modifier
                .padding(15.dp)
                .fillMaxSize(),

            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(BorderStroke(2.dp, SolidColor(primary)), RoundedCornerShape(20.dp))
                    .padding(15.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = "SKILLS",
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = primaryDark,

                        )
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Android",
                        style = androidx.compose.ui.text.TextStyle(
                            fontSize = 15.sp,
                            color = primaryDark,

                            )
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Slider(value = sliderAndroid, onValueChange = { sliderAndroid = it })
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "IOS",
                        style = androidx.compose.ui.text.TextStyle(
                            fontSize = 15.sp,
                            color = primaryDark,

                            )
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Slider(value = sliderIos, onValueChange = { sliderIos = it })
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Flutter",
                        style = androidx.compose.ui.text.TextStyle(
                            fontSize = 15.sp,
                            color = primaryDark,

                            )
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Slider(value = sliderFlutter, onValueChange = { sliderFlutter = it })
                }

            }
            Spacer(modifier = Modifier.height(15.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(BorderStroke(2.dp, SolidColor(primary)), RoundedCornerShape(20.dp))
                    .padding(15.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = "Language",
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = primaryDark,

                        )
                )
                Spacer(modifier = Modifier.height(15.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {


                    Row(verticalAlignment = Alignment.CenterVertically) {

                        Checkbox(
                            checked = Arabicchecked.value,
                            onCheckedChange = { Arabicchecked.value = it },
                            colors = CheckboxDefaults.colors(primaryLight)
                        )
                        Text(text = "Arabic")
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {

                        Checkbox(
                            checked = Frenchchecked.value,
                            onCheckedChange = { Frenchchecked.value = it },
                            colors = CheckboxDefaults.colors(primaryLight)
                        )
                        Text(text = "French")
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {

                        Checkbox(
                            checked = Englishchecked.value,
                            onCheckedChange = { Englishchecked.value = it },
                            colors = CheckboxDefaults.colors(primaryLight)
                        )
                        Text(text = "English")
                    }
                }

            }
            Spacer(modifier = Modifier.height(15.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(BorderStroke(2.dp, SolidColor(primary)), RoundedCornerShape(20.dp))
                    .padding(15.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = "Hobbies",
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = primaryDark,

                        )
                )
                Spacer(modifier = Modifier.height(15.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {


                    Row(verticalAlignment = Alignment.CenterVertically) {

                        Checkbox(
                            checked = Musicchecked.value,
                            onCheckedChange = { Musicchecked.value = it },
                            colors = CheckboxDefaults.colors(primaryLight)
                        )
                        Text(text = "Music")
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {

                        Checkbox(
                            checked = Sportchecked.value,
                            onCheckedChange = { Sportchecked.value = it },
                            colors = CheckboxDefaults.colors(primaryLight)
                        )
                        Text(text = "Sport")
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {

                        Checkbox(
                            checked = Gameschecked.value,
                            onCheckedChange = { Gameschecked.value = it },
                            colors = CheckboxDefaults.colors(primaryLight)
                        )
                        Text(text = "Games")
                    }
                }

            }
            Spacer(modifier = Modifier.height(15.dp))
            Button(
                onClick = {
                    var lang1 = " "
                    var lang2 = " "
                    var lang3 = " "
                    var hobby1 = " "
                    var hobby2 = " "
                    var hobby3 = " "
                    if(Arabicchecked.value)
                        lang1 = "Arabic"
                    if(Frenchchecked.value)
                        lang2 = "French"
                    if(Englishchecked.value)
                        lang3 = "English"
                    if(Musicchecked.value)
                        hobby1 = "Music"
                    if(Gameschecked.value)
                        hobby2 = "Games"
                    if(Sportchecked.value)
                        hobby3 = "Sport"

                    navController.navigate(Screen.ThirdInterface.route + "/${fullName}"+ "/${email}"+"/${age}"+"/${selected}"+"/${sliderAndroid}"+"/${sliderIos}"+"/${sliderFlutter}"+"/${lang1}"+"/${lang2}"+"/${lang3}"+"/${hobby1}"+"/${hobby2}"+"/${hobby3}")


                },
                shape = RectangleShape,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)

            ) {
                Text(
                    text = "Submit",
                    style = androidx.compose.ui.text.TextStyle(fontSize = 20.sp,),
                )
            }
        }
    }
}