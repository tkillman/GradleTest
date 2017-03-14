package spring.chap08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Annmain {

	
	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("ann2.xml");
		Foo foo = context.getBean("scottFoo",Foo.class);
		
		System.out.println(foo.getName());
		
	}
	
}
