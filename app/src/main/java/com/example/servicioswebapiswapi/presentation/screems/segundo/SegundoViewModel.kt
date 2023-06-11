package com.example.servicioswebapiswapi.presentation.screems.segundo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.servicioswebapiswapi.domain.models.Persona
import com.example.servicioswebapiswapi.domain.repository.PersonaRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SegundoViewModel
@Inject constructor(
    private val personaRepository: PersonaRepository
) : ViewModel() {
     val personaLiveData = MutableLiveData<Persona>()
     val countLiveData = MutableLiveData<Int>()
     val next = MutableLiveData<String>()
     val previous = MutableLiveData<Int>()

    fun getPersona() {
        viewModelScope.launch {
            val persona = personaRepository.getPersona()
            personaLiveData.value = persona
            countLiveData.value = persona.count
            next.value = persona.next
            previous.value = persona.previous
        }
    }

}