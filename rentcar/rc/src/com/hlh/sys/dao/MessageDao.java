package com.hlh.sys.dao; 

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.abel533.mapper.Mapper;
import com.github.abel533.mapper.special.InsertUseGeneratedKeysMapper;
import com.hlh.sys.entity.TMessage;
import com.hlh.sys.model.admin.message.PageData;

import pub.types.IdText;

public interface MessageDao extends InsertUseGeneratedKeysMapper<TMessage>, Mapper<TMessage> {
	
	public List<IdText> exceptMe(Integer id);
	
	public List<PageData> getAboutMe(@Param("tMessage") TMessage tMessage, @Param("sysUserId")Integer sysUserId);
	
	public List<Integer> getByBatchId(@Param("batchId") String batchId);
  
}
