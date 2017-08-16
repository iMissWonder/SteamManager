package com.steammanager.login.controller;
 
import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.steammanager.login.entity.Login;
import com.steammanager.login.service.LoginService;

@Controller
@Scope(value="prototype")
@RequestMapping("/")
public class LoginController {

    @Resource
    private LoginService loginService;

    @RequestMapping(value="/login",method=RequestMethod.GET)
    public String login(Login login,Model model) throws Exception {

        login=loginService.checkLogin(login.getUsername(), login.getPassword());
        if(login!=null){
            model.addAttribute(login);
            return "index";
        }
        return "login";
    }

    @RequestMapping(value="/register",method=RequestMethod.GET)
    public String register(Login login, Model model) throws Exception {
    	if(loginService.checkRegister(login.getUsername(), login.getPassword()))
		{
    		return "login";
		}
        return "register";
    }  
}