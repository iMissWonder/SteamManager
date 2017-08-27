package com.steammanager.myconcerned.mapper;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.steammanager.myconcerned.entity.Myconcerned;

@Repository("concernedDao")
public class MyconcernedDaoImpl implements MyconcernedDao {
	
	@Resource(name = "myconcernedMapper")
	MyconcernedMapper myconcernedMapper;

	public List<Myconcerned> selectMyconcerned(int userid) {
		return myconcernedMapper.selectMyconcerned(userid);
	}

}
