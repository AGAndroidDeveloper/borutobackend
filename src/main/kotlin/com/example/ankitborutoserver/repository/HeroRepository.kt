package com.example.ankitborutoserver.repository

import com.example.ankitborutoserver.model.ApiResponse
import com.example.ankitborutoserver.model.Hero

interface HeroRepository  {
    val heros : Map<Int, List<Hero>>?
    val page1  :List<Hero>
    val page2  :List<Hero>
    val page3  :List<Hero>
    val page4   :List<Hero>
    val page5 :List<Hero>


    suspend fun getAllHero(page :Int = 1) :ApiResponse

    suspend fun getSearchHero(name: String) :ApiResponse

    suspend fun getAllHeroList() :ApiResponse



}