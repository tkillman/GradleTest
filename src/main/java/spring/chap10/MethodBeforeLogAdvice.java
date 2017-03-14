package spring.chap10;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MethodBeforeLogAdvice implements MethodBeforeAdvice{

	
	
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		
		System.out.println("before 메소드 실행");
		
	}
	
	
	
	
}
