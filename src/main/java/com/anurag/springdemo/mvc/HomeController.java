package com.anurag.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showPage() {
		return "main-menu"; // no need to write complete view name as we already defined prefix and suffix in xml file
	}
}
