package com.example.di.services.impl;

import com.example.di.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello folks! - Primary";
    }
}
