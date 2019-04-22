package com.hlh.sys.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.github.abel533.mapper.Mapper;
import com.github.abel533.mapper.special.InsertUseGeneratedKeysMapper;
import com.hlh.sys.entity.TAqi;

public interface AqiDao extends InsertUseGeneratedKeysMapper<TAqi>, Mapper<TAqi>  {

	public TAqi getLatestByAreaId(@Param("areaId") Integer areaId);
	
	public List<Map<String,Integer>> queryCityAqi();	//全国空气质量指数查询
	
	public List<Map<String,Integer>> queryBest(Integer rankSize);	//全国空气质量最差前n
	
	public List<Map<String,Integer>> queryWorst(Integer rankSize);	//全国空气质量最佳前n
	
	public TAqi getByCityName(String cityName);	//某城市空气质量aqi
}
