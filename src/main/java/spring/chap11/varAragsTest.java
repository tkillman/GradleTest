package spring.chap11;

public class varAragsTest {

	
	
	public void method1(String... s1){//배열로 받아오게 된다. 제일 뒤에 와야한다.
		
		for(String str : s1){
			System.out.println(str);
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		varAragsTest vt = new varAragsTest();
		
		vt.method1("hello","world","adf");
		
		
	}
	
}
