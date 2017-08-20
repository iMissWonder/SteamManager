package com.steammanager.myapps.mapper;

import org.springframework.stereotype.Repository;
import javax.annotation.Resource;

@Repository("appsDao")
public class MyappsDaoImpl implements MyappsDao{

    //注解引用Mapper类资源
    @Resource(name = "myappsMapper")
    private MyappsMapper myappMapper;

	public void insertFollow(int userid, int appid){
		myappMapper.insertFollow(userid, appid);
	}
}
