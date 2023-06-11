package com.example.servicioswebapiswapi.data.api.response

data class GetPersonaResponse(
    val count: Int,
    val next: String,
    val previous: Int,
    val results: List<Personajes>
)

data class Personajes(
    val name: String,
    val height: String,
    val mass: String,
    val hair_color: String,
    val skin_color: String,
    val eye_color: String,
    val birth_year: String,
    val gender: String,
    val homeworld:String
)