package com.example.conversormoedas.domain

import com.example.conversormoedas.core.UseCase
import com.example.conversormoedas.data.model.ExchangeResponseValue
import com.example.conversormoedas.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow

class ListExchangeUseCase(
    private val repository: CoinRepository
) : UseCase.NoParam<List<ExchangeResponseValue>>() {

    override suspend fun execute(): Flow<List<ExchangeResponseValue>> {
        return repository.list()
    }
}