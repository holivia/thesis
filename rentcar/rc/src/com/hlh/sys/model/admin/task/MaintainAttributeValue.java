package com.hlh.sys.model.admin.task;

import java.io.Serializable;

import com.hlh.sys.entity.TMaintainAttribute;
import com.hlh.sys.entity.TMaintainAttributeVal;

import lombok.Getter;
import lombok.Setter;

public class MaintainAttributeValue implements Serializable {
 
	private static final long serialVersionUID = -1274896267085757915L;
	@Getter
	@Setter
	private TMaintainAttribute maintainAttribute;
	@Getter
	@Setter
	private TMaintainAttributeVal maintainAttributeVal;

}
