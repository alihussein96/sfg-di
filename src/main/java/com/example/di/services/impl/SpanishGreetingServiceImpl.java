package com.example.di.services.impl;

import com.example.di.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class SpanishGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hola amigas! - ES";
    }
}
