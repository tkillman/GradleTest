package spring.chap07;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*@Component*/
public class Foo {
	
	String name;
	
	public Foo(){
		System.out.println("�⺻ ������ ȣ��");
	}
	

	@PostConstruct
	void start(){
		System.out.println("�ʱ�ȭ �޼ҵ� : start()");
	}
	
	
	@PreDestroy
	void stop(){
		System.out.println("�Ҹ� �޼ҵ� : stop()");
	}
	
	public void doFoo(){
		System.out.println("Foo Ŭ���� doFoo() ����");
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
