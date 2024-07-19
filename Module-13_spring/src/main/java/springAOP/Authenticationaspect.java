package springAOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Authenticationaspect {
	
	@Pointcut("within(springAOP.Inmakes)")
	public void authorizationpiontcut() {
		
	}
	
	@Pointcut("within(springAOP.Inmakes)")
	public void authenticationpiontcut() {
		
	}
	
	@Before("authorizationpiontcut() && authenticationpiontcut()")
	public void authorization(JoinPoint jp) {
		
//		System.out.println("--------------------------------------------------------");
//		System.out.println("jiontpiont-getsignature= "+jp.getSignature());
//		System.out.println("jiontpiont-getarguments= "+jp.getArgs()[0]+" "+jp.getArgs()[1]);
//		System.out.println("jiontpiont-getkind= "+jp.getKind());
//		System.out.println("jiontpiont-gettarget= "+jp.getTarget());
//		System.out.println("jiontpiont-getthis= "+jp.getThis());
//		System.out.println("jiontpiont-getclass= "+jp.getClass());
//		System.out.println("jiontpiont-getsourcelocation= "+jp.getSourceLocation());
//		System.out.println("jiontpiont-getstaticpart= "+jp.getStaticPart());
//		System.out.println("--------------------------------------------------------");
		System.out.println("authentication requested..");
	}

}
