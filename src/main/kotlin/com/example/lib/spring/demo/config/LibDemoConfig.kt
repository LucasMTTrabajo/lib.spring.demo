package com.example.lib.spring.demo.config

import com.example.marvel_4.marvelspringdemo_4.controllers.PingController
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class LibDemoConfig {

    @Bean
    fun libController(): PingController {
        return PingController()
    }

}