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

import com.fff.command.PsytestMasterCommand;
import com.fff.command.PsytestWriteCommand;
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
	
	
	public void txwPsytestWritePut(Model model, PsytestWriteCommand psytestWriteCommand) {
		
		PsytestWriteDao psytestWriteDao = sqlSession.getMapper(PsytestWriteDao.class);
		
		Map<String, String> arg = new HashMap<String, String>();
		arg.put("SUBPATH1", psytestWriteCommand.getSUBPATH1());
		arg.put("SUBPATH2", psytestWriteCommand.getSUBPATH2());
		arg.put("QUESTNO", psytestWriteCommand.getQUESTNO());
		arg.put("QUESTAS", psytestWriteCommand.getQUESTAS());
		arg.put("QUESTTEXT", psytestWriteCommand.getQUESTTEXT());
		arg.put("QUESTDESC", psytestWriteCommand.getQUESTDESC());
		
		psytestWriteDao.getExistCntPSYTEST_MASTER(arg);
		int QUESTNO = psytestWriteDao.insertPSYTEST_QUESTION(arg);
		System.out.println("-------------------------------------------"+QUESTNO);
		System.out.println("222-------------------------------------------"+arg.toString());
		
		//(SUBPATH1, SUBPATH2, QUESTNO, EXAMNO, EXAMAS, EXAMTEXT, EXAMDESC, EXAMTYPE, EXAMIMG)
		String[] aaa = psytestWriteCommand.getNo();
		System.out.println("222-------------------------------------------"+aaa);
		
		for(int i=0; i<(psytestWriteCommand.getNo()==null?0:psytestWriteCommand.getNo().length); i++){
			
			arg.put("EXAMAS",psytestWriteCommand.getEXAMAS()[i]);
			arg.put("EXAMTEXT",psytestWriteCommand.getEXAMTEXT()[i]);
			arg.put("EXAMDESC",psytestWriteCommand.getEXAMDESC()[i]);
			arg.put("NOTE",psytestWriteCommand.getNOTE()[i]);
			
			psytestWriteDao.insertPSYTEST_EXAMPLE(arg);
			psytestWriteDao.insertPSYTEST_NOTE(arg);
			
		}
		// [SUBPATH1=한글된다, SUBPATH2=한글된다, TITLE=null, 
		//QUESTNO=1, QUESTAS=ㅇㄴㄹㄴㅇㄹ, QUESTTEXT=ㄴㄹㅇㄴㅇㄹ, QUESTDESC=ㄴㅇㄴㅇㄹㄴㄹㅇ, PASSWORD=sdfsfd, 
		//no=[1, 2], EXAMNO=[1, 2], EXAMAS=[ㄴㅇㄹㅇㄴㄹ, ㄴㅇㄹㄴㅇㄹ], EXAMTEXT=[ㄴㅇㄹㄴㄹ, ㄴㄹㄴㅇㄹㄴㄹ], EXAMDESC=[ㄴㅇㄹㄴㅇㄹ, ㄴㅇㄹㄴㅇㄹ], NOTE=[ㄴㅇㄹㄴㅇㄹ, ㄴㅇㄹㄴㅇㄹ]]

		//PsytestMasterCommand result = psytestWriteDao.selectPSYTEST_MASTER(arg);
		//model.addAttribute("LIST", result);
		
	}
}
