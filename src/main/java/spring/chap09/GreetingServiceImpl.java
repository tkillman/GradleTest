package spring.chap09;

public class GreetingServiceImpl implements GreetingService {
	
	private String greeting;
	
	
	

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	@Override
	public void sayHello(String name) throws Exception {
	
		System.out.println("Target -Object�� �޼ҵ�  --sayHello :" + greeting + ": " + name);
		throw new Exception("���� ����");
		
		
	}

	
	@Override
	public void sayGoodbye(String name) {
	
		System.out.println("Target -Object�� �޼ҵ�  --sayGoodbye :" +greeting + " : " +name);
		
	}

	
}
