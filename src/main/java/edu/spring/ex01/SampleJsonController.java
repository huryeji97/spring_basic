package edu.spring.ex01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.spring.ex01.domain.ProductVO;

@Controller
public class SampleJsonController {
	private static final Logger LOGGER = LoggerFactory.getLogger(SampleJsonController.class);
	
	@GetMapping("/json1")
	public String json1() {
		LOGGER.info("json1() 호출");
		return "sample1"; // jsp호출
	}
	
	// @ResponseBody : 함수의 리턴을 데이터형식(json)으로 변경하는 어노테이션
	@GetMapping("/json2")
	@ResponseBody
	public String json2() {
		LOGGER.info("json2() 호출");
		return "Hello, Spring!";
	}
	
	@GetMapping("/json3")
	@ResponseBody
	public ProductVO json3() {
		LOGGER.info("json3() 호출");
		return new ProductVO("야구공", 10000);
	}
}
