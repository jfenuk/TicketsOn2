package com.extedu.ticketson2.model.dao;

import java.util.List;

import com.extedu.ticketson2.model.entity.User;

public interface UserDao extends GenericDao<User, Long> {

	List<User> getAll();
}
