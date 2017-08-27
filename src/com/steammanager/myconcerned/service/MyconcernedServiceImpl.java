package com.steammanager.myconcerned.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.steammanager.myconcerned.entity.Myconcerned;
import com.steammanager.myconcerned.mapper.MyconcernedDao;

@Service
public class MyconcernedServiceImpl implements MyconcernedService {
	
	@Resource(name="concernedDao")
	MyconcernedDao myconcernedDao;

	public List<Myconcerned> selectMyconcerned(int userid) {
		return myconcernedDao.selectMyconcerned(userid);
	}

}
