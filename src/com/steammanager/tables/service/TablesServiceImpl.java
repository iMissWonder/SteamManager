package com.steammanager.tables.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.steammanager.tables.mapper.TablesMapper;
import com.steammanager.tables.pojo.Tables;

@Service
public class TablesServiceImpl  implements TablesService{
	@Autowired
	TablesMapper tablesMapper;
	
	
	public List<Tables> list(){
		return tablesMapper.list();
	};

}
