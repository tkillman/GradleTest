package spring.chap05;

public class Foo {
	Bar bar;
	Baz baz;
	
	
	public Foo(){
		System.out.println("�⺻ ������ ȣ��");
	}
	
	
	
	public void doFoo(){
		
		System.out.println("Foo.doFoo()  ����");
		bar.doIt();
	}

	
	
	
	
	public void setBar(Bar bar) {
		this.bar = bar;
	}

	
	

	public void setBaz(Baz baz) {
		this.baz = baz;
	}


}
