package com.democode.spring.websocket.pojo;

public class HelloMessage {

	private String name;
	private String lastName;

	public HelloMessage() {
	}

	public HelloMessage(String name) {
		this.name = name;
	}

	public HelloMessage(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}