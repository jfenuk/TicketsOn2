package com.extedu.ticketson2.service;

import java.util.List;

import com.extedu.ticketson2.model.entity.User;

public interface UserMgr extends EntityMgr<User,Long>{

	List<User> getAll();
}
