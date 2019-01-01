package com.example.source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@Autowired
	private MessageProducer messageProducer;

	@PostMapping("/message")
	public String send(@RequestBody String message) {
		messageProducer.send(message);
		return message;
	}

}
