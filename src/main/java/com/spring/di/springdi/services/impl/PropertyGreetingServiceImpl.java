package com.spring.di.springdi.services.impl;

import com.spring.di.springdi.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "hello world -- Property";
    }
}
