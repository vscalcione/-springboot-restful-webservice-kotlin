package it.vscalcione.springboot.kotlindemoapplication.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import org.springframework.data.jdbc.repository.query.Query

interface MessageRepository : CrudRepository<Message, String>{

    @Query("select * from messages")
    fun findMessages(): List<Message>
}

@Table("MESSAGES")
data class Message(@Id val id: String?, val text: String)