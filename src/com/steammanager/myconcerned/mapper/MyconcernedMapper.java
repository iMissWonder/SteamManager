package com.steammanager.myconcerned.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.steammanager.myconcerned.entity.Myconcerned;

public interface MyconcernedMapper {

	public List<Myconcerned> selectMyconcerned(@Param("userid")int userid);
}