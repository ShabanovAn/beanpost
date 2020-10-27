package com.example.beanpost.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MotoAdvise {

    @Pointcut("execution(public * com.example.beanpost.controller.*.*(..))")
    public void service() {
    }

    @Around("service()")
    public void aVoid(JoinPoint joinPoint) {
        System.out.println(joinPoint.toString() + " joinPoint ");
    }
}
