package fr.softeam.formation.spring.exo2.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggerAdviceXml {
	
	public Object log(ProceedingJoinPoint jp, Integer op) throws Throwable {
		System.out.println("LoggerAdviceXml.log() : before " + jp.getTarget().getClass().getSimpleName() +"."+jp.getSignature().getName() + " (" + op.toString() + ")");
		Object returnValue = jp.proceed();
		System.out.println("LoggerAdviceXml.log() : after  " + jp.getTarget().getClass().getSimpleName() +"."+jp.getSignature().getName() + " (" + op.toString() + ")");
		return returnValue;
	}
}
