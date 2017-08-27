package com.steammanager.myconcerned.controller;
 
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;

import com.steammanager.login.entity.Login;
import com.steammanager.myconcerned.entity.MyconcernedForm;
import com.steammanager.myconcerned.service.MyconcernedService;  

@Controller
public class MyconcernedController{
	@Resource
	MyconcernedService myconcernedService;
	
    @RequestMapping("/myconcerned")
    public String openMyconcerned(MyconcernedForm myconcernedForm, Model model, HttpServletRequest request, HttpServletResponse response) {
    	
    	try{
			Login l = (Login)request.getSession(true).getAttribute("user"); 
			int currentuser = l.getId();
			myconcernedForm.setMyconcernedCollocation(myconcernedService.selectMyconcerned(currentuser));
			model.addAttribute("result",myconcernedForm);
			return "myconcerned";
    	} catch(NullPointerException e){
    		return "login";
    	}
    }  
}  
