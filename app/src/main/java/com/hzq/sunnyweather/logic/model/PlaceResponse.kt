package com.hzq.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName


data class PlaceResponse(var status: String, val places: List<Place>)
data class Place(
    val name: String, val location: Location,
    @SerializedName("formateted_address") val address: String
)

data class Location(val lng: String, val lat: String)