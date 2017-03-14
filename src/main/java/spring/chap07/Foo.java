package spring.chap07;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*@Component*/
public class Foo {
	
	String name;
	
	public Foo(){
		System.out.println("기본 생성자 호출");
	}
	

	@PostConstruct
	void start(){
		System.out.println("초기화 메소드 : start()");
	}
	
	
	@PreDestroy
	void stop(){
		System.out.println("소멸 메소드 : stop()");
	}
	
	public void doFoo(){
		System.out.println("Foo 클래스 doFoo() 실행");
		System.out.println(name);

	}
	

	public String getName() {
		return name;
	}

	
	@Value("scontt")
	public void setName(String name) {
		this.name = name;
	}
	

	
	
}
