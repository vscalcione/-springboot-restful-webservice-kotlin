package it.vscalcione.springboot.kotlindemoapplication.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

import it.vscalcione.springboot.kotlindemoapplication.service.MessageService
import it.vscalcione.springboot.kotlindemoapplication.repository.Message

@RestController
class MessageResource(val service: MessageService) {
	
    @GetMapping
    fun index(): List<Message> = service.findMessages()

    @PostMapping
    fun post(@RequestBody message: Message) {
        service.post(message)
    }

}