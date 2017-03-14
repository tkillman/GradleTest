package spring.chap13;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;

public class Dao {

	@Resource
	JdbcTemplate jdbcTemplate;
	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	
}
