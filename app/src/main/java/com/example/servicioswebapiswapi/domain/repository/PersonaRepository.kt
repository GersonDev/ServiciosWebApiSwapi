package com.example.servicioswebapiswapi.domain.repository

import com.example.servicioswebapiswapi.data.api.PersonaServiceImpl
import com.example.servicioswebapiswapi.data.api.response.Personajes
import com.example.servicioswebapiswapi.domain.models.Persona

class PersonaRepository(personaServiceImpl: PersonaServiceImpl) {
    private val personaServiceImpl = personaServiceImpl.personaServices()

    suspend fun getPersona(): Persona {
        val personaResponse = personaServiceImpl.getPersonajes()
        val persona = Persona(
            count = personaResponse.count,
            next = personaResponse.next,
            previous = personaResponse.previous,
            results = personaResponse.results.map {
                Personajes(
                    name = it.name,
                    height = it.height,
                    mass = it.mass,
                    hair_color = it.hair_color,
                    skin_color = it.skin_color,
                    eye_color = it.eye_color,
                    birth_year = it.birth_year,
                    gender = it.gender,
                    homeworld = it.homeworld
                )
            }
        )
        return persona
    }
}