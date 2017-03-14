package spring.chap07;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Bar {
	
	private Foo foo;
	
	
	public void doIt(){
		System.out.println("Bar.doIt()����");
	}

	@Required
	@Autowired
	@Qualifier("action")
	// ������̼ǰ� bean �� ������̼��� �켱������ ����.
	public void setFoo(Foo foo) {
		this.foo = foo;
	}
	
	public void doBar(){
		System.out.println("Bar doBar() ����");
		foo.doFoo();
	}

	
	
	
}
