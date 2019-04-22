package com.hlh.sys.model.admin.message;

import java.io.Serializable;
import java.util.List;

import com.hlh.sys.entity.TMessage;

import lombok.Data;

@Data
public class MessageData implements Serializable {

	private static final long serialVersionUID = -7640756395543383057L;
	
	private TMessage message;
	private List<Integer> receiveUsers;
	
}
