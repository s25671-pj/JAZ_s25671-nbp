package com.zalka.JAZ_zaliczenie.model;

import jakarta.validation.constraints.Max;

import java.util.List;

public class ApiExchange {

    private Character table;
    private String currencyName;

    @Max(3)
    private String currencyCode;
    private List<Rate> rates;

    public ApiExchange(Character table, String currencyName, String currencyCode, List<Rate> rates) {
        this.table = table;
        this.currencyName = currencyName;
        this.currencyCode = currencyCode;
        this.rates = rates;
    }

    public ApiExchange() {
    }

    public Character getTable() {
        return table;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public List<Rate> getRates() {
        return rates;
    }
}
