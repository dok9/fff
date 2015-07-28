package com.fff.dao;


import java.util.Map;

import com.fff.command.PsytestMasterCommand;


public interface PsytestWriteDao {
	public PsytestMasterCommand selectPSYTEST_MASTER(Map<String, String> arg);
}
