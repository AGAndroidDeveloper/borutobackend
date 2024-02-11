package com.example.di

import com.example.ankitborutoserver.repository.HeroRepoImpl
import com.example.ankitborutoserver.repository.HeroRepository
import org.koin.dsl.module


val koinModule = module {
     single<HeroRepository>{
         HeroRepoImpl()

     }

}

