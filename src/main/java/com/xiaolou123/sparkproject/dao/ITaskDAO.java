package com.xiaolou123.sparkproject.dao;

import com.xiaolou123.sparkproject.domain.Task;

/**
 * 任务管理DAO接口
 * @author Administrator
 *
 */
public interface ITaskDAO {
	
	/**
	 * 根据主键查询任务
	 * @param taskid 主键
	 * @return 任务
	 */
	Task findById(long taskid);
	
}
