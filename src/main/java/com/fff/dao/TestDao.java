package com.fff.dao;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fff.vo.TestVo;

public interface TestDao {
	public List<TestVo> getTest(String arg);
}
