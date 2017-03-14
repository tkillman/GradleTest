package spring.chap01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		
		//1. resource 를 ClassPathResource를 통해 만든다.
		//2. BeanFactory를 만든다.
		//3. beanFactory의 getBean을 통해 bean을 가져온다.
		
		Resource resource = new ClassPathResource("application.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		WriteArticleService articleService = (WriteArticleService) beanFactory.getBean("writeArticleService");
		articleService.write(new Article());	
	}
}
