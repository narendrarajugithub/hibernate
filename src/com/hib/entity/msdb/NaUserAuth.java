package com.hib.entity.msdb;

// Generated Nov 30, 2017 9:55:32 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

/**
 * NaUserAuth generated by hbm2java
 */
public class NaUserAuth implements java.io.Serializable {

	private String userId;
	private UserInfo userInfo;
	private String userPassword;
	private BigDecimal userMobileNo;
	private Date createdOn;

	public NaUserAuth() {
	}

	public NaUserAuth(String userId, String userPassword,
			BigDecimal userMobileNo) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.userMobileNo = userMobileNo;
	}

	public NaUserAuth(String userId, UserInfo userInfo, String userPassword,
			BigDecimal userMobileNo, Date createdOn) {
		this.userId = userId;
		this.userInfo = userInfo;
		this.userPassword = userPassword;
		this.userMobileNo = userMobileNo;
		this.createdOn = createdOn;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public BigDecimal getUserMobileNo() {
		return this.userMobileNo;
	}

	public void setUserMobileNo(BigDecimal bigDecimal) {
		this.userMobileNo = bigDecimal;
	}

	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

}