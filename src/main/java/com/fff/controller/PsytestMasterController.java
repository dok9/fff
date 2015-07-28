package com.fff.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fff.command.PsytestMasterCommand;
import com.fff.service.PsytestMasterService;
import com.fff.service.TestService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class PsytestMasterController {
	
	private static final Logger logger = LoggerFactory.getLogger(PsytestMasterController.class);
	
	@Autowired
	private PsytestMasterService psytestMasterService;

	@RequestMapping(value = "/psytest/master", method = RequestMethod.GET)
	public String PsytestMasterGet(Locale locale, Model model) {
		logger.info("/psytest/master -- GET");
		return "psytest/master";
	}
	
	@RequestMapping(value = "/psytest/master", method = RequestMethod.PUT)
	public String PsytestMasterPut(Locale locale, Model model, PsytestMasterCommand psytestMasterCommand) {
		logger.info("/psytest/master -- PUT");
		logger.info(psytestMasterCommand.toString());
		
		psytestMasterService.txwPsytestMasterPut(psytestMasterCommand);
		
		return "redirect:/psytest/write/"+psytestMasterCommand.getSUBPATH1()+"/"+psytestMasterCommand.getSUBPATH2();
	}
	
	@RequestMapping(value = "/psytest/master", method = RequestMethod.POST)
	public String PsytestMasterPost(Locale locale, Model model, PsytestMasterCommand psytestMasterCommand) {
		logger.info("/psytest/master -- POST");
		
		return "psytest/master";
	}
	
	@RequestMapping(value = "/psytest/master", method = RequestMethod.DELETE)
	public String PsytestMasterDelete(Locale locale, Model model, PsytestMasterCommand psytestMasterCommand) {
		logger.info("/psytest/master -- DELETE");
		
		return "redirect:main.do";
	}
	
}