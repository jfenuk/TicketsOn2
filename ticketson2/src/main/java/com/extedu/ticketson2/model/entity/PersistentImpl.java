package com.extedu.ticketson2.model.entity;

public abstract class PersistentImpl {

	protected long id;

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	//TODO: implement methods: equals(), hashCode()
}
