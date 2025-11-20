package com.gks.kmmsample

actual class Platform {
    actual val osName: String
        get() = "IOS"
    actual val osVersion: String
        get() = "1.2.3"
    actual val deviceModel: String
        get() = "IOS Device Model"
    actual val density: Int
        get() = 3

    actual fun logSystemInfo() {

    }

}

