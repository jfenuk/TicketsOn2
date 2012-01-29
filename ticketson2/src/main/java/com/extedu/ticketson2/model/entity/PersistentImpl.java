package com.extedu.ticketson2.model.entity;

public abstract class PersistentImpl implements Persistent{

	private Long id;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	//TODO: implement methods: equals(), hashCode()
}
