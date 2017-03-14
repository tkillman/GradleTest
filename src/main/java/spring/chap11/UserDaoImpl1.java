package spring.chap11;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class UserDaoImpl1 extends JdbcDaoSupport{
	
	/*
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	*/
	
	
	
	//리스트로 꺼내오기
	public List<User> findUserList(){
		String sql = "select * from member";
		UserRowMapper rowMapper = new UserRowMapper();
		/*List<User> userlist = jdbcTemplate.query(sql, rowMapper);*/
		
		List<User> userlist =getJdbcTemplate().query(sql, rowMapper);
		
		return userlist;
		
	}
	
	//한명 꺼내오기
	public User findUserOne(){
		
		String sql = "select * from member where memberId= ?";
		UserRowMapper userRowMapper = new UserRowMapper();
		
		
		String[] id={"tk"};
		
		
		User user =getJdbcTemplate().queryForObject(sql, id ,userRowMapper);
		
		return user;
	}
	
	//insert,update
	public int insertUser(String[] userValues){
		String sql="insert into member values(?,?,?,?)";
		
		int resultNum = getJdbcTemplate().update(sql,userValues);
		
		
		return resultNum;
	}
	
	//delete 해보기
	
	public int deleteUser(String[] id){
		String sql="delete from member where memberId=?";
		
		int resultNum = getJdbcTemplate().update(sql,id);
		
		
		return resultNum;
	}
	
	//전체 숫자 꺼내오기
	public int countNum(){
		
		String sql = "select count(*) from member";
		UserRowMapper userRowMapper = new UserRowMapper();
		
		Integer integer =getJdbcTemplate().queryForObject(sql,Integer.class);
		
		return integer;
	}
	
}
