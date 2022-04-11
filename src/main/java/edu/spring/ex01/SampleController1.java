package edu.spring.ex01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//POJO : Plain Old Java Object
@Controller
// servlet-context.xml ���Ͽ���
// component-scanning�� ������� ������ִ� ������̼�
// @Component ������̼��� ����ص� ��
public class SampleController1 {
	// ������ �����ӿ�ũ���� �α׸� ����ϱ� ���� ��ü
	private static final Logger LOGGER = LoggerFactory.getLogger(SampleController1.class);
	
	@RequestMapping(value = "/sample1", method=RequestMethod.GET)
	// @RequestMapping : ��Ʈ�ѷ��� URL ���ΰ� �޼ҵ�(GET/POST/PUT/DELETE)�� ����
	// value = URL ���
	// method = ��û ��� ����(GET, POST, PUT, DELETE)
	// method �Ӽ��� �����ϸ� GET/POST ��� ó������
	// short cut ��� : @GetMapping, @PostMapping, ...
	public String sample1() {
		LOGGER.info("sample1() ȣ��");
		return "sample1"; // jsp ��� �� �̸�
		// WEB-INF/views/sample1.jsp
		// * ��Ʈ�ѷ� �޼ҵ� return ���� �ǹ�
		// ViewResolver ���� ���� view�� �����ϵ���(ã����) ��û
		// return Ÿ���� void�� ���� URL ������ ���ؼ� view�� ã��
	}
	
	@RequestMapping(value="/sample2")
	public void sample2() {
		LOGGER.info("sample2() ȣ��");
	} // void�� �˾Ƽ� mapping �Ѵ�.
}
