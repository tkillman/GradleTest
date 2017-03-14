package spring.chap09;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

public class PerformAspect {

	
	public Object timeCheck(ProceedingJoinPoint joinPoint) throws Throwable{
		Signature s =joinPoint.getSignature();
		
		String sName = s.getName();
		
		System.out.println("timeCheck() �޼ҵ� �� proceed() �� �κ�" + sName);
		
		Object obj = null;
		
		//����ä�� ���� �޼ҵ带 �����Ų��. , �ٽɷ���
		
		try {
			obj = joinPoint.proceed();
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		System.out.println("timeCheck() �޼ҵ� �� proceed() �� �κ�" + sName);
		
		return obj;
		
	}
	
	
	
	
}
