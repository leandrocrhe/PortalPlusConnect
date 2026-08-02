package com.portalplusconnect.core.captiveportal

import com.portalplusconnect.domain.model.ConnectionState
import java.net.HttpURLConnection
import java.net.URL

class CaptivePortalDetector {
    fun detect(): ConnectionState {
        return try {
            val connection = URL("http://connectivitycheck.gstatic.com/generate_204")
                .openConnection() as HttpURLConnection
            connection.instanceFollowRedirects = false
            connection.connectTimeout = 3000
            connection.responseCode.let { code ->
                if (code == 204) ConnectionState.InternetAvailable
                else if (code in 300..399) ConnectionState.CaptivePortalFound
                else ConnectionState.NoInternet
            }
        } catch (_: Exception) {
            ConnectionState.NoInternet
        }
    }
}
