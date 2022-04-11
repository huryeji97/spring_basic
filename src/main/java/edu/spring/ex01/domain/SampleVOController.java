package edu.spring.ex01.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class SampleVOController {
	private static final Logger LOGGER = LoggerFactory.getLogger(SampleVOController.class);
	
	@GetMapping("/product1")
	public String product1(Model model, String name, int price) {
		LOGGER.info("product1() ȣ��");
		ProductVO vo = new ProductVO(name, price);
		model.addAttribute("vo", vo);
		
		return "product-result";
	}
	
	@GetMapping("/product2")
	public String product2(@ModelAttribute(name="vo") ProductVO vo) { // ProductVO vo - bean�� ����
		LOGGER.info("product2() ȣ��");
		LOGGER.info(vo.toString());
		return "product-result";
	}
}
