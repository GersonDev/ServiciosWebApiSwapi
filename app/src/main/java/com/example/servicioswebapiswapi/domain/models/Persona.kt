package com.example.servicioswebapiswapi.domain.models

import com.example.servicioswebapiswapi.data.api.response.Personajes

data class Persona (
    val count:Int,
    val next:String,
    val previous:Int,
    val results:List<Personajes>
        )