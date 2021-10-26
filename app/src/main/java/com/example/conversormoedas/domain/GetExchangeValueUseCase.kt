package com.example.conversormoedas.domain

import com.example.conversormoedas.core.UseCase
import com.example.conversormoedas.data.model.ExchangeResponseValue
import com.example.conversormoedas.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow

class GetExchangeValueUseCase(
    private val repository: CoinRepository
) : UseCase<String, ExchangeResponseValue>() {

    override suspend fun execute(param: String): Flow<ExchangeResponseValue> {
        return repository.getExchangeValue(param)
    }

}