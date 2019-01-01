package com.example.sink;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class MessageSink {

	private final Logger logger = LoggerFactory.getLogger(MessageSink.class);

	@StreamListener(Processor.INPUT)
	public void handle(String message) {
		logger.info("Received: " + message);
	}
}
