package com.example.ankitborutoserver.data.plugins

import com.example.ankitborutoserver.Constant.GETALLHERO
import com.example.ankitborutoserver.repository.HeroRepository
import com.example.ankitborutoserver.route1.getAllHeros
import com.example.ankitborutoserver.route1.searchHeros
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.java.KoinJavaComponent.inject
import org.koin.ktor.ext.inject
import java.lang.Exception

fun Application.configureRouting() {
    routing {
        getAllHeros()
        searchHeros()
        staticResources(remotePath = "/images", basePackage = "images")

    }
}



