package com.example.cuadricula.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
data class Topic(
    @StringRes val nameResId: Int,
    val courseCount: Int,
    @DrawableRes val imageResId: Int
)
