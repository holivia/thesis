package com.hlh.sys.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hlh.sys.dao.AqiSiteDao;
import com.hlh.sys.entity.TAqiSite;

@Service("aqiSiteService")
@Transactional(readOnly = true)
public class AqiSiteService {

	@Autowired
	private AqiSiteDao aqiSiteDao;

	public TAqiSite get(Integer id) {
		return aqiSiteDao.selectByPrimaryKey(id);
	}

	@Transactional
	public void save(TAqiSite t) {
		if (t.getId() != null) {
			aqiSiteDao.updateByPrimaryKey(t);
		} else {
			aqiSiteDao.insertUseGeneratedKeys(t);
		}
	}
	
	public List<Map<String,Object>> findByCityName(String cityName) {	//某城市各地区监测站空气质量查询
		return aqiSiteDao.detail(cityName);
	}

}
