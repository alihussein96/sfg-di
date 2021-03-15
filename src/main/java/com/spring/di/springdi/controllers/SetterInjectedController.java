package com.spring.di.springdi.controllers;

import com.spring.di.springdi.services.GreetingService;

public class SetterInjectedController {

    GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayHello();
    }
}
