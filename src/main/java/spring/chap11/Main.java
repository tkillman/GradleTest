package spring.chap11;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext11.xml");
		UserDaoImpl1 jdbcDao = (UserDaoImpl1)context.getBean("jdbcDao");
		
		
		//List 받아오기
		/*
		List<User> mem = jdbcDao.findUserList();
		
		for(User user : mem){
			System.out.println(user);
		}*/
		
		//하나만 꺼내오기
		/*User user = jdbcDao.findUserOne();
		
		System.out.println(user);*/
		
		//insert 해보기
		/*String[] userValues = {"dk","123","jawon","aksdj@naver.com"};
		int resultNum = jdbcDao.insertUser(userValues);
		System.out.println(resultNum);*/
		
		//delete 해보기
		
		/*String[] id = {"dk"};
		int resultNum = jdbcDao.deleteUser(id);
		System.out.println(resultNum);*/
		
		
		//count 해보기
		int countNum = jdbcDao.countNum();
		System.out.println(countNum);
		
	}

}
