package com.steammanager.login.controller;
 
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;

import com.steammanager.login.entity.Login;
import com.steammanager.login.service.LoginService;

@Controller
@Scope(value="prototype")
@RequestMapping("/")
public class LoginController {

    @Resource
    private LoginService loginService;

    @RequestMapping(value="/login")
    public String login(Login login,Model model,HttpServletRequest request, HttpServletResponse response) throws Exception {

        login=loginService.checkLogin(login.getUsername(), login.getPassword());
        if(login!=null){
        	request.getSession(true).setAttribute("user", login); 
            model.addAttribute(login);
            return "index";
        }
        return "login";
    }

    @RequestMapping(value="/register")
    public String register(Login login, Model model) throws Exception {
    	if(loginService.checkRegister(login.getUsername(), login.getPassword(),login.getSteamid()))
		{
    		return "login";
		}
        return "register";
    }  
}