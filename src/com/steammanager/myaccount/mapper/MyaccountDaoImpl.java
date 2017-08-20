package com.steammanager.myaccount.mapper;

import org.springframework.stereotype.Repository;
import javax.annotation.Resource;

@Repository("accountDao")
public class MyaccountDaoImpl implements MyaccountDao {
	
    //注解引用Mapper类资源
    @Resource(name = "myaccountMapper")
    private MyaccountMapper myaccountMapper;
    
    
	public void updateSteamid(String newsteamid,int currentuser){
		myaccountMapper.updateSteamid(newsteamid, currentuser);
	}
	
}
