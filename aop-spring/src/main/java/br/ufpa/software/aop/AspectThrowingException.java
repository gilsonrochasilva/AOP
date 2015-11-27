package br.ufpa.software.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Objects;

/**
 * Created by gilson on 26/11/15.
 */
@Aspect
public class AspectThrowingException {

    @Around("execution(* Banco.*(..))")
    public void handler(ProceedingJoinPoint joinPoint) throws Throwable {
        Object obj = null;

        try {
            obj = joinPoint.proceed();
            System.out.println("AspectThrowingException.handler() : não disparou execeção");
        } catch (Throwable throwable) {
            System.out.println("AspectThrowingException.handler() : " + throwable.toString());
        }
    }
}