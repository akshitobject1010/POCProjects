package com.spring.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.model.Data;

@Controller
@RequestMapping("/")
public class UserController {
	
	@RequestMapping("/")
	public String handler(Model model) {
		
		Data data= new Data();
		data.setUsername("luiz");
		data.setId(1);
		data.setMessage("OnBoarded");
		data.setDate(new Date());
		
		System.out.println("i have reached here");
		
		model.addAttribute("add", data);
		return "add";

}
}
