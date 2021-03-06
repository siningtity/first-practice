package test.common.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/common")
public class CommonController {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@RequestMapping("/main")
	public String test(){
		return "회원 가입 & 로그인 구현하기";
	}
	
	@RequestMapping("/selectTest")
	public List selectTest(){
		List result = jdbcTemplate.queryForList("select * from user");
		return result;
	}
	
	@RequestMapping("/insertTest")
	public String insertTest(){
		jdbcTemplate.execute("insert into user(user_id, password, name) values ('test3', '1234', '테스트3')");
		return "완료";
	}
}
