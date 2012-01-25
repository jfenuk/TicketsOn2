package com.extedu.ticketson2.model.entity;

import java.io.Serializable;

public class User extends PersistentImpl implements Persistent, Serializable {

	private static final long serialVersionUID = 7177014660621405534L;

	private String login;
	private String password;

	public User() {
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}