package com.example.servicioswebapiswapi.data.api

import com.example.servicioswebapiswapi.data.api.response.GetPersonaResponse
import retrofit2.http.GET

interface PersonaService {
    @GET("people")
    suspend fun getPersonajes(): GetPersonaResponse

    companion object {
        const val BASE_URL = "https://swapi.dev/api/"
    }
}