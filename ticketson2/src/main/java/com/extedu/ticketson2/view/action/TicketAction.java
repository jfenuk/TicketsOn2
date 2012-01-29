package com.extedu.ticketson2.view.action;

import java.util.List;

import com.extedu.ticketson2.model.entity.Ticket;
import com.extedu.ticketson2.service.TicketMgr;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class TicketAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private TicketMgr ticketMgr;
	private List<Ticket> tickets;

	public String execute() throws Exception {

		this.tickets = ticketMgr.getAll();

		return Action.SUCCESS;

	}

	public List<Ticket> getTickets() {

		return this.tickets;
	}

	public void setTicketMgr(TicketMgr ticketMgr) {
		this.ticketMgr = ticketMgr;
	}

}