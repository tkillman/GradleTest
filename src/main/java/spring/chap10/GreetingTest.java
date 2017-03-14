package spring.chap10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class GreetingTest {

	
	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext10.xml");
		
		GreetingService gs = (GreetingService)context.getBean("greetingTarget");
		
		try {
			
			gs.sayHello("dog");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
