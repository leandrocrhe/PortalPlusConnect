package com.portalplusconnect.data.repository

import com.portalplusconnect.core.captiveportal.CaptivePortalDetector
import com.portalplusconnect.core.network.NetworkChecker
import com.portalplusconnect.domain.model.ConnectionState

class NetworkRepository(
    private val networkChecker: NetworkChecker,
    private val captivePortalDetector: CaptivePortalDetector
) {
    fun check(): ConnectionState {
        if (!networkChecker.hasInternet()) {
            return captivePortalDetector.detect()
        }

        return ConnectionState.InternetAvailable
    }
}
