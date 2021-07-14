package it.vscalcione.springboot.kotlindemoapplication.service

import org.springframework.stereotype.Service
import it.vscalcione.springboot.kotlindemoapplication.repository.MessageRepository
import it.vscalcione.springboot.kotlindemoapplication.repository.Message

@Service
class MessageService(val db: MessageRepository) {

    fun findMessages(): List<Message> = db.findMessages()

    fun post(message: Message){
        db.save(message)
    }
}