package com.extedu.ticketson2.model.dao;

import java.util.List;

import com.extedu.ticketson2.model.entity.Ticket;

public interface TicketDao {
	
	public Ticket getTicketById(final long id);
	
	public List<Ticket> getAll();
	
	public void saveTicket(final Ticket ticket);

}
