package com.extedu.ticketson2.service;

import java.util.List;

import com.extedu.ticketson2.model.dao.TicketDao;
import com.extedu.ticketson2.model.entity.Ticket;

public class TicketMgrImpl implements TicketMgr {

	private TicketDao ticketDao;

	public void setTicketDao(TicketDao ticketDao) {
		this.ticketDao = ticketDao;
	}

	public Ticket getTicketById(final long id) {
		return ticketDao.getTicketById(id);
	}

	public List<Ticket> getAll() {
		return ticketDao.getAll();
	}

	public void saveTicket(Ticket ticket) {

		ticketDao.saveTicket(ticket);
	}

}
