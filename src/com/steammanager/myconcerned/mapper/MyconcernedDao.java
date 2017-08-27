package com.steammanager.myconcerned.mapper;

import java.util.List;

import com.steammanager.myconcerned.entity.Myconcerned;

public interface MyconcernedDao {

	public List<Myconcerned> selectMyconcerned(int userid);
}
