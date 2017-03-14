package spring.chap05;

public class Foo {
	Bar bar;
	Baz baz;
	
	
	public Foo(){
		System.out.println("기본 생성자 호출");
	}
	
	
	
	public void doFoo(){
		
		System.out.println("Foo.doFoo()  실행");
		bar.doIt();
	}

	
	
	
	
	public void setBar(Bar bar) {
		this.bar = bar;
	}

	
	

	public void setBaz(Baz baz) {
		this.baz = baz;
	}


}
