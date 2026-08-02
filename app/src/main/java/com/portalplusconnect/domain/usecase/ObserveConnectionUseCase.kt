package com.portalplusconnect.domain.usecase

import com.portalplusconnect.data.repository.NetworkRepository
import com.portalplusconnect.domain.model.ConnectionState

class ObserveConnectionUseCase(
    private val repository: NetworkRepository
) {
    operator fun invoke(): ConnectionState = repository.check()
}
