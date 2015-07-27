package com.fff.vo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class TestVo2 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public List<Map<String, String>> testList;
	public List<TestVo> testList2;
	public List<Map<String, String>> getTestList() {
		return testList;
	}
	public void setTestList(List<Map<String, String>> testList) {
		this.testList = testList;
	}
	public List<TestVo> getTestList2() {
		return testList2;
	}
	public void setTestList2(List<TestVo> testList2) {
		this.testList2 = testList2;
	}
	@Override
	public String toString() {
		return "TestVo2 [testList=" + testList + ", testList2=" + testList2
				+ "]";
	}

		
}
