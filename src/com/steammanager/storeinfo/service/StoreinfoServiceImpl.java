package com.steammanager.storeinfo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.steammanager.storeinfo.entity.Storeinfo;
import com.steammanager.storeinfo.mapper.StoreinfoDao;

@Service
public class StoreinfoServiceImpl implements StoreinfoService {

	@Resource(name ="storeDao")
	StoreinfoDao storeinfoDao;

	public List<Storeinfo> selectStoreinfo() {
		return storeinfoDao.selectStoreinfo();
	}

}
