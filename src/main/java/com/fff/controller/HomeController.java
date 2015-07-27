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

import com.fff.dao.TestDao;
import com.fff.service.TestService;
import com.fff.vo.TestVo;
import com.fff.vo.TestVo2;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private TestService testService;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);

		TestVo2 ccc = new TestVo2();
		List<TestVo> test = new ArrayList<TestVo>();
		Map<String, String>aaa = new LinkedHashMap<String, String>();
		
		Set<TestVo> bbb = new LinkedHashSet<TestVo>();
		testService.txrTest(test, aaa, bbb, ccc);
		//testService.txrTest();
	    
		model.addAttribute("serverTime", formattedDate );
		
		System.out.println(ccc.toString());
		System.out.println(aaa.toString());
		System.out.println(test.toString());
		System.out.println(bbb.toString());
		model.addAttribute("vo", ccc);
		
		return "home";
	}
	
}