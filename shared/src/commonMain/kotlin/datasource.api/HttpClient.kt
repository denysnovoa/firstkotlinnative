package com.app.firstkotlinnative.datasource.api

import com.app.firstkotlinnative.photo.data.model.PhotoResponse
import io.ktor.client.HttpClient
import io.ktor.client.features.json.JsonFeature


//val client = HttpClient { install(ExpectSuccess }
//val endPoint = "https://api.unsplash.com"
//
//val client = HttpClient {
//  install(JsonFeature) {
//    serializer = KotlinxSerializer(JSON.nonstrict).apply {
//      setMapper(PhotoResponse::class, PhotoResponse.serializer())
//    }
//  }
//  install(ExpectSuccess)
//}