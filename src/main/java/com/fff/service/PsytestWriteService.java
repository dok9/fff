package com.fff.service;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.fff.command.PsytestMasterCommand;
import com.fff.dao.PsytestMasterDao;
import com.fff.dao.PsytestWriteDao;


@Service
public class PsytestWriteService {

	private static final Logger logger = LoggerFactory.getLogger(PsytestWriteService.class);
	
	@Autowired
	private SqlSession sqlSession;
	
	public void txwPsytestWriteGet(Model model, Map<String, String> arg) {
		
		PsytestWriteDao psytestWriteDao = sqlSession.getMapper(PsytestWriteDao.class);
		
		PsytestMasterCommand result = psytestWriteDao.selectPSYTEST_MASTER(arg);
		model.addAttribute("LIST", result);
		
	}
	
	
}
