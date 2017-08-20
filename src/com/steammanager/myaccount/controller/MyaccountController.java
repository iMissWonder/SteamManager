package com.steammanager.myaccount.controller;

import java.util.Iterator;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.koraktor.steamcondenser.exceptions.SteamCondenserException;
import com.github.koraktor.steamcondenser.steam.community.SteamId;
import com.github.koraktor.steamcondenser.steam.community.WebApi;
import com.steammanager.login.entity.Login;
import com.steammanager.myaccount.entity.Myaccount;
import com.steammanager.myaccount.service.MyaccountService;
 

@Controller
@Scope(value="prototype")
@RequestMapping("/")
public class MyaccountController {
	
	@Resource
	MyaccountService myaccountService;

	 @RequestMapping("/myaccount")
	    public String openMyaccout(Myaccount myaccount,Model model,HttpServletRequest request, HttpServletResponse response) {      
				//设置ApiKey，不用动这一行
			try{
				String steamid;
				String newsteamid = myaccount.getNewsteamid();
				Login l = (Login)request.getSession(true).getAttribute("user"); 
				int currentuser = l.getId();
				
				if(newsteamid != null){
					myaccountService.updateSteamid(newsteamid, currentuser);
					steamid = newsteamid;
				}
				else
				{
					steamid = l.getSteamid();
				}
				
				//数据输出
				WebApi.setApiKey("A74B22F966980A409C2E7E669C57424A");
				//根据steam用户名创建steamId
				SteamId id;
				try{
					id = SteamId.create(steamid);
				}
				catch(SteamCondenserException e){
					id = SteamId.create(Long.parseLong(steamid));
				}
				//以下可以输出不同字段
				//测试输出头像Url
				model.addAttribute("avatar", id.getAvatarFullUrl());
				model.addAttribute("nickname",id.getNickname());
				model.addAttribute("realname",id.getRealName());
				Map<String, Float> mostGames = id.getMostPlayedGames();
				Iterator<String> iter2 = mostGames.keySet().iterator();
				model.addAttribute("mostgame",iter2.next());
				model.addAttribute("steam64",id.getSteamId64());
				model.addAttribute("since",id.getMemberSince());
				model.addAttribute("location", id.getLocation());
				model.addAttribute("summary", id.getSummary());
				model.addAttribute("state", id.getStateMessage());
			} catch(SteamCondenserException e) {
				model.addAttribute("error", e);
			} catch(NullPointerException e){
				return "login";
			}
				
				return "myaccount";		
	 	}
}