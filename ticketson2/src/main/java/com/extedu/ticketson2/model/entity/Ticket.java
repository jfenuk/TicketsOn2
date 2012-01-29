package com.extedu.ticketson2.model.entity;

import java.io.Serializable;

public class Ticket extends PersistentImpl implements Serializable {

	private static final long serialVersionUID = 7177014660621405534L;

	private String title;
	private String description;

	public Ticket() {

	};

	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

}
