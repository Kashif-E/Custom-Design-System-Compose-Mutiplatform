package com.kashif.designsystem

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform