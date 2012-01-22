package com.extedu.ticketson2.service;

import com.extedu.ticketson2.model.entity.User;

public interface UserMgr {

	public User getUserById(final long id);

	public void saveUser(User user);
}
