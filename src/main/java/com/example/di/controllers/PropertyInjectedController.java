package com.example.di.controllers;

import com.example.di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyGreetingServiceImpl")
    @Autowired
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayHello();
    }
}
