package spring.chap09;

public class GreetingServiceImpl implements GreetingService {
	
	private String greeting;
	
	
	

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	@Override
	public void sayHello(String name) throws Exception {
	
		System.out.println("Target -Object의 메소드  --sayHello :" + greeting + ": " + name);
		throw new Exception("강제 예외");
		
		
	}

	
	@Override
	public void sayGoodbye(String name) {
	
		System.out.println("Target -Object의 메소드  --sayGoodbye :" +greeting + " : " +name);
		
	}

	
}
