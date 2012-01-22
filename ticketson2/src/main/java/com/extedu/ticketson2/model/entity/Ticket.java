package com.extedu.ticketson2.model.entity;

import java.io.Serializable;

public class Ticket implements Serializable{

	private static final long serialVersionUID = 7177014660621405534L;

	private long id;
	private String title;
	private String description;

	public Ticket() {
	};

	public long getId() {
		return this.id;
	}

	public void setId(final long id) {
		this.id = id;
	}

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
	
	//TODO: toString();
	//TODO: equals();
}
