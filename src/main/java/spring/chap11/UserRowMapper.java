package spring.chap11;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setMemberId(rs.getString("memberId"));
		user.setPassword(rs.getString("password"));
		user.setName(rs.getString("name"));
		user.setEmail(rs.getString("email"));
		
		return user;	
		
	}	
}
