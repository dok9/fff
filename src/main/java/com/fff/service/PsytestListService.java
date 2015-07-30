package com.fff.service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.fff.command.PsytestListCommand;
import com.fff.command.PsytestMasterCommand;
import com.fff.command.PsytestWriteCommand;
import com.fff.dao.PsytestListDao;
import com.fff.dao.PsytestMasterDao;
import com.fff.dao.PsytestWriteDao;


@Service
public class PsytestListService {

	private static final Logger logger = LoggerFactory.getLogger(PsytestListService.class);
	
	@Autowired
	private SqlSession sqlSession;
	
	public void txrPsytestListGet(Model model, Map<String, String> arg) {
		
		PsytestListDao psytestListDao = sqlSession.getMapper(PsytestListDao.class);
		
		PsytestListCommand result = psytestListDao.selectPSYTEST_QUESTION(arg);
		model.addAttribute("LIST", result);
		
	}
}
