package fr.softeam.formation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TestAspect {

	@Before("execution(* fr. ")
	public void log(Integer value) {
	
}
}
