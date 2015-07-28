package com.ant.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ant.service.TestService;
import com.ant.vo.TestVo1;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/test")
public class TestController {
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Inject
	TestService testService;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String get(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		testService.txrTest(model);
		//Date date = new Date();
		//DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		//String formattedDate = dateFormat.format(date);
		
		//model.addAttribute("qsData", qsData() );
		
		return "test";
	}
	@RequestMapping(method = RequestMethod.POST)
	public String post(Locale locale, Model model, TestVo1 testVo1) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		System.out.println("11111111");
		String checked[] = testVo1.getChecked();
		
		model.addAttribute("vo1", testVo1);
		
		for(String aaa : checked){
			System.out.println(aaa);
		}

		return "test";
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public String put(Locale locale, Model model, TestVo1 testVo1) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		System.out.println("putputput");
		String checked[] = testVo1.getChecked();
		
		model.addAttribute("vo1", testVo1);
		
		for(String aaa : checked){
			System.out.println(aaa);
		}
		
		return "test";
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public String delete(Locale locale, Model model, TestVo1 testVo1) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		String checked[] = testVo1.getChecked();
		String qsno[] = testVo1.getQsno();
		
		model.addAttribute("vo1", testVo1);
		
		for(String aaa : checked){
			System.out.println(aaa);
		}
		
		for(String aaa : qsno){
			System.out.println(aaa);
		}
		
		System.out.println("----------------"+testVo1.toString());
		return "test";
	}
	
	
	public List<Map<String, Object>> qsData(){
		
		List<Map<String, Object>> qsData = new LinkedList<Map<String, Object>>();
		
		for(int i=1; i<21; i++){
			
			Map<String, Object> tmpMap = new LinkedHashMap<String, Object>();
			tmpMap.put("qs", "문제"+ Integer.toString(i) + " 입니다. 잘풀어보세요. 라고 할줄 알았냐?ㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
			tmpMap.put("idx", Integer.toString(i));
			
			if(i%4 == 0)
				tmpMap.put("ans", "1,2");
			if(i%4 == 1)
				tmpMap.put("ans", "1");
			if(i%4 == 2)
				tmpMap.put("ans", "3");
			if(i%4 == 3)
				tmpMap.put("ans", "1,2,5");
			
			List<Map<String, String>> tmpList = new LinkedList<Map<String,String>>();
			
			for(int j=1; j<6; j++){
				Map<String, String> tmpMap2 = new LinkedHashMap<String, String>();
				tmpMap2.put("checked", Integer.toString(0));
				tmpMap2.put("idx", Integer.toString(j));
				tmpMap2.put("ex", Integer.toString(j)+". 보기 입니다.");
				tmpList.add(tmpMap2);
			}
			
			tmpMap.put("ex", tmpList);
			qsData.add(tmpMap);
		}
		
		return qsData;
		
	}
	
}
