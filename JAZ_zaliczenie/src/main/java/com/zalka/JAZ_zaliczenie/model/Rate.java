package com.zalka.JAZ_zaliczenie.model;

public class Rate {

    private String no;
    private String effectiveDate;
    private float mid;

    public Rate(String no, String effectiveDate, float mid) {
        this.no = no;
        this.effectiveDate = effectiveDate;
        this.mid = mid;
    }

    public Rate() {
    }

    public String getNo() {
        return no;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public float getMid() {
        return mid;
    }
}
