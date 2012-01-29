package com.extedu.ticketson2.model.dao.hibernate;

import java.util.List;

import com.extedu.ticketson2.model.dao.TicketDao;
import com.extedu.ticketson2.model.entity.Ticket;

public class TicketDaoHibernate extends GenericHibernateDao<Ticket, Long>
		implements TicketDao {

	public TicketDaoHibernate() {

		super(Ticket.class);
	}

	@SuppressWarnings("unchecked")
	public List<Ticket> getAll() {

		return getHibernateTemplate().find("from Ticket");
	};

}
