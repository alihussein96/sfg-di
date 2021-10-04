package com.example.di.services.impl;

import com.example.di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18nService")
public class EnglishGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello folks! - EN";
    }
}
