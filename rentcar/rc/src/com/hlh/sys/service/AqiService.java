package com.hlh.sys.service; 

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import com.hlh.sys.dao.AqiDao;
import com.hlh.sys.entity.TAqi;

@Service("aqiService")
@Transactional(readOnly = true)
public class AqiService {

	@Autowired
	private AqiDao aqiDao; 

	public TAqi get(Integer id) {
		return aqiDao.selectByPrimaryKey(id);
	}

	@Transactional
	public void save(TAqi t) {
		if (t.getId() != null) { 
			aqiDao.updateByPrimaryKey(t);
		} else {
			aqiDao.insertUseGeneratedKeys(t); 
		}
	}
	
	public TAqi getLatestByAreaId(Integer areaId) {
		return aqiDao.getLatestByAreaId(areaId);
	}
	
	public List<Map<String,Integer>> findAqi() {	//查询全国空气质量指数
		return aqiDao.queryCityAqi();
	}
	
	public List<Map<String,Integer>> findBest(Integer rankSize) {	//查询最佳前三
		return aqiDao.queryBest(rankSize);
	}
	
	public List<Map<String,Integer>> findWorst(Integer rankSize) {	//查询最差前三
		return aqiDao.queryWorst(rankSize);
	}
	public TAqi getAqiByCityName(String cityName) {	//查询某城市空气质量aqi
		return aqiDao.getByCityName(cityName); 
	}
 
}
