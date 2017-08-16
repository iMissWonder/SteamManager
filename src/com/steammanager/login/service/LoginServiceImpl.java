package com.steammanager.login.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.steammanager.login.entity.Login;
import com.steammanager.login.mapper.LoginDao;

@Service
public class LoginServiceImpl  implements LoginService{
	@Resource
	LoginDao userDao;
	
    public Login checkLogin(String username, String password) {
        //根据用户名实例化用户对象
        Login user = userDao.findUserByName(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
    
    public boolean checkRegister(String username, String password){
    	if(username != null){
			Login user = userDao.findUserByName(username);
			if (user == null){
				userDao.addNewUser(username, password);
				return true;
			}
    	}
    	return false;
    }

}
