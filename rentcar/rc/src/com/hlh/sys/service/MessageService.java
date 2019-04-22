package com.hlh.sys.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.hlh.sys.dao.MessageDao;
import com.hlh.sys.entity.TMessage;
import com.hlh.sys.model.admin.message.MessageData;
import com.hlh.sys.model.admin.message.PageData;
import com.hlh.util.OperLogUtils;

import pub.types.IdText;

@Service("messageService")
@Transactional(readOnly = true)
public class MessageService {

	@Autowired
	private MessageDao messageDao;
	@Autowired
	private OperLogUtils operLogUtils;

	public TMessage get(Integer id) {
		return messageDao.selectByPrimaryKey(id);
	}

	public List<IdText> selectAllUser(Integer id) { // 查询所有用户
		return messageDao.exceptMe(id);
	}

	public List<Integer> getMessageByBatchId(String batchId) { // 根据batchId(uuid)查询信息
		return messageDao.getByBatchId(batchId);
	}

	@Transactional
	public void save(Integer sysUserId, TMessage t) {
		if (t.getId() != null) {
			operLogUtils.updateLog(sysUserId, messageDao.selectByPrimaryKey(t.getId()), t);
			messageDao.updateByPrimaryKey(t);
		} else {
			messageDao.insertUseGeneratedKeys(t);
			operLogUtils.insertLog(sysUserId, t);
		}
	}

	@Transactional
	public void save(Integer sysUserId, MessageData m) {
		if (m.getMessage().getId() != null) { // 预览（修改状态）
			if (m.getMessage().getStatus() == 0 && sysUserId == m.getMessage().getReceiveUserId()) {
				m.getMessage().setStatus(1);
			}
			operLogUtils.updateLog(sysUserId, messageDao.selectByPrimaryKey(m.getMessage().getId()), m.getMessage());
			messageDao.updateByPrimaryKey(m.getMessage());
		} else {
			for (int i = 0; i < m.getReceiveUsers().size(); i++) {
				m.getMessage().setReceiveUserId(m.getReceiveUsers().get(i));
				m.getMessage().setStatus(0);
				m.getMessage().setPreDate(new Date());
				messageDao.insertUseGeneratedKeys(m.getMessage());
				operLogUtils.insertLog(sysUserId, m.getMessage());
			}
		}
	}

	public List<PageData> query(TMessage t, Integer page, Integer limit, Integer id) {
		PageHelper.startPage(page, limit);
		return messageDao.getAboutMe(t, id);
	}

}
