package com.democode.spring.websocket.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import com.democode.spring.websocket.pojo.Greeting;
import com.democode.spring.websocket.pojo.HelloMessage;

@Controller
public class GreetingController {
	
	@MessageMapping("")
	public Greeting greet(HelloMessage messege) {
		return new Greeting("Messege, " + HtmlUtils.htmlEscape(messege.getName()) + "!");
	}

}
