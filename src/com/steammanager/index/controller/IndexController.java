package com.steammanager.index.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  

@Controller
public class IndexController{
    @RequestMapping("/index")
    public String openIndex(Model model) {
        return "index";
    }  
}  
