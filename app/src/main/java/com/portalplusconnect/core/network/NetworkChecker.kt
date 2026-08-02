package com.portalplusconnect.core.network

import java.net.HttpURLConnection
import java.net.URL

class NetworkChecker {
    fun hasInternet(): Boolean {
        return try {
            val connection = URL("https://connectivitycheck.gstatic.com/generate_204")
                .openConnection() as HttpURLConnection
            connection.connectTimeout = 3000
            connection.readTimeout = 3000
            connection.requestMethod = "GET"
            connection.responseCode == 204
        } catch (_: Exception) {
            false
        }
    }
}
