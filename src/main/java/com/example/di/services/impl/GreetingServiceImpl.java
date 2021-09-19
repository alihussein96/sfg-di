package com.example.di.services.impl;

import com.example.di.services.GreetingService;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello folks!";
    }
}
