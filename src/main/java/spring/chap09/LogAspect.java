package spring.chap09;

public class LogAspect {

	
	public void beforeLogging(){
		System.out.println("�޼��� ȣ�� ��");
	}
	
	
	public Object afterLogging(Object returnValue){
		System.out.println("�޼��� ȣ�� ��" + returnValue);
		return returnValue;
	}
	

	public void throwingLogging(Exception e){
		
		System.out.println("���ܹ߻�" + e.getMessage());
	
	}
	
	public void alwaysLogging(){
		System.out.println("�׻� ����");
	}
	
	
}
