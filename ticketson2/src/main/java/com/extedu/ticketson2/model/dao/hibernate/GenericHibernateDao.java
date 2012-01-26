package com.extedu.ticketson2.model.dao.hibernate;

import java.io.Serializable;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.extedu.ticketson2.model.dao.GenericDao;
import com.extedu.ticketson2.model.entity.Persistent;

public class GenericHibernateDao<T extends Persistent, ID extends Serializable> extends
		HibernateDaoSupport implements GenericDao<T, ID> {

	private Class<T> persistentClass;

	public GenericHibernateDao(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}

	public Class<T> getPersistentClass() {
		return this.persistentClass;
	}

	public T get(ID id) {

		return getHibernateTemplate().get(getPersistentClass(), id);
	}

	public void save(T persistent) {

		getHibernateTemplate().saveOrUpdate(persistent);
	}

	public void remove(ID id) {

		getHibernateTemplate().delete(get(id));

	}

	public void remove(T persistent) {

		getHibernateTemplate().delete(persistent);

	}

}
