package com.extedu.ticketson2.service;

import java.util.List;

import com.extedu.ticketson2.model.dao.TicketDao;
import com.extedu.ticketson2.model.entity.Ticket;

public class TicketMgrImpl implements TicketMgr {

	private TicketDao ticketDao;

	public void setTicketDao(TicketDao ticketDao) {
		this.ticketDao = ticketDao;
	}

	public Ticket get(Long id) {

		return ticketDao.get(id);
	}

	public void save(Ticket ticket) {

		ticketDao.save(ticket);

	}

	public void remove(Long id) {
		ticketDao.remove(id);

	}

	public void remove(Ticket ticket) {

		ticketDao.remove(ticket);

	}

	public List<Ticket> getAll() {
		return ticketDao.getAll();
	}

}
