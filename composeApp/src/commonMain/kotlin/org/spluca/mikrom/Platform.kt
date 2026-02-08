package org.spluca.mikrom

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform