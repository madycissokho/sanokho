package com.saraya.springbootwebapplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	
	@RequestMapping(value="/login")
	public String sayHello(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		return "login";
	}

}
