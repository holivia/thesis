package com.hlh.sys.dao;

import java.util.List;

import com.github.abel533.mapper.Mapper;
import com.github.abel533.mapper.special.InsertUseGeneratedKeysMapper; 
import com.hlh.sys.entity.TProject;

import pub.types.IdText;

public interface ProjectDao extends InsertUseGeneratedKeysMapper<TProject>, Mapper<TProject> {

	public List<IdText> getAll();

}
