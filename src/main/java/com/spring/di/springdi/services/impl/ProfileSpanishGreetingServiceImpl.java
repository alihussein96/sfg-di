package com.spring.di.springdi.services.impl;

import com.spring.di.springdi.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("profileGreetingService")
public class ProfileSpanishGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "hello world -- SPANISH";
    }
}
