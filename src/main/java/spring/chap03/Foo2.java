package spring.chap03;

public class Foo2 {

	Bar2 bar2;
	
	
	public Bar2 getBar2(){
		return null;
	}
	
	public void doFoo2(){
		bar2 = getBar2();
		bar2.doBar2();
		
		
	}
	
	
}
