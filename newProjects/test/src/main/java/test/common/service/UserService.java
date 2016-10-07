package test.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserService {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List getUserList(){
		
		List result = jdbcTemplate.queryForList("select * from user");
		return result;
		
	}
}
