package com.fff.command;

public class PsytestMasterCommand {

		private String SUBPATH1;
		private String SUBPATH2;
		private String PASSWORD;
		private String TITLE;
		private String TYPE;
		
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
		public String getPASSWORD() {
			return PASSWORD;
		}
		public void setPASSWORD(String pASSWORD) {
			PASSWORD = pASSWORD;
		}
		public String getTITLE() {
			return TITLE;
		}
		public void setTITLE(String tITLE) {
			TITLE = tITLE;
		}
		public String getTYPE() {
			return TYPE;
		}
		public void setTYPE(String tYPE) {
			TYPE = tYPE;
		}
		
		@Override
		public String toString() {
			return "PsytestMasterCommand [SUBPATH1=" + SUBPATH1 + ", SUBPATH2="
					+ SUBPATH2 + ", PASSWORD=" + PASSWORD + ", TITLE=" + TITLE
					+ ", TYPE=" + TYPE + "]";
		}
}
