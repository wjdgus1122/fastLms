package com.zerobase.demo;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@Controller
public class MainController {

	@RequestMapping("/")
	public String index() throws Exception{
		
		
		
		return "thymeleaf/welcome";
	}
	
	// request -> WEB -> SERVER
	// response -> SERVER -> WEB
	
	@RequestMapping("/hello")
	public void hello(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		PrintWriter printWriter = response.getWriter();
		
		String msg = "<p>hello</p> <p>fastlms website!!</p>";
		
		printWriter.write(msg);
		printWriter.close();
	}
	
	
	

}
