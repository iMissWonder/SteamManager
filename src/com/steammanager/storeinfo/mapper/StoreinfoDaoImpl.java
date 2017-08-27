package com.steammanager.storeinfo.mapper;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.steammanager.storeinfo.entity.Storeinfo;

@Repository("storeDao")
public class StoreinfoDaoImpl implements StoreinfoDao{

    @Resource
    private StoreinfoMapper storeinfoMapper;

	public List<Storeinfo> selectStoreinfo() {
		return storeinfoMapper.selectStoreinfo();
	}

}
