package com.steammanager.login.mapper;

import org.springframework.stereotype.Repository;
import javax.annotation.Resource;

import com.steammanager.login.entity.Login;
import com.steammanager.login.mapper.LoginDao;


@Repository("userDao")
public class LoginDaoImpl implements LoginDao {
    //注解引用Mapper类资源
    @Resource(name = "loginMapper")
    private LoginMapper loginMapper;

    /* 根据用户名查找用户对象 */
    public Login findUserByName(String username) {
        //调用Mapper类从数据库中得到Login对象
        return loginMapper.getUserByName(username);
    }
    
    public void addNewUser(String username, String password){
    	loginMapper.createUser(username, password);
    }
}
