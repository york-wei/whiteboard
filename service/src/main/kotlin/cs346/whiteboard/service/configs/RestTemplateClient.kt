/*
 * Copyright (c) 2023 Avesta Barzegar, York Wei, Mikail Rahman, Edward Wang
 */

package cs346.whiteboard.service.configs

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
class RestTemplateClient {
    @Bean
    fun restTemplate(): RestTemplate {
        return RestTemplate()
    }
}