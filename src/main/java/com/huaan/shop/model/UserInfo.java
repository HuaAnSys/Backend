package com.huaan.shop.model;

public class UserInfo {

	// private List<CourseInfo> courseInfos;
	private Integer id;
	private String phoneNo;
	private String identifierNo;
	private String name;
	private String sex;
	private String pwd;
	private String nickName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getIdentifierNo() {
		return identifierNo;
	}

	public void setIdentifierNo(String identifierNo) {
		this.identifierNo = identifierNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

}