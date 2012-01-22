package com.extedu.ticketson2.model.dao.hibernate;

import com.extedu.ticketson2.model.dao.TicketDao;
import com.extedu.ticketson2.model.entity.Ticket;

public class TicketDaoHibernate implements TicketDao {

	public Ticket getTicketById(final long id) {
		
		System.out.println("Get Ticket By Id...");
		
		return new Ticket();
		
	}
	public void saveTicket(Ticket ticket){
		
		System.out.println("Ticket saved...");
		
	}
}
