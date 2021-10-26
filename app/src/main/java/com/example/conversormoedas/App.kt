package com.example.conversormoedas

import android.app.Application
import com.example.conversormoedas.data.di.DataModules
import com.example.conversormoedas.domain.di.DomainModule
import com.example.conversormoedas.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModules.load()
        DomainModule.load()
        PresentationModule.load()
    }
}