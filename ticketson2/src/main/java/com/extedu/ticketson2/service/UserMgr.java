package com.extedu.ticketson2.service;

import com.extedu.ticketson2.model.entity.User;

public interface UserMgr {

	public User get(final Long id);

	public void save(User user);

	public void remove(Long id);

	public void remove(User user);
}
