package com.extedu.ticketson2.service;

import com.extedu.ticketson2.model.entity.Ticket;

public interface TicketMgr {
	
	public Ticket getTicketById(final long id);
	public void saveTicket(Ticket ticket);

}
