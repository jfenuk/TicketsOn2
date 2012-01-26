package com.extedu.ticketson2.model.dao;

import java.io.Serializable;

import com.extedu.ticketson2.model.entity.Persistent;

public interface GenericDao<T extends Persistent, ID extends Serializable> {

	public T get(ID id);

	public void save(T persistent);

	public void remove(ID id);

	public void remove(T persistent);

}
