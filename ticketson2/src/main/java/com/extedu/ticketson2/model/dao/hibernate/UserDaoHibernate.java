package com.extedu.ticketson2.model.dao.hibernate;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.extedu.ticketson2.model.dao.Dao;
import com.extedu.ticketson2.model.entity.User;

public class UserDaoHibernate extends HibernateDaoSupport implements Dao<User> {

	public User get(long id) {
		return getHibernateTemplate().get(User.class, id);
	}

	public void save(User user) {
		getHibernateTemplate().save(user);

	}

	public void remove(long id) {
		getHibernateTemplate().delete(
				getHibernateTemplate().get(User.class, id));
	}

	public void remove(User persistent) {
		getHibernateTemplate().delete(persistent);
	}

	@SuppressWarnings("unchecked")
	public List<User> getAll() {
		return getHibernateTemplate().find("from Ticket");
	}

}
