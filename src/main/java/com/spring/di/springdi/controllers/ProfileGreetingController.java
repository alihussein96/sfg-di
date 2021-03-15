package com.spring.di.springdi.controllers;

import com.spring.di.springdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ProfileGreetingController {
    private final GreetingService greetingService;

    public ProfileGreetingController(@Qualifier("profileGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayHello();
    }


}
