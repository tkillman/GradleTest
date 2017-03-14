package spring.chap04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import spring.chap04.CollEx;

public class Main {
	
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new GenericXmlApplicationContext("application.xml");
		
		CollEx collEx = applicationContext.getBean("collEx",CollEx.class);

		System.out.println(collEx.listValue.get(1));
		System.out.println(collEx.mapValue.get("hi"));
		System.out.println(collEx.propValue.getProperty("hi"));
	
		
	}
	
}
