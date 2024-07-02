package com.jinho.learnspringframework.example.c1;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalculationService {

    private DataService service;

    public BusinessCalculationService(DataService service) {
        this.service = service;
    }

    public int findMax() {
        return Arrays.stream(service.retrieveData()).max().orElse(0);
    }
}
