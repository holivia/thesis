package com.hlh.sys.dao; 

import com.github.abel533.mapper.Mapper;
import com.github.abel533.mapper.special.InsertUseGeneratedKeysMapper; 
import com.hlh.sys.entity.TFile;

public interface FileDao extends InsertUseGeneratedKeysMapper<TFile>, Mapper<TFile> {

	public TFile getWithoutContent(Integer id); 

	public int save(TFile t);

}
