package spring.chap09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class GreetingTest {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext09.xml");
		GreetingService service = (GreetingService)context.getBean("greetingTarget");
		
		try {
			service.sayHello("동규");
			
			//service.sayGoodbye("사자");
		} catch (Exception e) {
			
			// TODO Auto-generated catch block
			
		}
		
	}
	
	
}
