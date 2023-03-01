package com.example.cv3

import androidx.annotation.DrawableRes

data class Experience (@DrawableRes val imageItem : Int, val companyName:String, val companyAddress : String, val startDate : String, val endDate : String, val description : String)