package spring.chap11;

public class varAragsTest {

	
	
	public void method1(String... s1){//�迭�� �޾ƿ��� �ȴ�. ���� �ڿ� �;��Ѵ�.
		
		for(String str : s1){
			System.out.println(str);
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		varAragsTest vt = new varAragsTest();
		
		vt.method1("hello","world","adf");
		
		
	}
	
}
