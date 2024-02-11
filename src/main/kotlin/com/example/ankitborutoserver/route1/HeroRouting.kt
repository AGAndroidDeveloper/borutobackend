package com.example.ankitborutoserver.route1

import com.example.ankitborutoserver.Constant
import com.example.ankitborutoserver.Constant.GETALLHERO
import com.example.ankitborutoserver.Constant.GETALLHEROENDPOINT
import com.example.ankitborutoserver.model.ApiResponse
import com.example.ankitborutoserver.repository.HeroRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject
import java.lang.Exception
import java.util.logging.Logger

fun Route.getAllHeros() {
    val heroRepository: HeroRepository by inject()

    get(GETALLHEROENDPOINT) {
        try {
            val queryParameter = call.request.queryParameters["page"]?.toInt() ?: 1
            require(queryParameter in 1..5)
            val apiResponse = heroRepository.getAllHero(page = queryParameter)
            call.respond(
                message = apiResponse,
                status = HttpStatusCode.OK
            )


        } catch (e: Exception) {
            call.respond(
                status = HttpStatusCode.BadRequest,
                message = ApiResponse(false, "$e")

            )

        }

    }

    get(GETALLHERO) {
        val apiResponse = heroRepository.getAllHeroList()
        try {
            call.respond(status = HttpStatusCode.OK, message =apiResponse)
        }catch (e :Exception){
            call.respond(status = HttpStatusCode.BadRequest, message = "$e")

        }



    }



}