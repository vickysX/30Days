package com.example.a30days.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Day(
    @StringRes val dayNum : Int,
    @DrawableRes val placeToVisit : Int,
    @StringRes val description : Int
)
