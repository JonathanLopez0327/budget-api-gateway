package com.budgetproject.cloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/accountServiceFallBack")
    public String accountServiceFallback() {
        return "Account Service is down!";
    }

    @GetMapping("/expenseServiceFallBack")
    public String expenseServiceFallback() {
        return "Expense Service is down!";
    }

    @GetMapping("/incomeServiceFallBack")
    public String incomeServiceFallback() {
        return "Income Service is down!";
    }
}
