package com.example

import com.example.ankitborutoserver.data.plugins.configureKoin
import com.example.ankitborutoserver.data.plugins.configureMonitoring
import com.example.ankitborutoserver.data.plugins.configureRouting
import com.example.ankitborutoserver.data.plugins.configureSerialization
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
   embeddedServer(Netty,port = 8080){
       module()
   }.start(wait = true)


}

fun Application.module() {
    configureKoin()
    configureSerialization()
    configureMonitoring()
    configureRouting()

}
