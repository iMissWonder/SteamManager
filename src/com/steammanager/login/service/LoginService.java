package com.steammanager.login.service;

import com.steammanager.login.entity.Login;

public interface LoginService {

	public Login checkLogin(String username, String password);

    public boolean checkRegister(String username, String password,String steamid);
}
