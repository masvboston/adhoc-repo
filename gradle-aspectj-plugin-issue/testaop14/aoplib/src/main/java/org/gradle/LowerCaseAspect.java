package org.gradle;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LowerCaseAspect {

	@Pointcut("execution( String com.masv.mark.Person.getName()) || execution( String org.gradle.Person.getName())")
	void personPointcut() {
	}

	@Around("personPointcut()")
	public Object afterAdvice(final ProceedingJoinPoint jp) throws Throwable {
		final String result = jp.proceed().toString().toLowerCase();
		System.out.println("Lower: " + result);
		return result;
	}

}
