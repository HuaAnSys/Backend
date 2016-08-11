package com.huaan.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huaan.shop.dao.UserInfoMapper;
import com.huaan.shop.model.UserInfo;
import com.huaan.shop.service.UserService;

/**
 * 
 * @author Tony
 * @version 1.0
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserInfoMapper userInfoMapper;

	@Override
	public UserInfo getUserById(int id) {
		return userInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<UserInfo> getUsers() {
		return userInfoMapper.selectAll();
	}

	@Override
	public int insert(UserInfo userInfo) {

		int result = userInfoMapper.insert(userInfo);

		System.out.println(result);
		return result;
	}

	@Override
	public int registerUser(UserInfo ui) {
		// registerUser
		int result = userInfoMapper.registerUser(ui);
		System.out.println(result);
		return result;
	}

	@Override
	public UserInfo getUserByIcd(String icd) {
		return userInfoMapper.selectByIcd(icd);
	}

	@Override
	public UserInfo getInfoByphoneNo(String phoneNo) {
		return userInfoMapper.selectInfoByphoneNo(phoneNo);
	}

	@Override
	public int updateNickName(UserInfo userInfo) {
		return userInfoMapper.updateNickName(userInfo);
	}

}
