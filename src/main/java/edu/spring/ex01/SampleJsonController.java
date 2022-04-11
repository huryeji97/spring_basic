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
		LOGGER.info("json1() ȣ��");
		return "sample1"; // jspȣ��
	}
	
	// @ResponseBody : �Լ��� ������ ����������(json)���� �����ϴ� ������̼�
	@GetMapping("/json2")
	@ResponseBody
	public String json2() {
		LOGGER.info("json2() ȣ��");
		return "Hello, Spring!";
	}
	
	@GetMapping("/json3")
	@ResponseBody
	public ProductVO json3() {
		LOGGER.info("json3() ȣ��");
		return new ProductVO("�߱���", 10000);
	}
}
