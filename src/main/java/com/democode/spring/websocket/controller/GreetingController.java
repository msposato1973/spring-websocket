package com.democode.spring.websocket.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import com.democode.spring.websocket.pojo.Greeting;
import com.democode.spring.websocket.pojo.HelloMessage;

@Controller
public class GreetingController {
	
	 @MessageMapping("/addPerson")
	 @SendTo("/topic/greetings")
	 public Greeting greeting(HelloMessage message) throws Exception {
	    Thread.sleep(1000); // simulated delay
	 
	    return new Greeting("Welcome, " + HtmlUtils.htmlEscape( 
	    					getGreetings(message))
	    		   );
	 }

	 private String  getGreetings(HelloMessage message) {
		 return String.format(
	    		  " %1$s, %2$s !", 
	    		  message.getName(), 
	    		  message.getLastName()
	     );
	 }
}
