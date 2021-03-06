package com.extedu.ticketson2.model.dao.hibernate;

import java.util.List;

import com.extedu.ticketson2.model.dao.UserDao;
import com.extedu.ticketson2.model.entity.User;

public class UserDaoHibernate extends GenericHibernateDao<User, Long> implements
		UserDao {

	public UserDaoHibernate() {

		super(User.class);
	}

	@SuppressWarnings("unchecked")
	public List<User> getAll() {

		return getHibernateTemplate().find("from User");
	}

}
