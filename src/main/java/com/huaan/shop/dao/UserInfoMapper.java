package com.huaan.shop.dao;

import java.util.List;

import com.huaan.shop.model.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
    
    List<UserInfo> selectAll();
    
    // registerUser
    int registerUser(UserInfo ui);
    
    // check user exist
    UserInfo selectByIcd(String icd);
    
    // check pwd by telno
    String selectPwdByphoneNo(String phoneNo);

}