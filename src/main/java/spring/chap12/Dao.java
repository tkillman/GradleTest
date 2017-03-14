package spring.chap12;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

public class Dao extends SqlSessionDaoSupport{

	/*@Autowired
	SqlSession session;

	public void setSession(SqlSession session) {
		this.session = session;
	}*/
	
	//����Ʈ �ҷ�����
	public List selectList(){
		
		//return session.selectList("myMem.getList");
		return getSqlSession().selectList("myMem.getList");
	
	}
	
	
	//insert �غ���
	public int insertMem(Member member){
		//int resultNum =session.insert("myMem.insertM",member);
		int resultNum =getSqlSession().insert("myMem.insertM",member);
		return resultNum;
	}
	
	//update�غ���
	public int updateMem(Member member){
		//int resultNum =session.update("myMem.updateM",member);
		
		int resultNum =getSqlSession().update("myMem.updateM",member);
		return resultNum;
	}
	
	//delete �غ���
	public int deleteMem(Member member){
		//int resultNum =session.delete("myMem.deleteM",member);
		
		int resultNum =getSqlSession().delete("myMem.deleteM",member);
		return resultNum;
	}
	
}
