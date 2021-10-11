package com.saraya.webServicesresfulAPI.helloWorld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
	
	@Autowired
	private MessageSource messageSource;
	
	@RequestMapping(path="/hello-world")
	public String helloWorld() {
		return "I'm just here";
	}
	
	@RequestMapping(path="/hello-world/bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean ("I'm just in another place");
	}
	
	@RequestMapping(path="/hello-world/pathVariable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("I'm a PathVariable, %s", name));
	}
	
	@RequestMapping(path="/hello-world-internationalized")
	public String helloWorldInternationalized() {
		return messageSource.getMessage("good.morning.message", 
				null, LocaleContextHolder.getLocale());
	}



}
