package com.portalplusconnect.domain.model

sealed interface ConnectionState {
    data object Starting : ConnectionState
    data object WifiConnected : ConnectionState
    data object CheckingInternet : ConnectionState
    data object CaptivePortalFound : ConnectionState
    data object InternetAvailable : ConnectionState
    data object NoInternet : ConnectionState
    data class Error(val message: String) : ConnectionState
}
