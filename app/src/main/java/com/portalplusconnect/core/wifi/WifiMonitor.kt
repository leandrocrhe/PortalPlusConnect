package com.portalplusconnect.core.wifi

import android.net.ConnectivityManager
import android.net.NetworkCapabilities

class WifiMonitor(
    private val connectivityManager: ConnectivityManager
) {
    fun isWifiConnected(): Boolean {
        val network = connectivityManager.activeNetwork ?: return false
        val capabilities = connectivityManager.getNetworkCapabilities(network)
            ?: return false

        return capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)
    }
}
