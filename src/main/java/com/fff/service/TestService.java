package com.fff.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fff.dao.TestDao;
import com.fff.vo.TestVo;
import com.fff.vo.TestVo2;


@Service
public class TestService {

	private static final Logger logger = LoggerFactory.getLogger(TestService.class);
	
	@Autowired
	private SqlSession sqlSession;
	
	
	public void txrTest(List<TestVo> test, Map<String, String> aaa, Set<TestVo> bbb, TestVo2 ccc ) {
		
		TestDao testDao = sqlSession.getMapper(TestDao.class);
		//bbb = testDao.getTest("1");
		
		List<Map<String, String>> testList = new ArrayList<Map<String,String>>();
		Map<String, String> rrr = new LinkedHashMap<String, String>();
		rrr.put("22222", "sssss");
		testList.add(rrr);
		ccc.setTestList(testList);
		ccc.setTestList2(testDao.getTest("1"));
		//TestVo bbbbb = new TestVo();
/*		bbbbb.setTest1("11");
		bbbbb.setTest2("11");
		bbbbb.setTest3("11");
		TestVo bbbbb2 = new TestVo();
		bbbbb2.setTest1("11");
		bbbbb2.setTest2("11");
		bbbbb2.setTest3("11");
		bbb.add(bbbbb);
		bbb.add(bbbbb2);*/
		aaa.put("111", "111");
		System.out.println(test.toString()+"2222");
	  //  System.out.println(test);
	}
	
	
}
