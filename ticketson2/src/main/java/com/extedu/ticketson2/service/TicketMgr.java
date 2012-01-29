package com.extedu.ticketson2.service;

import com.extedu.ticketson2.model.entity.Ticket;
import java.util.List;

public interface TicketMgr extends EntityMgr<Ticket, Long> {

	List<Ticket> getAll();
}
