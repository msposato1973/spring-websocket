package com.democode.spring.websocket.pojo;

public class Greeting {

	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Greeting(String content) {
		super();
		this.content = content;
	}


}
