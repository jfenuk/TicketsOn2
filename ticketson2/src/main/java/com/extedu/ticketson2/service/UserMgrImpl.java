package com.extedu.ticketson2.service;

import java.util.List;

import com.extedu.ticketson2.model.dao.UserDao;
import com.extedu.ticketson2.model.entity.User;

public class UserMgrImpl implements UserMgr {

	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;

	}

	public User get(Long id) {
		return userDao.get(id);

	}

	public void save(User user) {
		userDao.save(user);

	}

	public void remove(Long id) {
		userDao.remove(id);
	}

	public void remove(User user) {
		userDao.remove(user);
	}

	public List<User> getAll() {
		return userDao.getAll();
	}

}
