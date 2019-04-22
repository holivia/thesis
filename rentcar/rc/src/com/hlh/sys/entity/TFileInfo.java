package com.hlh.sys.entity;

import java.util.Date;

import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;
import lombok.EqualsAndHashCode; 
import lombok.ToString;

/**
 * 文件信息表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = TFileInfo.TABLE_NAME)
@ToString(callSuper = false, includeFieldNames = true)
public class TFileInfo extends BaseEntity {

	private static final long serialVersionUID = -2182283608524250395L;
	public static final String TABLE_NAME = "t_file_info";
 
	/** 对应的业务实体的表名 */ 
	private String tableName;
	/** 对应的业务实体的id */ 
	private Integer referenceId;
	/** 文件类型 */ 
	private Integer type;
	/** 文件ID */ 
	private Integer fileId;
	/** 名称 */ 
	private String name;
 
	private Date createTime;
 
	private Date updateTime;
	/**
	 * 图片路径
	 */
	@Transient 
	private String url;
}
