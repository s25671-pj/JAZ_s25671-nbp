package com.zalka.JAZ_zaliczenie.Service;

import com.zalka.JAZ_zaliczenie.Repository.ApiRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ApiService {

    private final ApiRepository apiRepository;
    private final WebClient webclient;


    public ApiService(ApiRepository apiRepository, WebClient webclient) {
        this.apiRepository = apiRepository;
        this.webclient = webclient;
    }
}
