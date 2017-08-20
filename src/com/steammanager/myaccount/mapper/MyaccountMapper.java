package com.steammanager.myaccount.mapper;
 
import org.apache.ibatis.annotations.Param;

public interface MyaccountMapper {
 
	public void updateSteamid(@Param("steamid")String newsteamid, @Param("user")int currentuser);

}