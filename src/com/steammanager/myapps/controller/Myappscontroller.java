package com.steammanager.myapps.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.koraktor.steamcondenser.exceptions.SteamCondenserException;
import com.github.koraktor.steamcondenser.steam.community.SteamGame;
import com.github.koraktor.steamcondenser.steam.community.SteamId;
import com.github.koraktor.steamcondenser.steam.community.WebApi;

import com.github.goive.steamapi.SteamApi;
import com.github.goive.steamapi.data.SteamApp;
import com.github.goive.steamapi.exceptions.SteamApiException;

import com.steammanager.login.entity.Login;
import com.steammanager.myapps.entity.Myapps;
import com.steammanager.myapps.service.MyappsService;
import com.steammanager.userq.controller.Userq;
 

@Controller
@Scope(value="prototype")
@RequestMapping("/")
public class Myappscontroller {

	@Resource
	MyappsService myappsService;

	 @RequestMapping("/myapps")
	    public String openMyaccout(Myapps myapps, Model model,HttpServletRequest request, HttpServletResponse response) {      
			try{	
				int appid = myapps.getAppid();
				String appname = myapps.getAppname();
				Login l = (Login)request.getSession(true).getAttribute("user"); 
				int currentuser = l.getId();
				String steamid = l.getSteamid();

				if (appname != null)
				{
					myappsService.insertFollow(currentuser,appid);
				}

				//设置ApiKey，不用动这一行
				WebApi.setApiKey("A74B22F966980A409C2E7E669C57424A");
				//创建steamId
				SteamId id;
				try{
					id = SteamId.create(steamid);
				}
				catch(SteamCondenserException e){
					id = SteamId.create(Long.parseLong(steamid));
				}
				//以下可以输出不同字段
				//测试输出头像Url
				HashMap<Integer,SteamGame> games = id.getGames();
				Iterator<Entry<Integer, SteamGame>> iter = games.entrySet().iterator();
				ArrayList<Userq> gameList = new ArrayList<Userq>();
				while (iter.hasNext()) { 
					Entry<Integer,SteamGame> entry = iter.next();
					
					//key代表该用户拥有游戏的id
					Object key = entry.getKey();
					
					//val代表该游戏的游戏信息，类型为SteamGame,可以用SteamGame的方法解析
					SteamGame val = entry.getValue();
					
					//测试输出当前游戏id
					
					Userq agame = new Userq();
					agame.setGameid(String.valueOf(key));
					agame.setGamename(val.getName());
					agame.setGameimage(val.getLogoThumbnailUrl());
					gameList.add(agame);
					
				}
				
				model.addAttribute("result", gameList);

			}catch(SteamCondenserException e){
				
				model.addAttribute("error", e);
			} catch(NullPointerException e){
				return "login";
			}
			return "myapps";		
	 	}
}
