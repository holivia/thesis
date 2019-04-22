package com.hlh.sys.entity;

import java.util.Date;

import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode; 
import lombok.ToString;

/**
 * 保养记录表
 * 
 * @author lu
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = TMaintainTask.TABLE_NAME)
@ToString(callSuper = false, includeFieldNames = true)
public class TMaintainTask extends BaseEntity {

	private static final long serialVersionUID = -3965544634052257644L;
	public static final String TABLE_NAME = "t_maintain_task";
	public static final String FIELD_STATUS = "status";

	/**
	 * 任务名称
	 */
	private String name;
	/**
	 * 设备id
	 */
	private Integer deviceId;
	/**
	 * 记录时间
	 */
	private Date recordTime;
	/**
	 * 记录人id
	 */
	private Integer recordUserId;
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
	/**
	 * 删除标记 0否1是
	 */
	private Integer delFlag = 0;
	/**
	 * 经度
	 */
	private String gpsX;
	/**
	 * 纬度
	 */
	private String gpsY;
	/**
	 * 项目id
	 */
	private Integer projectId;
	/**
	 * 状态 0待完成 1已完成 -1已取消
	 */
	private Integer status;
	/**
	 * 任务开始时间
	 */
	private Date sdate;
	/**
	 * 任务结束时间
	 */
	private Date edate;
	/**
	 * 是否告警
	 */
	private Integer isError = 0;

}
