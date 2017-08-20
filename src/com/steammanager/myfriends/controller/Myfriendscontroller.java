package com.steammanager.myfriends.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.koraktor.steamcondenser.exceptions.SteamCondenserException;
import com.github.koraktor.steamcondenser.steam.community.SteamId;
import com.github.koraktor.steamcondenser.steam.community.WebApi;
import com.steammanager.login.entity.Login;

@Controller
public class Myfriendscontroller {
	@RequestMapping("/myfriends")
	    public String openMyfriend(Model model,HttpServletRequest request, HttpServletResponse response) {
		 try {
				Login l = (Login)request.getSession(true).getAttribute("user"); 
				String steamid = l.getSteamid();
				
				//设置ApiKey，不用动这一行
				WebApi.setApiKey("A74B22F966980A409C2E7E669C57424A");

				//根据steam用户名创建steamId
				SteamId id;
				try{
					id = SteamId.create(steamid);
				}
				catch(SteamCondenserException e){
					id = SteamId.create(Long.parseLong(steamid));
				}
				SteamId[] friends = id.getFriends();
				List<SteamId> friendsList =new ArrayList<SteamId>();
				for (int i = 0; i < friends.length;i++){
					try {
						SteamId person = SteamId.create(friends[i].getSteamId64());
						friendsList.add(person);
					}
					catch(SteamCondenserException e){
						continue;
					}
				}
				//以下可以输出不同字段
				model.addAttribute("friends", friendsList);

			} catch (SteamCondenserException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				model.addAttribute("error", e);
			}

	        return "myfriends";
	    }  
}
