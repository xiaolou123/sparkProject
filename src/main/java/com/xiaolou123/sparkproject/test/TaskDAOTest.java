package com.xiaolou123.sparkproject.test;

import com.xiaolou123.sparkproject.dao.ITaskDAO;
import com.xiaolou123.sparkproject.dao.impl.DAOFactory;
import com.xiaolou123.sparkproject.domain.Task;


/**
 * 任务管理DAO测试类
 * @author Administrator
 *
 */
public class TaskDAOTest {
	
	public static void main(String[] args) {
		ITaskDAO taskDAO = DAOFactory.getTaskDAO();
		Task task = taskDAO.findById(1);
		System.out.println(task.getTaskName());  
	}
	
}
