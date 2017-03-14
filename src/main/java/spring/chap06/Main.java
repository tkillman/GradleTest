package spring.chap06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	
	public static void main(String[] args) {
		
		
		AbstractApplicationContext context = new GenericXmlApplicationContext("applicationContext2.xml");
		Foo foo = context.getBean("foo",Foo.class);
		
		foo.doFoo();
		
		context.registerShutdownHook();
		
	}
	
}
