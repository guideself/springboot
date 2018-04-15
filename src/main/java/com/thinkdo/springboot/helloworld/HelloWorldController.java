package com.thinkdo.springboot.helloworld;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkdo.springboot.property.NeoProperties;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {
	
    @Autowired(required = false)
    protected HttpServletRequest request;

    @Autowired(required = false)
    protected HttpServletResponse response;
    
    @Autowired
    private NeoProperties neoProperties;
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World!!!" + neoProperties.getTitle()+"||"+neoProperties.getDescription();
	}
	
	@RequestMapping("/index")
	public String index() {
		return "Hello World!!!" + neoProperties.getTitle()+"||"+neoProperties.getDescription();
	}
}
