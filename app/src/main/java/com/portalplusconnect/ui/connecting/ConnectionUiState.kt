package com.portalplusconnect.ui.connecting

import com.portalplusconnect.domain.model.ConnectionState

data class ConnectionUiState(
    val title: String,
    val description: String
)

fun ConnectionState.toUiState(): ConnectionUiState = when (this) {
    ConnectionState.Starting -> ConnectionUiState("Iniciando", "Preparando conexión")
    ConnectionState.WifiConnected -> ConnectionUiState("WiFi conectado", "Comprobando acceso")
    ConnectionState.CheckingInternet -> ConnectionUiState("Verificando", "Comprobando Internet")
    ConnectionState.CaptivePortalFound -> ConnectionUiState("Portal detectado", "Se requiere autenticación")
    ConnectionState.InternetAvailable -> ConnectionUiState("Conectado", "Internet disponible")
    ConnectionState.NoInternet -> ConnectionUiState("Sin Internet", "La red no tiene acceso")
    is ConnectionState.Error -> ConnectionUiState("Error", this.message)
}
