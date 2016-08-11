package com.huaan.shop.service;

import java.util.List;

import com.huaan.shop.model.UserInfo;

/**
 * 
 * @author Tony
 * @version 1.0
 */
public interface UserService {

	UserInfo getUserById(int id);

	List<UserInfo> getUsers();

	int insert(UserInfo userInfo);
	
	// registerUser
	int registerUser(UserInfo ui);
	
	// check user
	UserInfo getUserByIcd(String icd);
	
	// check pwd by telno
	UserInfo getInfoByphoneNo(String phoneNo);
	
	//update user information
	int updateNickName(UserInfo userInfo);
}
