package com.example.conversormoedas.presentation.di

import com.example.conversormoedas.presentation.HistoryViewModel
import com.example.conversormoedas.presentation.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object PresentationModule {

    fun load() {
        loadKoinModules(viewModelModules())
    }

    private fun viewModelModules(): Module {
        return module {
            viewModel { HistoryViewModel(get()) }
            viewModel { MainViewModel(get(), get()) }
        }
    }
}