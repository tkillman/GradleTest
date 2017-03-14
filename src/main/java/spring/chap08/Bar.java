package spring.chap08;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Bar {

	
	@Bean(name="scottFoo")
	public Foo activeFoo(){
		Foo foo = new Foo();
		
		foo.name = "donggyu";
		
		return foo;
		
	}
	
	
	
}
