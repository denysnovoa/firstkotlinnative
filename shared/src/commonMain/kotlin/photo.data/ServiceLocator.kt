package com.app.firstkotlinnative.photo.data

import com.app.firstkotlinnative.photo.data.api.PhotoApi
import com.app.firstkotlinnative.photo.data.api.PhotoApiService
import com.app.firstkotlinnative.photo.data.model.PhotoResponse
import io.ktor.client.HttpClient
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer

object ServiceLocator {

  private fun provideHttpClient(): HttpClient {

    return HttpClient {
      install(JsonFeature) {
        serializer = KotlinxSerializer().apply {
          setMapper(PhotoResponse::class, PhotoResponse.serializer())
        }
      }
    }
  }

  private fun provideApiHost() = "https://api.unsplash.com"
  private fun provideClientId() = "7b62093f7803511c09584f0d978630a4ab3d5f1b3f5c70f97c30f6dbef25fdbf"

  fun providePhotoApiService(): PhotoApi =
    PhotoApiService(provideHttpClient(), provideApiHost(), provideClientId())
}