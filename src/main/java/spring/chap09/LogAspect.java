package spring.chap09;

public class LogAspect {

	
	public void beforeLogging(){
		System.out.println("메서드 호출 전");
	}
	
	
	public Object afterLogging(Object returnValue){
		System.out.println("메서드 호출 후" + returnValue);
		return returnValue;
	}
	

	public void throwingLogging(Exception e){
		
		System.out.println("예외발생" + e.getMessage());
	
	}
	
	public void alwaysLogging(){
		System.out.println("항상 실행");
	}
	
	
}
