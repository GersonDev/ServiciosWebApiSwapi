package com.example.servicioswebapiswapi.di

import com.example.servicioswebapiswapi.data.api.PersonaServiceImpl
import com.example.servicioswebapiswapi.domain.repository.PersonaRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun providePersonaRepository(personaServiceImpl: PersonaServiceImpl): PersonaRepository {
        return PersonaRepository(personaServiceImpl)
    }
}