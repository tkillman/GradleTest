package spring.chap03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import spring.chap03.Foo2;

public class Main {

	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = new GenericXmlApplicationContext("application.xml");
		
		Foo2 f2 = applicationContext.getBean("foo2",Foo2.class);
	
		f2.doFoo2();
		
	}
	
}
