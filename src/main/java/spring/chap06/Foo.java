package spring.chap06;

import org.springframework.beans.factory.BeanNameAware;

public class Foo implements BeanNameAware{
	
	
	public Foo(){
		System.out.println("�⺻ ������ ȣ��");
	}
	
	
	
	public void doFoo(){
		
		System.out.println("Foo.doFoo()  ����");
		
	}

	void start(){
		System.out.println("�ʱ�ȭ �޼ҵ� : start()");
	}
	
	void stop(){
		System.out.println("�Ҹ� �޼ҵ� : stop()");
	}



	@Override
	public void setBeanName(String name) {
		System.out.println("setBeanName");
		
	}
	
	
	
	
	

}
