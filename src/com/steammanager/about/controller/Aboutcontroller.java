package com.steammanager.about.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
@Controller
public class Aboutcontroller {
	@RequestMapping("/about")
	public String openabout(Model model)
	{
		return "about";
	}

}
