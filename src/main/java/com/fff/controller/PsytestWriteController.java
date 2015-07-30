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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fff.command.PsytestMasterCommand;
import com.fff.command.PsytestWriteCommand;
import com.fff.service.PsytestMasterService;
import com.fff.service.PsytestWriteService;
import com.fff.service.TestService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class PsytestWriteController {
	
	private static final Logger logger = LoggerFactory.getLogger(PsytestWriteController.class);
	
	@Autowired
	private PsytestWriteService psytestWriteService;

	@RequestMapping(value = "/psytest/write/{SUBPATH1}/{SUBPATH2}", method = RequestMethod.GET)
	public String PsytestMasterGet(Locale locale, Model model
			, @PathVariable(value="SUBPATH1") String sUBPATH1
			, @PathVariable(value="SUBPATH2") String sUBPATH2) {
		logger.info("/psytest/write -- GET");
		
		Map<String, String> arg = new LinkedHashMap<String, String>();
		
		arg.put("SUBPATH1", sUBPATH1);
		arg.put("SUBPATH2", sUBPATH2);
		
		
		psytestWriteService.txwPsytestWriteGet(model, arg);
		
		return "psytest/write";
	}
	
	@RequestMapping(value = "/psytest/write", method = RequestMethod.PUT)
	public String PsytestMasterPut(Locale locale, Model model, PsytestWriteCommand psytestWriteCommand) {
		logger.info("/psytest/write -- PUT");
		logger.info(psytestWriteCommand.toString());
		
		psytestWriteService.txwPsytestWritePut(model, psytestWriteCommand);
		// [SUBPATH1=한글된다, SUBPATH2=한글된다, TITLE=null, QUESTNO=1, QUESTAS=ㅇㄴㄹㄴㅇㄹ, QUESTTEXT=ㄴㄹㅇㄴㅇㄹ, QUESTDESC=ㄴㅇㄴㅇㄹㄴㄹㅇ, PASSWORD=sdfsfd, no=[1, 2], EXAMNO=[1, 2], EXAMAS=[ㄴㅇㄹㅇㄴㄹ, ㄴㅇㄹㄴㅇㄹ], EXAMTEXT=[ㄴㅇㄹㄴㄹ, ㄴㄹㄴㅇㄹㄴㄹ], EXAMDESC=[ㄴㅇㄹㄴㅇㄹ, ㄴㅇㄹㄴㅇㄹ], NOTE=[ㄴㅇㄹㄴㅇㄹ, ㄴㅇㄹㄴㅇㄹ]]
		//SUBPATH1, SUBPATH2, QUESTNO, QUESTAS, QUESTTEXT, QUESTDESC, QUESTPOINT, QUESTTYPE, QUESTIMG
		return "psytest/write";
	}
	
	@RequestMapping(value = "/psytest/write", method = RequestMethod.POST)
	public String PsytestMasterPost(Locale locale, Model model, PsytestMasterCommand psytestMasterCommand) {
		logger.info("/psytest/write -- POST");
		
		return "psytest/master";
	}
	
	@RequestMapping(value = "/psytest/write", method = RequestMethod.DELETE)
	public String PsytestMasterDelete(Locale locale, Model model, PsytestMasterCommand psytestMasterCommand) {
		logger.info("/psytest/write -- DELETE");
		
		return "redirect:main.do";
	}
	
}