package com.app.service;

import org.springframework.stereotype.Component;

@Component
public class AopFeatureService {

    public String invokingAspect() {
        return "Aop Test";
    }
}
