package org.citruscircuits.scouting

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform