package com.fff.command;

import java.util.Arrays;

public class PsytestWriteCommand {

	
	
		private String SUBPATH1;
		private String SUBPATH2;
		private String TITLE;
		private String QUESTNO;
		private String QUESTAS;
		private String QUESTTEXT;
		private String QUESTDESC;
		private String PASSWORD;
		private String [] no;
		private String [] EXAMNO;
		private String [] EXAMAS;
		private String [] EXAMTEXT;
		private String [] EXAMDESC;
		private String [] NOTE;
		public String getSUBPATH1() {
			return SUBPATH1;
		}
		public void setSUBPATH1(String sUBPATH1) {
			SUBPATH1 = sUBPATH1;
		}
		public String getSUBPATH2() {
			return SUBPATH2;
		}
		public void setSUBPATH2(String sUBPATH2) {
			SUBPATH2 = sUBPATH2;
		}
		public String getTITLE() {
			return TITLE;
		}
		public void setTITLE(String tITLE) {
			TITLE = tITLE;
		}
		public String getQUESTNO() {
			return QUESTNO;
		}
		public void setQUESTNO(String qUESTNO) {
			QUESTNO = qUESTNO;
		}
		public String getQUESTAS() {
			return QUESTAS;
		}
		public void setQUESTAS(String qUESTAS) {
			QUESTAS = qUESTAS;
		}
		public String getQUESTTEXT() {
			return QUESTTEXT;
		}
		public void setQUESTTEXT(String qUESTTEXT) {
			QUESTTEXT = qUESTTEXT;
		}
		public String getQUESTDESC() {
			return QUESTDESC;
		}
		public void setQUESTDESC(String qUESTDESC) {
			QUESTDESC = qUESTDESC;
		}
		public String getPASSWORD() {
			return PASSWORD;
		}
		public void setPASSWORD(String pASSWORD) {
			PASSWORD = pASSWORD;
		}
		public String[] getNo() {
			return no;
		}
		public void setNo(String[] no) {
			this.no = no;
		}
		public String[] getEXAMNO() {
			return EXAMNO;
		}
		public void setEXAMNO(String[] eXAMNO) {
			EXAMNO = eXAMNO;
		}
		public String[] getEXAMAS() {
			return EXAMAS;
		}
		public void setEXAMAS(String[] eXAMAS) {
			EXAMAS = eXAMAS;
		}
		public String[] getEXAMTEXT() {
			return EXAMTEXT;
		}
		public void setEXAMTEXT(String[] eXAMTEXT) {
			EXAMTEXT = eXAMTEXT;
		}
		public String[] getEXAMDESC() {
			return EXAMDESC;
		}
		public void setEXAMDESC(String[] eXAMDESC) {
			EXAMDESC = eXAMDESC;
		}
		public String[] getNOTE() {
			return NOTE;
		}
		public void setNOTE(String[] nOTE) {
			NOTE = nOTE;
		}
		@Override
		public String toString() {
			return "PsytestWriteCommand [SUBPATH1=" + SUBPATH1 + ", SUBPATH2="
					+ SUBPATH2 + ", TITLE=" + TITLE + ", QUESTNO=" + QUESTNO
					+ ", QUESTAS=" + QUESTAS + ", QUESTTEXT=" + QUESTTEXT
					+ ", QUESTDESC=" + QUESTDESC + ", PASSWORD=" + PASSWORD
					+ ", no=" + Arrays.toString(no) + ", EXAMNO="
					+ Arrays.toString(EXAMNO) + ", EXAMAS="
					+ Arrays.toString(EXAMAS) + ", EXAMTEXT="
					+ Arrays.toString(EXAMTEXT) + ", EXAMDESC="
					+ Arrays.toString(EXAMDESC) + ", NOTE="
					+ Arrays.toString(NOTE) + "]";
		}
		
}
