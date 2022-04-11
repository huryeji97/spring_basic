package edu.spring.ex01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class SampleController3 {
	private static final Logger LOGGER = LoggerFactory.getLogger(SampleController3.class);
	
	@GetMapping("/test3")
	public String test3(@ModelAttribute(name="username") String username) {
		// @ModelAttribute : 요청받은 데이터(username)을 view에 전송
		// name="username" : model.addAttribute() 키값을 의미
		return "param-test";
	}
	
	@GetMapping("/test4")
	public String test4(@ModelAttribute(name="username") String username,
						@ModelAttribute(name="age") int age) {
		return "param-test";
	}
}