package com.example.lismanrecyclerview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Superhero(
    val imgSuperhro: Int,
    val nameSuperhero: String,
    val descSuperhero: String
) : Parcelable
