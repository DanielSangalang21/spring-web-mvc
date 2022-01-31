package com.dreamcatcher.bean;

public class LogBean {
	private String logID;
	private String logAction;
	private String userID;
	private String logDate;
	
	public String getLogID() {
		return logID;
	}
	public void setLogID(String logID) {
		this.logID = logID;
	}
	public String getLogAction() {
		return logAction;
	}
	public void setLogAction(String logAction) {
		this.logAction = logAction;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getLogDate() {
		return logDate;
	}
	public void setLogDate(String logDate) {
		this.logDate = logDate;
	}
	
	@Override
	public String toString() {
		return "LogBean [logID=" + logID + ", logAction=" + logAction + ", userID=" + userID + ", logDate=" + logDate
				+ "]";
	}
	
}
