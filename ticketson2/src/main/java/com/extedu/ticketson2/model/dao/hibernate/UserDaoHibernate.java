package com.extedu.ticketson2.model.dao.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.extedu.ticketson2.model.dao.UserDao;
import com.extedu.ticketson2.model.entity.User;

public class UserDaoHibernate extends HibernateDaoSupport implements UserDao {

	public User getUserById(final long id) {
		return (User) getHibernateTemplate().get(User.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<User> getAll() {
		return getHibernateTemplate().find("from User");
	}

	public void saveUser(User user) {

		getHibernateTemplate().saveOrUpdate(user);

	};
}
