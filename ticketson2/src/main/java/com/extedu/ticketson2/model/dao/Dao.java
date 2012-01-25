package com.extedu.ticketson2.model.dao;

import java.util.List;

import com.extedu.ticketson2.model.entity.Persistent;

public interface Dao<T extends Persistent> {

	public T get(long id);

	public void save(T persistent);

	public void remove(long id);

	public void remove(T persistent);

	public List<T> getAll();

}
