package com.jinho.learnspringframework.example.c1;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessCalculationService {

    private DataService service;

    public BusinessCalculationService(DataService service) {
        this.service = service;
    }

    public int findMax() {
        return Arrays.stream(service.retrieveData()).max().orElse(0);
    }
}
