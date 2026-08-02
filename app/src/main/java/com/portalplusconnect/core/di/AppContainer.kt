package com.portalplusconnect.core.di

import com.portalplusconnect.core.captiveportal.CaptivePortalDetector
import com.portalplusconnect.core.network.NetworkChecker
import com.portalplusconnect.data.repository.NetworkRepository

object AppContainer {
    private val networkChecker = NetworkChecker()
    private val captivePortalDetector = CaptivePortalDetector()

    val networkRepository = NetworkRepository(
        networkChecker,
        captivePortalDetector
    )
}
