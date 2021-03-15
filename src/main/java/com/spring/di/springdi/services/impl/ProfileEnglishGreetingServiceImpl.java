package com.spring.di.springdi.services.impl;

import com.spring.di.springdi.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("profileGreetingService")
public class ProfileEnglishGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "hello world -- ENGLISH";
    }
}
