package br.ufpa.software.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by gilson on 26/11/15.
 */
@Aspect
public class AspectLogger {

    @Before("execution(* Banco.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("AspectLogger.logBefore() : " + joinPoint.getSignature().getName());
    }

    @After("execution(* Banco.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("AspectLogger.logAfter() : " + joinPoint.getSignature().getName());
    }
}
