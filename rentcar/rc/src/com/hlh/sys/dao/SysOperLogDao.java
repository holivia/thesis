package com.hlh.sys.dao;

import com.github.abel533.mapper.Mapper;
import com.github.abel533.mapper.special.InsertUseGeneratedKeysMapper; 
import com.hlh.sys.entity.SysOperLog;

public interface SysOperLogDao extends InsertUseGeneratedKeysMapper<SysOperLog>, Mapper<SysOperLog>  {

}
