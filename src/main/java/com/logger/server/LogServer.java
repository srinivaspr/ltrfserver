package com.logger.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ltrf.LogMessage;

@Controller
public class LogServer {
	
	private static Logger logger = LoggerFactory.getLogger(LogServer.class);
	
	@RequestMapping("/savelogMessage")
	public void saveLogMessage(LogMessage message)
	{
		logger.info(message.getAppName());
		logger.info(message.getKey());
		logger.info(message.getMessage());
	}

}
