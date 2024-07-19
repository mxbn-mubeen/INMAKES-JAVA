package springAOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {
	
	@After("execution (public void displayCourse(..))")
	public void logger() {
		System.out.println("loggers working");
	}
	
	@Before("execution(* *.*.displayCourse(..))")
	public void security() {
		
		System.out.println("security working");
	}

	@Pointcut("execution(* *.*.getamount(..))")
	public void afterreturningpiontcut() {
		
	}
	
	@AfterReturning(pointcut = "afterreturningpiontcut()",returning = "retval")
	public void returningpiontcut(int retval) {
		
		System.out.println("after returning value= "+retval);
		
	}
}
