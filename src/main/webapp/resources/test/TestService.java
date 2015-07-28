package com.ant.service;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.ant.dao.TestDao;



@Service
public class TestService {

	@Inject
	private SqlSession sqlSession;
	
		@Transactional
		public void txrTest (Model model){
			
			TestDao testDao = sqlSession.getMapper(TestDao.class);
			//Example2Dao example2Dao = sqlSession.getMapper(Example2Dao.class);
			
			List<Map<String, Object>> example  = testDao.selectEXAMPLE();
			List<Map<String, Object>> question  = testDao.selectQUESTION();
			
			List<Map<String, Object>> data = new LinkedList<Map<String,Object>>();
			
			for(Map<String, Object> tempMap : question){
				
				
				List<Map<String, Object>> tempList = new LinkedList<Map<String,Object>>();
				for(Map<String, Object> tempMapBaby: example){
					
					if(tempMapBaby.get("QUESTIONNO").equals(tempMap.get("QUESTIONNO"))){
						tempList.add(tempMapBaby);
					}
				}
				
				tempMap.put("EXAMPLE", tempList);
				data.add(tempMap);
			}
			System.out.println(data.toString());
			//aaa.put("ex", exampleDao.getUserName("1"));
			//aaa.put("ex2", example2Dao.getUserName("1"));
			//System.out.println("exam+++++++++++"+exam);
			
			model.addAttribute("DATA", data);
			//model.addAttribute("qsData", qsData() );
			
			//model.addAttribute("qsData", qsData() );
			
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
