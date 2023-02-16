package com.example.workshop3

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.workshop3.navigation.Screen
import com.example.workshop3.ui.theme.primary
import com.example.workshop3.ui.theme.primaryDark
import com.example.workshop3.ui.theme.primaryLight
import java.time.format.TextStyle
import androidx.compose.material.Text as Text

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun FirstInterface(navController: NavHostController) {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text("Create Your Resume") },
            backgroundColor = primary
        )
    },

        content = {
            Column(
                modifier = Modifier
                    .padding(15.dp)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,

                ) {

                //var
                val fullName = remember {
                    mutableStateOf("")
                }

                val email = remember {
                    mutableStateOf("")
                }

                val age = remember {
                    mutableStateOf("")
                }

                var selected by remember {
                    mutableStateOf("Male")
                }
                var isErrorFN by rememberSaveable { mutableStateOf(false) }
                var isErrorAge by rememberSaveable { mutableStateOf(false) }
                var isErrorEmail by rememberSaveable { mutableStateOf(false) }
                //

                Spacer(modifier = Modifier.height(15.dp))
                Image(
                    painterResource(
                        R.drawable.icons8_male_user_96
                    ),
                    "logo",
                    modifier = Modifier
                        .size(150.dp),
                )
                Spacer(modifier = Modifier.height(15.dp))
                OutlinedTextField(
                    label = { Text(text = "FullName") },
                    modifier = Modifier.fillMaxWidth(),
                    value = fullName.value,
                    isError = isErrorFN,
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "name",
                            tint = primaryLight
                        )
                    },
                    onValueChange = { fullName.value = it },
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        backgroundColor = Color(0xFFFFFFFF),

                        )
                )
                if (isErrorFN) {
                    Text(
                        text = "Error message",
                        color = MaterialTheme.colors.error,
                        style = MaterialTheme.typography.caption,
                        modifier = Modifier.padding(start = 16.dp)
                    )
                }

                Spacer(modifier = Modifier.height(15.dp))

                OutlinedTextField(
                    label = { Text(text = "Email") },
                    value = email.value,
                    onValueChange = { email.value = it },
                    isError = isErrorEmail ,
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription = "name",
                            tint = primaryLight
                        )
                    },


                    modifier = Modifier.fillMaxWidth(),
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = Color(0xFFFFFFFF)
                    ),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                )
                if (isErrorEmail) {
                    Text(
                        text = "Error message",
                        color = MaterialTheme.colors.error,
                        style = MaterialTheme.typography.caption,
                        modifier = Modifier.padding(start = 16.dp)
                    )
                }
                Spacer(modifier = Modifier.height(15.dp))

                OutlinedTextField(
                    label = { Text(text = "Age") },
                    value = age.value,
                    onValueChange = { age.value = it },
                    isError = isErrorAge ,
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.DateRange,
                            contentDescription = "name",
                            tint = primaryLight
                        )
                    },
                    modifier = Modifier.fillMaxWidth(),
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = Color(0xFFFFFFFF)
                    ),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                if (isErrorAge) {
                    Text(
                        text = "Error message",
                        color = MaterialTheme.colors.error,
                        style = MaterialTheme.typography.caption,
                        modifier = Modifier.padding(start = 16.dp)
                    )
                }
                Spacer(modifier = Modifier.height(15.dp))


                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(BorderStroke(2.dp, SolidColor(primary)), RoundedCornerShape(20.dp)),

                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Spacer(modifier = Modifier.height(15.dp))
                    Text(
                        text = "Gender",
                        style = androidx.compose.ui.text.TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = primaryDark,

                            )
                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        RadioButton(selected = selected == "Male", onClick = { selected = "Male" })
                        Text(
                            text = "Male",
                            style = androidx.compose.ui.text.TextStyle(
                                fontSize = 18.sp,
                                color = primaryDark,

                                ),
                            modifier = Modifier
                                .clickable(onClick = { selected = "Male" })


                        )
                        Spacer(modifier = Modifier.size(4.dp))
                        RadioButton(
                            selected = selected == "Female",
                            onClick = { selected = "Female" })
                        Text(
                            text = "Female",
                            style = androidx.compose.ui.text.TextStyle(
                                fontSize = 18.sp,
                                color = primaryDark,

                                ),
                            modifier = Modifier
                                .clickable(onClick = { selected = "Female" })

                        )
                        Spacer(modifier = Modifier.height(20.dp))
                    }
                }
                Spacer(modifier = Modifier.height(15.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()

                ) {
                    Button(
                        onClick = {
                            if(fullName.value.isEmpty())
                                isErrorFN = true
                            else if (fullName.value.isNotEmpty())
                                isErrorFN = false
                            if(email.value.isEmpty())
                                isErrorEmail = true
                            else if (email.value.isNotEmpty())
                                isErrorEmail = false
                            if(age.value.isEmpty())
                                isErrorAge = true
                            else if (age.value.isNotEmpty())
                                isErrorAge= false
                            if(!isErrorFN && !isErrorAge && !isErrorEmail){
                                //navController.popBackStack()
                                navController.navigate(Screen.SecondInterface.route + "/${fullName.value}"+ "/${email.value}"+"/${age.value}"+"/${selected}")
                            }

                        },
                        shape = RectangleShape,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)

                    ) {
                        Text(
                            text = "Next",
                            style = androidx.compose.ui.text.TextStyle(
                                fontSize = 20.sp,

                                ),
                        )
                    }
                }

            }
        })
}














