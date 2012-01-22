package com.extedu.ticketson2.model.dao;

import com.extedu.ticketson2.model.entity.Ticket;

public interface TicketDao {
	
	public Ticket getTicketById(final long id);
	
	public void saveTicket(final Ticket ticket);

}
