package com.steammanager.myaccount.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.steammanager.myaccount.mapper.MyaccountDao;


@Service
public class MyaccountServiceImpl implements MyaccountService {

	@Resource(name ="accountDao")
    private MyaccountDao myaccountDao;
	
	public void updateSteamid(String newsteamid, int currentuser){
		myaccountDao.updateSteamid(newsteamid, currentuser);
	}
}
