package spring.chap09;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

public class PerformAspect {

	
	public Object timeCheck(ProceedingJoinPoint joinPoint) throws Throwable{
		Signature s =joinPoint.getSignature();
		
		String sName = s.getName();
		
		System.out.println("timeCheck() 메소드 중 proceed() 앞 부분" + sName);
		
		Object obj = null;
		
		//가로채온 원래 메소드를 실행시킨다. , 핵심로직
		
		try {
			obj = joinPoint.proceed();
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		System.out.println("timeCheck() 메소드 중 proceed() 뒷 부분" + sName);
		
		return obj;
		
	}
	
	
	
	
}
