package com.extedu.ticketson2.model.dao;

import java.io.Serializable;

import com.extedu.ticketson2.model.entity.Persistent;

public interface GenericDao<T extends Persistent, ID extends Serializable> {

	T get(ID id);

	void save(T persistent);

	void remove(ID id);

	void remove(T persistent);

}
