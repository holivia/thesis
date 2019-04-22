package com.hlh.sys.entity;

import java.util.Date;

import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode; 
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = TMaintainAttributeVal.TABLE_NAME)
@ToString(callSuper = false, includeFieldNames = true)
public class TMaintainAttributeVal extends BaseEntity {

	private static final long serialVersionUID = -284467829205683395L;
	public static final String TABLE_NAME = "t_maintain_attribute_val";

	/**
	 * 设备id
	 */
	private Integer deviceId;
	/**
	 * 保养记录id
	 */
	private Integer taskId;
	/**
	 * 类型
	 */
	private Integer type;
	/**
	 * 属性文本内容
	 */
	private String attributeTxt;
	/**
	 * 属性数值内容
	 */
	private double attributeNum;
	/**
	 * 属性单选值 0/1
	 */
	private Integer state;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	/**
	 * 说明
	 */
	private String remark;

}
