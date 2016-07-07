package com.huaan.shop.dao;

import java.util.List;

import com.huaan.shop.model.HousekeepingInfo;

public interface HousekeepingInfoMapper {
    
	// 获取家政服务所有数据
	List<HousekeepingInfo> selHousekeepingInfo();	

}