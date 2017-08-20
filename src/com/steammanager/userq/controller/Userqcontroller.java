package com.steammanager.userq.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.koraktor.steamcondenser.exceptions.SteamCondenserException;
import com.github.koraktor.steamcondenser.steam.community.SteamGame;
import com.github.koraktor.steamcondenser.steam.community.SteamId;
import com.github.koraktor.steamcondenser.steam.community.WebApi;

import com.steammanager.userq.controller.Userq;;
@Controller
public class Userqcontroller {
	@RequestMapping("/userq")
	public String openUserq(Model model){
		return "userq";
	}
	
	@RequestMapping(value="/userq/search",method=RequestMethod.GET)
	public String getuserinfo(String userid, Model model){
		System.out.println("------------123-------------");
		try {
			//设置ApiKey，不用动这一行
			WebApi.setApiKey("A74B22F966980A409C2E7E669C57424A");
			SteamId id;
			System.out.println("userid:"+userid);
			//根据steam用户名创建steamId
			try {
				id = SteamId.create(userid);
			} catch (SteamCondenserException e){
				long longid = Long.parseLong(userid);
				id = SteamId.create(longid);
			}

			
			//System.out.println("------------2-------------");
			//以下可以输出不同字段
			//测试输出头像Url
			System.out.println(id.getAvatarFullUrl());

			//功能：获取该用户所有游戏的ID
			//以下四行使用迭代器遍历哈希映射，不用看懂，while循环里的key、val是要用的数据
			HashMap<Integer,SteamGame> games = id.getGames();
			Iterator<Entry<Integer, SteamGame>> iter = games.entrySet().iterator();
			ArrayList<Userq> gameList = new ArrayList<Userq>();
			while (iter.hasNext()) { //System.out.println("------------ww-------------");
				Entry<Integer,SteamGame> entry = iter.next();
				
				//key代表该用户拥有游戏的id
				Object key = entry.getKey();
				
				//val代表该游戏的游戏信息，类型为SteamGame,可以用SteamGame的方法解析
				SteamGame val=entry.getValue();
				
				//测试输出当前游戏id
				System.out.println(key+",,,---name---:"+ val.getName());
				
				Userq uq = new Userq();
				uq.setGameid(String.valueOf(key));
				uq.setGamename(val.getName());
				uq.setGameimage(val.getLogoThumbnailUrl());
				gameList.add(uq);
				
			}
			model.addAttribute("avatar", id.getAvatarFullUrl());
			model.addAttribute("result", gameList);
			model.addAttribute("nickname",id.getNickname());
			model.addAttribute("realname",id.getRealName());
			Map<String, Float> mostGames = id.getMostPlayedGames();
			Iterator<String> iter2 = mostGames.keySet().iterator();
			model.addAttribute("mostgame",iter2.next());
			model.addAttribute("steam64",id.getSteamId64());
			model.addAttribute("since",id.getMemberSince());
			for(int i = 0; i < gameList.size(); i++) {
				System.out.println(gameList.get(i).getGamename()+","+gameList.get(i).getGameid()+","+gameList.get(i).getGameimage());
			}
			
		} catch (SteamCondenserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			model.addAttribute("error", e);
		}
		return "userq";
		
	}
	
}

