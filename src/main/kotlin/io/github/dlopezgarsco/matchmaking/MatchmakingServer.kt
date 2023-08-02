package io.github.dlopezgarsco.matchmaking

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MatchmakingServer

fun main(args: Array<String>) {
    runApplication<MatchmakingServer>(*args)
}
