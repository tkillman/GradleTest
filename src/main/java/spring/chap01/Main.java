package spring.chap01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		
		//1. resource �� ClassPathResource�� ���� �����.
		//2. BeanFactory�� �����.
		//3. beanFactory�� getBean�� ���� bean�� �����´�.
		
		Resource resource = new ClassPathResource("application.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		WriteArticleService articleService = (WriteArticleService) beanFactory.getBean("writeArticleService");
		articleService.write(new Article());	
	}
}
