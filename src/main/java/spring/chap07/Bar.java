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
		System.out.println("Bar.doIt()실행");
	}

	@Required
	@Autowired
	@Qualifier("action")
	// 어노테이션과 bean 중 어노테이션은 우선순위가 높다.
	public void setFoo(Foo foo) {
		this.foo = foo;
	}
	
	public void doBar(){
		System.out.println("Bar doBar() 실행");
		foo.doFoo();
	}

	
	
	
}
