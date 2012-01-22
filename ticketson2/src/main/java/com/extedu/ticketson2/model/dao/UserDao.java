package com.extedu.ticketson2.model.dao;

import java.util.List;

import com.extedu.ticketson2.model.entity.User;

public interface UserDao {

	public User getUserById(final long id);

	public List<User> getAll();

	public void saveUser(final User user);
}