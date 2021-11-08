package ru.gorbachev.spring.controllers;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Aspect
@Component
public class FuelAspect {
    @Pointcut("@annotation(ru.gorbachev.spring.controllers.FuelExceptionHandler)")
    public void callAtAnnotatedMethods() {

    }

    @Around("callAtAnnotatedMethods()")
    public Object handleError(ProceedingJoinPoint pjp) throws Throwable {
        try {
            return pjp.proceed();
        } catch (Exception e) {
            return "exceptionPage";
        }
    }

}
