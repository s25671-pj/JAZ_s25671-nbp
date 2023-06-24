package com.zalka.JAZ_zaliczenie.Controller;

import com.zalka.JAZ_zaliczenie.Service.ApiService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiRestController {

    private final ApiService apiService;

    public ApiRestController(ApiService apiService) {
        this.apiService = apiService;
    }
}
