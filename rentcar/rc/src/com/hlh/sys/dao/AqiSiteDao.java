package com.hlh.sys.dao;

import java.util.List;
import java.util.Map;

import com.github.abel533.mapper.Mapper;
import com.github.abel533.mapper.special.InsertUseGeneratedKeysMapper;
import com.hlh.sys.entity.TAqiSite;

public interface AqiSiteDao extends InsertUseGeneratedKeysMapper<TAqiSite>, Mapper<TAqiSite>  {
	
	public List<Map<String,Object>> detail(String cityName);	//某城市各地区监测站空气质量查询

}
