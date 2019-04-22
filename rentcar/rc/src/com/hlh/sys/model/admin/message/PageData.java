package com.hlh.sys.model.admin.message;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class PageData implements Serializable { 
	 
	private static final long serialVersionUID = 1734812665022708405L;
	
	@Getter
	@Setter
	private Integer id;
	@Getter
	@Setter
	private String sendUserName;
	@Getter
	@Setter
	private String receiveUserName;
	@Getter
	@Setter
	private Date preDate;
	@Getter
	@Setter
	private String status;
	@Getter
	@Setter
	private String content;
	@Getter
	@Setter
	private Integer type;

}
