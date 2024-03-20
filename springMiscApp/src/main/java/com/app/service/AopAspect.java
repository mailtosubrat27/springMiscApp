package com.app.service;

import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class AopAspect {
    // below execution is known as point cut -- execution(* com.app.controller.AOPFeatureController.getAopMsg())
    @Before("execution(* com.app.service.AopFeatureService.invokingAspect())")
    public void beforeLog() {
        System.out.println("Log message before method execution..");
    }

    @After("execution(* com.app.service.AopFeatureService.invokingAspect())")
    public void afterLog() {
        System.out.println("Log message after method execution..");
    }

    @AfterReturning("myPointCuts()")
    public void afterReturning(){
        System.out.println("Log message after returning method execution..");
    }

    /*@Around("myPointCuts()")
    public void aroundPoint(){
        System.out.println("Log message around execution..");
    }*/

    @Pointcut("execution(* com.app.service.AopFeatureService.invokingAspect())")
    public void myPointCuts(){}

}
