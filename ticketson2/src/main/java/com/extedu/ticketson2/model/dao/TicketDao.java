package com.extedu.ticketson2.model.dao;

import java.util.List;

import com.extedu.ticketson2.model.entity.Ticket;

public interface TicketDao extends GenericDao<Ticket, Long> {

	List<Ticket> getAll();

}
