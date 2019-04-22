package com.hlh.sys.dao; 

import com.github.abel533.mapper.Mapper;
import com.github.abel533.mapper.special.InsertUseGeneratedKeysMapper; 
import com.hlh.sys.entity.SysNotice; 
 
public interface SysNoticeDao extends InsertUseGeneratedKeysMapper<SysNotice>, Mapper<SysNotice> {
    public void save(SysNotice notice);

}





