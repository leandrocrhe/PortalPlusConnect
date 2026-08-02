package com.portalplusconnect.ui.connecting

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.portalplusconnect.core.captiveportal.CaptivePortalDetector
import com.portalplusconnect.domain.model.ConnectionState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ConnectingViewModel : ViewModel() {

    private val _state = MutableStateFlow<ConnectionState>(ConnectionState.Starting)
    val state: StateFlow<ConnectionState> = _state

    fun checkConnection() {
        viewModelScope.launch {
            _state.value = ConnectionState.CheckingInternet
            _state.value = CaptivePortalDetector().detect()
        }
    }
}
