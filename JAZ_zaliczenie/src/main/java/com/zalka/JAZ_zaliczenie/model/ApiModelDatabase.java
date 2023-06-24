package com.zalka.JAZ_zaliczenie.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;

import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "stored")
public class ApiModelDatabase {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Max(3)
    private String currency;

    @NotBlank
    private Date startDate;

    @NotBlank
    private Date endDate;

    @NotBlank
    private float rate;

    @NotBlank
    private LocalDateTime localDateTime;

    public ApiModelDatabase(String currency, Date startDate, Date endDate, float rate, LocalDateTime localDateTime) {
        this.currency = currency;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rate = rate;
        this.localDateTime = localDateTime;
    }

    public ApiModelDatabase() {
    }
}
