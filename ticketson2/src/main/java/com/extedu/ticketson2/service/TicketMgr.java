package com.extedu.ticketson2.service;

import com.extedu.ticketson2.model.entity.Ticket;

public interface TicketMgr {

	public Ticket get(final Long id);

	public void save(Ticket ticket);

	public void remove(Long id);

	public void remove(Ticket ticket);

}
