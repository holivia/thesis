package com.hlh.sys.entity;

import java.util.Date;
 
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode; 
import lombok.ToString;

/**
 * 文件表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = TFile.TABLE_NAME)
@ToString(callSuper = false, includeFieldNames = true)
public class TFile extends BaseEntity {

	private static final long serialVersionUID = 5863606410526449415L;
	public static final String TABLE_NAME = "t_file";
 
	/** 文件名 */ 
	private String fileName;
	/** 大小（字节） */ 
	private Integer fileSize;
	/** MIME */ 
	private String contentType;
	/** 访问路径 */ 
	private String url;
	/** 上传时间 */ 
	private Date uploadTime;

}
