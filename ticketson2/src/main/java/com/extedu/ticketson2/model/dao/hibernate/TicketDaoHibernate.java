package com.extedu.ticketson2.model.dao.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.extedu.ticketson2.model.dao.Dao;
import com.extedu.ticketson2.model.entity.Ticket;

public class TicketDaoHibernate extends HibernateDaoSupport implements
		Dao<Ticket> {

	public Ticket get(long id) {

		return getHibernateTemplate().get(Ticket.class, id);

	}

	public void save(Ticket ticket) {
		getHibernateTemplate().save(ticket);
	}

	public void remove(long id) {

		getHibernateTemplate().delete(entity)
		getHibernateTemplate().get(Ticket.class, id);
	}

	public List<Ticket> getAll() {

		return getHibernateTemplate().find("from Ticket");
	};

	public void saveTicket(Ticket ticket) {

		getHibernateTemplate().saveOrUpdate(ticket);

	}
}
