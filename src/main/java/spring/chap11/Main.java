package spring.chap11;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext11.xml");
		UserDaoImpl1 jdbcDao = (UserDaoImpl1)context.getBean("jdbcDao");
		
		
		//List �޾ƿ���
		/*
		List<User> mem = jdbcDao.findUserList();
		
		for(User user : mem){
			System.out.println(user);
		}*/
		
		//�ϳ��� ��������
		/*User user = jdbcDao.findUserOne();
		
		System.out.println(user);*/
		
		//insert �غ���
		/*String[] userValues = {"dk","123","jawon","aksdj@naver.com"};
		int resultNum = jdbcDao.insertUser(userValues);
		System.out.println(resultNum);*/
		
		//delete �غ���
		
		/*String[] id = {"dk"};
		int resultNum = jdbcDao.deleteUser(id);
		System.out.println(resultNum);*/
		
		
		//count �غ���
		int countNum = jdbcDao.countNum();
		System.out.println(countNum);
		
	}

}
