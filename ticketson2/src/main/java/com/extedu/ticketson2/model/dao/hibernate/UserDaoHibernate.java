package com.extedu.ticketson2.model.dao.hibernate;

import com.extedu.ticketson2.model.dao.UserDao;
import com.extedu.ticketson2.model.entity.User;

public class UserDaoHibernate implements UserDao{

	public User getUserById(final long id)
	{
		System.out.println("Get User by Id...");
		return new User();
	}
	public void saveUser(User user){
		System.out.println("User saved...");
		
	};
}
