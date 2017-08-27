package com.steammanager.storeinfo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;

import com.steammanager.storeinfo.entity.StoreinfoForm;
import com.steammanager.storeinfo.service.StoreinfoService; 

@Controller
public class StoreinfoController {
	@Resource
	StoreinfoService storeinfoservice;
	
	@RequestMapping("/storeinfo")
	public String openStoreinfo(StoreinfoForm storeinfoForm, Model model)
	{
		storeinfoForm.setStoreinfoCollocation(storeinfoservice.selectStoreinfo());
		model.addAttribute("result",storeinfoForm);
		return "storeinfo";
	}

}
