package com.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Aspect
public class TimeLoggingAspect {

    @Before("execution(* com.example.service.*.*(..))")
    public void logBefore(){
        System.out.println("@Before: "+new Date());
    }

    @After("execution(* com.example.service.*.*(..))")
    public void logAfter(){
        System.out.println("@After: "+new Date());
    }

    @Around("execution(* com.example.service.*.*(..))")
    public void userAdvice(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("@Around: Before calculation -"+ new Date());
        joinPoint.proceed();
        System.out.println("@Around: After calculation -"+ new Date());

    }

    @AfterReturning(pointcut = "execution(* com.example.service.*.*(..))",returning = "val")
    public void logAfterReturning(Object val){
        System.out.println("Method return value: "+val);
        System.out.println("@After Returning: "+new Date());
    }

    @AfterThrowing(pointcut = "execution(* com.example.service.*.*(..))",throwing = "exception")
    public void logAfterThrowing(Exception  exception){
        //System.out.println("Method return value: "+val);
        System.out.println("@After Returning: "+new Date());
        System.out.println("Exception Caught: "+exception.getMessage());
    }
}
