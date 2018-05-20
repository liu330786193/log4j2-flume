package com.lyl.log4j2flume;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Log4j2FlumeApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(Log4j2FlumeApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Log4j2FlumeApplication.class, args);
	}

	@GetMapping("/test/flume")
	public int testFlume(){
		LOGGER.info("111");
		LOGGER.info("12314");
		return 1;
	}
}
