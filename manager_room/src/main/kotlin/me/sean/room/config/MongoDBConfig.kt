package me.sean.room.config

import com.mongodb.client.MongoClients
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.core.MongoTemplate

/**
 * Created by Sean on 2022/5/19.
 *
 * mongodb config
 */
@Configuration
open class MongoDBConfig {
    @Bean
    open fun mongoClient() =
        MongoClients.create("mongodb://localhost:27017")

    @Bean
    open fun mongoTemplate() = MongoTemplate(mongoClient(), "jarvis")
}