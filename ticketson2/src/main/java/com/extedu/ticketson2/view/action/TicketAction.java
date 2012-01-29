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
	private Long id;
	private Ticket ticket;

	public Ticket getTicket() {
		return this.ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public List<Ticket> getTickets() {

		return this.tickets;
	}

	public void setTicketMgr(TicketMgr ticketMgr) {
		this.ticketMgr = ticketMgr;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	// Use Prepare Interseptor!

	public String list() throws Exception {

		tickets = ticketMgr.getAll();

		return Action.SUCCESS;

	}

	public String view() throws Exception {

		ticketMgr.get(id);
		return Action.SUCCESS;
	}

	public String edit(Ticket ticket) throws Exception{
		ticketMgr.save(ticket);
		return this.list();
	}

	public String remove() throws Exception {

		ticketMgr.remove(id);
		return this.list();
	}

	public String save() throws Exception {

		this.ticketMgr.save(this.ticket);
		return this.list();
	}

}