package com.spring.model;

import java.util.Date;

public class Data {
	
	private String message;
	private String username;
	private int id;
	private Date date;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Data [message=" + message + ", username=" + username + ", id=" + id + ", date=" + date + "]";
	}
	

}
