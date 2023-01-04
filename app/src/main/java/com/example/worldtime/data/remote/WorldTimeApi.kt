package com.example.worldtime.data.remote

import com.example.worldtime.data.remote.dto.ContinentsTimeZonesDto
import com.example.worldtime.data.remote.dto.DateAndTimeDto
import com.example.worldtime.data.remote.dto.TimeZonesDto
import retrofit2.http.GET

interface WorldTimeApi {
    @GET("api/timezone")
    suspend fun getAllTimezones(): TimeZonesDto

    @GET("timezone/{continent}")
    suspend fun getAllTimeZonesInContinent(continent: String): ContinentsTimeZonesDto

    @GET("timezone/{continent}/{city}")
    suspend fun getDateAndTimeDetails(continent: String, city: String): DateAndTimeDto
}