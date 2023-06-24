package com.zalka.JAZ_zaliczenie.Service;

import com.zalka.JAZ_zaliczenie.Repository.ApiRepository;
import com.zalka.JAZ_zaliczenie.model.ApiExchange;
import com.zalka.JAZ_zaliczenie.model.ApiModelDatabase;
import com.zalka.JAZ_zaliczenie.model.Rate;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.time.LocalDateTime;
import java.sql.Date;

@Service
public class ApiService {

    private final ApiRepository apiRepository;
    private final WebClient webclient;


    public ApiService(ApiRepository apiRepository, WebClient webclient) {
        this.apiRepository = apiRepository;
        this.webclient = webclient;
    }

    public float exchangeRate(Date startDate, Date endDate, String currency){
    ApiExchange response = webclient.get()
            .uri("exchangerates/rates/a/{currency}/{startDate}/{endDate}/?format=json",startDate,endDate,currency)
            .retrieve()
            .bodyToMono(ApiExchange.class)
            .block();
    float sum = 0;
        for(Rate rate : response.getRates()){
        sum += rate.getMid();
    }
    float rate = sum/response.getRates().size();
    ApiModelDatabase saveRecord = new ApiModelDatabase(currency, startDate,endDate,rate,LocalDateTime.now());
        apiRepository.save(saveRecord);
        return rate;
}
}