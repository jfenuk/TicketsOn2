package com.extedu.ticketson2.service;

import com.extedu.ticketson2.model.dao.TicketDao;
import com.extedu.ticketson2.model.entity.Ticket;

public class TicketMgrImpl implements TicketMgr {

	private TicketDao ticketDao;

	public void setTicketDao(TicketDao ticketDao) {
		this.ticketDao = ticketDao;
	}
	
	public Ticket getTicketById(final long id)
	{
		System.out.println("TicketMgr: Get Ticket By Id...");
		return ticketDao.getTicketById(id);
	}

	public void saveTicket(Ticket ticket) {
		
		System.out.println("TicketMgr: Ticket Saved...");
		ticketDao.saveTicket(ticket);	}

}
