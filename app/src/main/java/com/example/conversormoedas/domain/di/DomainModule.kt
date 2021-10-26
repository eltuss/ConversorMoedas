package com.example.conversormoedas.domain.di

import com.example.conversormoedas.domain.GetExchangeValueUseCase
import com.example.conversormoedas.domain.ListExchangeUseCase
import com.example.conversormoedas.domain.SaveExchangeUseCase
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object DomainModule {

    fun load() {
        loadKoinModules(useCaseModules())
    }

    private fun useCaseModules(): Module {
        return module {
            factory { ListExchangeUseCase(get()) }
            factory { SaveExchangeUseCase(get()) }
            factory { GetExchangeValueUseCase(get()) }
        }
    }
}