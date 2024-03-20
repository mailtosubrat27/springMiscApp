package com.app.controller;

import com.app.service.AopFeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aop")
public class AOPFeatureController {
    @Autowired
    AopFeatureService ser;

    @GetMapping
    public String getAopMsg(){
        System.out.println("AOP Exception..");
        //Joinpoint
        return ser.invokingAspect();
    }
}
