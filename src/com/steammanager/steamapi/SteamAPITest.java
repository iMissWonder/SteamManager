package com.steammanager.steamapi;



import com.github.koraktor.steamcondenser.steam.community.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import com.github.koraktor.steamcondenser.exceptions.*;

public class SteamAPITest {

	
	public static void main(String[] args) {
		try {
			//设置ApiKey，不用动这一行
			WebApi.setApiKey("AE4BA6A15C4F64A797EF1F30D92156BA");

			//根据steam用户名创建steamId
			SteamId id = SteamId.create("iMissWonder");
			
			//以下可以输出不同字段
			//测试输出头像Url
			System.out.println(id.getAvatarFullUrl());

			//功能：获取该用户所有游戏的ID
			//以下四行使用迭代器遍历哈希映射，不用看懂，while循环里的key、val是要用的数据
			HashMap<Integer,SteamGame> games = id.getGames();
			Iterator<Entry<Integer, SteamGame>> iter = games.entrySet().iterator();
			while (iter.hasNext()) {
				Entry<Integer,SteamGame> entry = iter.next();
				
				//key代表该用户拥有游戏的id
				Object key = entry.getKey();
				
				//测试输出当前游戏id
				System.out.println(key);
				
				//val代表该游戏的游戏信息，类型为SteamGame,可以用SteamGame的方法解析
				Object val = entry.getValue();
			}
			
			
		} catch (SteamCondenserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
