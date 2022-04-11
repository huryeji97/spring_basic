package edu.spring.ex01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController2 {
	private static final Logger LOGGER = LoggerFactory.getLogger(SampleController2.class);
	
	@GetMapping("/test1")
	public String test1(Model model, String username) {
		// username : request.getParameter("username");
		LOGGER.info("test1() 호출 : username = " + username);		
		// Model : view에 데이터를 전송하기 위한 객체
		// forwarding 방식과 동일
		model.addAttribute("username", username);
		
		return "param-test";
	}
	
	@GetMapping("/test2")
	public String test2(Model model, String username, int age) {
		// spring의 장점 : parsing이 필요 없음!
		LOGGER.info("test2() 호출");
		LOGGER.info("username = " + username);
		LOGGER.info("age = " + age);
		username = username.toUpperCase();
		model.addAttribute("username", username);
		model.addAttribute("age", age);
		
		return "param-test";
	}
}
