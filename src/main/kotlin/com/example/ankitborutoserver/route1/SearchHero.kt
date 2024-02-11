package com.example.ankitborutoserver.route1

import com.example.ankitborutoserver.repository.HeroRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.dsl.module
import org.koin.ktor.ext.inject


fun Route.searchHeros() {
    val heroRepo: HeroRepository by inject()


    get("boruto/search/heros") {

        val queryParameter = call.request.queryParameters["name"] ?: "Naruto"
        val apiResponse = heroRepo.getSearchHero(queryParameter)
        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK
        )


    }

}