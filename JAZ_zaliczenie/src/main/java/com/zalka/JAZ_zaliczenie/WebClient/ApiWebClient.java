package com.zalka.JAZ_zaliczenie.WebClient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ApiWebClient {

    @Bean
    public WebClient webClient(){
        return WebClient.create("http://api.nbp.pl/api/");
    }
}
