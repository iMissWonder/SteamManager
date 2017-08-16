package com.steammanager.login.mapper;

import com.steammanager.login.entity.Login;

public interface LoginDao {
    //接口方法，通过用户名得到User对象
    public Login findUserByName(String username);

    public void addNewUser(String username, String password);
}
