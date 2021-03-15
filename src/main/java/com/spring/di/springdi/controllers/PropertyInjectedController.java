package com.spring.di.springdi.controllers;

import com.spring.di.springdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayHello();
    }
}
