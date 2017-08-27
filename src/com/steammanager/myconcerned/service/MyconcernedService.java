package com.steammanager.myconcerned.service;

import java.util.List;

import com.steammanager.myconcerned.entity.Myconcerned;

public interface MyconcernedService {

	public List<Myconcerned> selectMyconcerned(int userid);
}
