package com.steammanager.storeinfo.mapper;

import java.util.List;

import com.steammanager.storeinfo.entity.Storeinfo;

public interface StoreinfoDao {

	public List<Storeinfo> selectStoreinfo();
}
