package com.example.di.services.impl;

import com.example.di.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello folks! - Constructor";
    }
}
