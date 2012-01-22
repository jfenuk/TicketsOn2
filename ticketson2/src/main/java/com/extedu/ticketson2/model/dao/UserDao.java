package com.extedu.ticketson2.model.dao;

import com.extedu.ticketson2.model.entity.User;

public interface UserDao {

	public User getUserByID (final long id);

	public void saveUser (final User user);
}