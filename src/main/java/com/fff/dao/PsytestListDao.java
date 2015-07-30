package com.fff.dao;


import java.util.Map;

import com.fff.command.PsytestListCommand;
import com.fff.command.PsytestMasterCommand;


public interface PsytestListDao {
	public PsytestListCommand selectPSYTEST_QUESTION(Map<String, String> arg);
}


