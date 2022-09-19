package kr.itthis.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("hello 요청");
		
		return "hello"; //jsp의 이름 역할 or 직접적인 데이터
	}
	
}
