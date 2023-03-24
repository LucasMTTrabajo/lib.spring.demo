package com.example.lib.spring.demo

import com.example.lib.spring.demo.config.LibDemoConfig
import com.example.marvel_4.marvelspringdemo_4.controllers.PingController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Import

@SpringBootApplication
@Import(LibDemoConfig::class)
class Application

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}