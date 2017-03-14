package spring.chap05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
				
		ApplicationContext applicationContext = new GenericXmlApplicationContext("applicationContext1.xml");
		
		Foo f = applicationContext.getBean("foo",Foo.class);
	
		f.doFoo();	
	}
}

