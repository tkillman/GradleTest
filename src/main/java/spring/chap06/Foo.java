package spring.chap06;

import org.springframework.beans.factory.BeanNameAware;

public class Foo implements BeanNameAware{
	
	
	public Foo(){
		System.out.println("기본 생성자 호출");
	}
	
	
	
	public void doFoo(){
		
		System.out.println("Foo.doFoo()  실행");
		
	}

	void start(){
		System.out.println("초기화 메소드 : start()");
	}
	
	void stop(){
		System.out.println("소멸 메소드 : stop()");
	}



	@Override
	public void setBeanName(String name) {
		System.out.println("setBeanName");
		
	}
	
	
	
	
	

}
