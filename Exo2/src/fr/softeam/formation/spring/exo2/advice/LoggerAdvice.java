package fr.softeam.formation.spring.exo2.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggerAdvice {
	@Before("execution(* fr.softeam.formation.spring.exo2.impl.Operation*Impl.*(Integer,Integer)) && args(op1,op2)")
	public void log(ProceedingJoinPoint jp, Integer op1, Integer op2) {
		System.out.println("LoggerAdvice.log() " +jp.getTarget().getClass().getSimpleName() +"."+jp.getSignature().getName() + " (" + op1.toString()+","+op2.toString() +")");
	}
	
}
