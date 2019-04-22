package com.hlh.sys.entity;

import java.util.Date;
 
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode; 
import lombok.ToString;

/**
 * 保养参数表
 * 
 * @author lu
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = TMaintainAttribute.TABLE_NAME)
@ToString(callSuper = false, includeFieldNames = true)
public class TMaintainAttribute extends BaseEntity {

	private static final long serialVersionUID = -4315527931379077776L;
	public static final String TABLE_NAME = "t_maintain_attribute";
	public static final String FIELD_TYPE = "type";
 
	/**
	 * 创建时间
	 */ 
	private Date createTime;
	/**
	 * 修改时间
	 */ 
	private Date updateTime;
	/**
	 * 参数名称
	 */ 
	private String name;
	/**
	 * 说明
	 */ 
	private String remark;
	/**
	 * 起始值
	 */ 
	private double normalStartVal;
	/**
	 * 终止值
	 */ 
	private double normalEndVal;
	/**
	 * 参数类型 0数值类型 1文本类型 2单选类型
	 */ 
	private Integer type;

}
