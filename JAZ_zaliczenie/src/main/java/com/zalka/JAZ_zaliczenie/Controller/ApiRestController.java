package com.zalka.JAZ_zaliczenie.Controller;

import com.zalka.JAZ_zaliczenie.Service.ApiService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;

@RestController
public class ApiRestController {

    private final ApiService apiService;

    public ApiRestController(ApiService apiService) {
        this.apiService = apiService;
    }

    @Operation(summary = "Get an average rate of currency for specific provided start and end date")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Average exchange rate calculated for required dates",
                    content = @Content(schema = @Schema(type = "number", format = "float"))),
            @ApiResponse(responseCode = "400", description = "Invalid request",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Invalid time range",
                    content = @Content),
            @ApiResponse(responseCode = "500", description = "Internal ServerError",
                    content = @Content)})
    @GetMapping("/{currency}/{startDate}/{endDate}")
    ResponseEntity<Float> averageExchangeRate(
            @PathVariable String currency,
            @PathVariable Date startDate,
            @PathVariable Date endDate) {


        return ResponseEntity.ok(apiService.exchangeRate(startDate, endDate, currency));
    }
}
