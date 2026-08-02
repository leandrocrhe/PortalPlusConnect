package com.portalplusconnect.ui.connecting

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.portalplusconnect.domain.model.ConnectionState

@Composable
fun ConnectionStatusScreen(state: ConnectionState) {
    val ui = state.toUiState()

    Text(
        text = "PortalPlus Connect\n\n${ui.title}\n${ui.description}"
    )
}
