package com.extedu.ticketson2.model.dao.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.extedu.ticketson2.model.dao.TicketDao;
import com.extedu.ticketson2.model.entity.Ticket;

public class TicketDaoHibernate extends HibernateDaoSupport implements
		TicketDao {

	public Ticket getTicketById(final long id) {

		return (Ticket) getHibernateTemplate().get(Ticket.class, id);

	}

	@SuppressWarnings("unchecked")
	public List<Ticket> getAll() {
		
		return getHibernateTemplate().find("from Ticket");
	};

	public void saveTicket(Ticket ticket) {

		getHibernateTemplate().saveOrUpdate(ticket);

	}
}
