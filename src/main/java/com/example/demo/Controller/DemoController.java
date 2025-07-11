package com.example.demo.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
@Controller

public class DemoController {
	
	@RequestMapping("/home")
	
	public String home() {
		return "index";
	}
	
	

}
