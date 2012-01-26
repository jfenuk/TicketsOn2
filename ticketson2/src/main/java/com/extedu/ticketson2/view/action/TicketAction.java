package com.extedu.ticketson2.view.action;

import com.extedu.ticketson2.model.entity.Ticket;
import com.extedu.ticketson2.service.TicketMgr;
import com.opensymphony.xwork2.ActionSupport;

public class TicketAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private TicketMgr ticketMgr;
	private Ticket ticket;

	public String execute() throws Exception {

		ticket = ticketMgr.get(1L);

		return SUCCESS;

	}

	public void setTicketMgr(TicketMgr ticketMgr) {
		this.ticketMgr = ticketMgr;
	}

	public Ticket getTicket() {
		return ticket;
	}
}