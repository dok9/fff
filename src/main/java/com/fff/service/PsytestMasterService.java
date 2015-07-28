package com.fff.service;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fff.command.PsytestMasterCommand;
import com.fff.dao.PsytestMasterDao;


@Service
public class PsytestMasterService {

	private static final Logger logger = LoggerFactory.getLogger(PsytestMasterService.class);
	
	@Autowired
	private SqlSession sqlSession;
	
	public void txwPsytestMasterPut(PsytestMasterCommand psytestMasterCommand) {
		
		PsytestMasterDao psytestMasterDao = sqlSession.getMapper(PsytestMasterDao.class);
		
		Map<String, String> arg = new LinkedHashMap<String, String>();
		
		arg.put("SUBPATH1", psytestMasterCommand.getSUBPATH1());
		arg.put("SUBPATH2", psytestMasterCommand.getSUBPATH2());
		arg.put("PASSWORD", psytestMasterCommand.getPASSWORD());
		arg.put("TITLE", psytestMasterCommand.getTITLE());
		arg.put("TYPE", psytestMasterCommand.getTYPE());
		
		logger.debug(arg.toString());
		
		if(psytestMasterDao.getExistCount(arg) == 0)
			psytestMasterDao.insertPSYTEST_MASTER(arg);
		else{
			
			
		}
	}
	
	
}
