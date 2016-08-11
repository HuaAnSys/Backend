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
    
    // select all by telno
    UserInfo selectInfoByphoneNo(String phoneNo);
    
    int updateNickName(UserInfo userInfo);

}