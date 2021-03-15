package com.spring.di.springdi.services.impl;

import com.spring.di.springdi.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "hello world -- Primary";
    }
}
