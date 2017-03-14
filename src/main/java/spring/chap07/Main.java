package spring.chap07;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	
	public static void main(String[] args) {
		
		
		AbstractApplicationContext context = new GenericXmlApplicationContext("ann.xml");
		Bar bar = context.getBean("bar",Bar.class);
		
		bar.doBar();
		
		context.registerShutdownHook();
		
		
		
	}
}
