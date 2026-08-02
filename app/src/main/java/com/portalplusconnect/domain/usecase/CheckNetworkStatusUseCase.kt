package com.portalplusconnect.domain.usecase

import com.portalplusconnect.core.captiveportal.CaptivePortalDetector
import com.portalplusconnect.domain.model.ConnectionState

class CheckNetworkStatusUseCase(
    private val detector: CaptivePortalDetector
) {
    operator fun invoke(): ConnectionState = detector.detect()
}
