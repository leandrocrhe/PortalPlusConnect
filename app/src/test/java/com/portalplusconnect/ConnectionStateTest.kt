package com.portalplusconnect

import com.portalplusconnect.domain.model.ConnectionState
import org.junit.Assert.assertTrue
import org.junit.Test

class ConnectionStateTest {
    @Test
    fun internet_available_state_is_valid() {
        assertTrue(ConnectionState.InternetAvailable is ConnectionState)
    }
}
