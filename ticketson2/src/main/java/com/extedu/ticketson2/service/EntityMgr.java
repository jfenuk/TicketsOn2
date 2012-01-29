package com.extedu.ticketson2.service;

import com.extedu.ticketson2.model.entity.Persistent;

public interface EntityMgr<T extends Persistent, ID> {

	T get(ID id);

	void save(T persistent);

	void remove(ID id);

	void remove(T persistent);

}
