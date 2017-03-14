package spring.chap02;

public class Foo {
	Bar bar;
	Baz baz;
	
	
	int i;
	
	public Foo(){
		System.out.println("기본 생성자 호출");
	}
	
	public Foo(Bar bar, Baz baz) {
		this.bar = bar;
		this.baz = baz;
	}
	
	public Foo(String s, int s2,Bar bar, Baz baz ){
		System.out.println("String s, int s2");
		
	}

	
	public Foo(String s, String s2,Bar bar, Baz baz ){
		System.out.println("String s, String s2,Bar bar, Baz baz" +bar);
		this.bar =bar;
	}
	
	public Foo(int i, int i2,Bar bar, Baz baz ){
		System.out.println("int i, int i2");
		
	}
	
	public void doFoo(){
		
		System.out.println("Foo.doFoo()  실행" + i);
		bar.doIt();
	}

	
	public void setBar(Bar bar) {
		this.bar = bar;
	}

	

	public void setBaz(Baz baz) {
		this.baz = baz;
	}


	public void setI(int i) {
		this.i = i;
	}
	
	
}
