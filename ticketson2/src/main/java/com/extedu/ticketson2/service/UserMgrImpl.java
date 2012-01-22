package com.extedu.ticketson2.service;

import com.extedu.ticketson2.model.dao.UserDao;
import com.extedu.ticketson2.model.entity.User;

public class UserMgrImpl implements UserMgr{

	UserDao userDao;
	
	public void setUserDao (UserDao userDao)
	{
		this.userDao = userDao;
	}
	
	public User getUserById (final long id)
	{
		System.out.println("UserMgr: Get User By Id...");
		return userDao.getUserById(id);
	}
	
	public void saveUser(User user){
		
		System.out.println("USerMgr: User saved...");
		userDao.saveUser(user);
	};
	
}
