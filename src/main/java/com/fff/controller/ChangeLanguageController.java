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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.LocaleResolver;

import com.fff.dao.TestDao;
import com.fff.service.TestService;
import com.fff.vo.TestVo;
import com.fff.vo.TestVo2;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ChangeLanguageController {
	
	private static final Logger logger = LoggerFactory.getLogger(ChangeLanguageController.class);
	
	@Autowired
	private MessageSource msg;
	
	@Autowired
	private LocaleResolver localeResolver;
	
	@RequestMapping(value = "/lang", method = RequestMethod.GET)
	public String home(@RequestParam(value="lang", required=false) String lang, Locale locale, Model model, HttpServletRequest request, HttpServletResponse response) {
		
		String leng2 = "";
		
		if(lang.toLowerCase().equals("ko")) 
			leng2 = "ko";
		else if(lang.toLowerCase().equals("en")) 
			leng2 = "en";
		else 
			leng2 = "en";
		
		Locale locale2 = new Locale(leng2);
		
		localeResolver.setLocale(request, response, locale2);
		
		logger.info("locale {} -> {}", locale, locale2);
		
		return "redirect:/";
	}
	
}