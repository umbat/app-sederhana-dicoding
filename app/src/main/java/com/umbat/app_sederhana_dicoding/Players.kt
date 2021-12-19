package com.umbat.app_sederhana_dicoding

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Players(
    var name: String = "",
    var fullname: String = "",
    var placeofbirth: String = "",
    var timeofbirth: String = "",
    var position: String = "",
    var detail: String = "",
    var photo: Int = 0
) : Parcelable