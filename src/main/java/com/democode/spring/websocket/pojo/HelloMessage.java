package com.democode.spring.websocket.pojo;

public class HelloMessage {
	
	public HelloMessage(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;

}
