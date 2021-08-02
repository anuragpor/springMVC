package com.anurag.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/hello") // like parent mapping
public class HelloWorldController {
	// need a controller method to show the intital html form
//	Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
	
//	StackTraceElement l = new Exception().getStackTrace()[0];
	
//	System.out.println("sfsf");
	
//	(l.getClassName()+"/"+l.getMethodName()+":"+l.getLineNumber());
	@RequestMapping("/showForm")
	public String showForm() {
		StackTraceElement l = new Exception().getStackTrace()[0];
		System.out.println(l.getClassName()+"/"+l.getMethodName()+":"+l.getLineNumber());
		return "helloworld-form";
	}
	
	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// new a controller method to read form data and add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		// read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		
		// convert the data to all caps
		theName = theName.toUpperCase();
		
		// create the message
		String result = "Yo!" + theName;
		
		// add message to the model
		model.addAttribute("message", result);
		return "helloworld";
	}
	// spring will read the param from request i.e studentName and bind it to the variable: theName
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		
		// read the request parameter from the HTML form
		// this step already done using @RequestParam annotation
		
		// convert the data to all caps
		theName = theName.toUpperCase();
		
		// create the message
		String result = "Hey My Friend v3!" + theName;
		
		// add message to the model
		model.addAttribute("message", result);
		return "helloworld";
	}
}
