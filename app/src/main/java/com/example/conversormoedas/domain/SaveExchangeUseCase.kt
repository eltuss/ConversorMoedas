package com.example.conversormoedas.domain

import com.example.conversormoedas.core.UseCase
import com.example.conversormoedas.data.model.ExchangeResponseValue
import com.example.conversormoedas.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class SaveExchangeUseCase(
    private val repository: CoinRepository
) : UseCase.NoSource<ExchangeResponseValue>() {

    override suspend fun execute(param: ExchangeResponseValue): Flow<Unit> {
        return flow {
            repository.save(param)
            emit(Unit)
        }
    }
}