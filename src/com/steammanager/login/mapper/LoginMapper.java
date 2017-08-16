package com.steammanager.login.mapper;
 
import org.apache.ibatis.annotations.Param;

import com.steammanager.login.entity.Login;
 
public interface LoginMapper {
 
	public Login getUserByName(String username); 

	public void createUser(@Param("name")String username,@Param("pwd")String password);
}