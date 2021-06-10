package com.greedy.ncs.member.model.dto;

import java.sql.Date;

public class MemberDTO {

	private int userNum;
	private String userId;
	private String userPwd;
	private String userName;
	private String userEntranceDate;
	private double userHeight;
	private double userweight;
	private boolean isTrue;
	
	public MemberDTO(int userNum, String userId, String userPwd, String userName, String userEntranceDate,
			double userHeight, double userweight, boolean isTrue) {
		super();
		this.userNum = userNum;
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.userEntranceDate = userEntranceDate;
		this.userHeight = userHeight;
		this.userweight = userweight;
		this.isTrue = isTrue;
	}

	public int getUserNum() {
		return userNum;
	}

	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEntranceDate() {
		return userEntranceDate;
	}

	public void setUserEntranceDate(String userEntranceDate) {
		this.userEntranceDate = userEntranceDate;
	}

	public double getUserHeight() {
		return userHeight;
	}

	public void setUserHeight(double userHeight) {
		this.userHeight = userHeight;
	}

	public double getUserweight() {
		return userweight;
	}

	public void setUserweight(double userweight) {
		this.userweight = userweight;
	}

	public boolean isTrue() {
		return isTrue;
	}

	public void setTrue(boolean isTrue) {
		this.isTrue = isTrue;
	}
	
	@Override
	public String toString() {
		return " userName = " + userName + "\n userID = " + userId + "\n userPwd = " + userPwd + "\n userName = " + userName
				+ "\n userEntranceDate = " + userEntranceDate + "\n userHeight = " + userHeight + "\n userWeight = " + userweight
				+ "\n isTrue = " + isTrue;
	}
	
	
}
