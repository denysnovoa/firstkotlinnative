package com.app.firstkotlinnative.photo.data.api

import com.app.firstkotlinnative.photo.data.model.PhotoResponse

interface PhotoApi {
  suspend fun getRandom(): PhotoResponse
}