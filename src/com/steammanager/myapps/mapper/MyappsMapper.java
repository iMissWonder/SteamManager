package com.steammanager.myapps.mapper;

import org.apache.ibatis.annotations.Param;

public interface MyappsMapper {
	
	public void insertFollow(@Param("userid")int userid, @Param("appid")int appid);

}
