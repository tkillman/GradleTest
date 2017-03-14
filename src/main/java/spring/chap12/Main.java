package spring.chap12;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext12.xml");
		Dao dao = (Dao)context.getBean("dao");
		
		
		//����Ʈ ��������
		/*List<Member> members =dao.selectList();
		
		for(Member member : members){
			
			System.out.println(member);
		}*/
		
		
		//insert �غ���
	
		/*	
		Member member = new Member();
		member.setMemberId("qw1234");
		member.setPassword("123");
		member.setName("hosu");
		member.setEmail("xc@naver.com");
		
		int resultNum =dao.insertMem(member);
		System.out.println(resultNum);*/
		
		//update �غ���
		
		/*Member member = new Member();
		member.setMemberId("tk");
		member.setEmail("modify@naver.com");
		int resultNum = dao.updateMem(member);
		System.out.println(resultNum);
		*/
		
		
		//delete �غ���
	
		/*	Member member =new Member();
		member.setMemberId("tk");
		member.setPassword("123");
		
		int resultNum = dao.deleteMem(member);
		System.out.println(resultNum);
		*/
		
		
		
		
	}
	
	
}
