package com.portalplusconnect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.portalplusconnect.domain.model.ConnectionState
import com.portalplusconnect.ui.connecting.ConnectionStatusScreen
import com.portalplusconnect.ui.connecting.ConnectingViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val viewModel: ConnectingViewModel = viewModel()
            val state by viewModel.state.collectAsState()

            MaterialTheme {
                Surface {
                    ConnectionStatusScreen(state)
                }
            }

            if (state == ConnectionState.Starting) {
                viewModel.checkConnection()
            }
        }
    }
}
