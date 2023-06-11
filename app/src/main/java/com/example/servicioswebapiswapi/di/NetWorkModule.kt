package com.example.servicioswebapiswapi.di

import com.example.servicioswebapiswapi.data.api.PersonaServiceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetWorkModule {
    @Provides
    @Singleton
    fun providePersonaService():PersonaServiceImpl{
        return PersonaServiceImpl()
    }
}