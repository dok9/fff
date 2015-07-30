package com.fff.dao;


import java.util.Map;

import com.fff.command.PsytestMasterCommand;


public interface PsytestWriteDao {
	public PsytestMasterCommand selectPSYTEST_MASTER(Map<String, String> arg);
	public int getExistCntPSYTEST_MASTER(Map<String, String> arg);
	public int insertPSYTEST_QUESTION(Map<String, String> arg);
	public void insertPSYTEST_EXAMPLE(Map<String, String> arg);
	public void insertPSYTEST_NOTE(Map<String, String> arg);
}


