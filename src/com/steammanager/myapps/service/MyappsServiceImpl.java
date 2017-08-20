package com.steammanager.myapps.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.steammanager.myapps.mapper.MyappsDao;


@Service
public class MyappsServiceImpl implements MyappsService {

	@Resource(name ="appsDao")
    private MyappsDao myappsDao;
	
	public void insertFollow(int userid, int appid){
		myappsDao.insertFollow(userid, appid);
	}
}
