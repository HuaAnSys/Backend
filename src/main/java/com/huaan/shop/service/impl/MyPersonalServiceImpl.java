package com.huaan.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huaan.shop.dao.MyPersonalInfoMapper;
import com.huaan.shop.model.MyPersonalInfo;
import com.huaan.shop.service.MyPersonalService;

/**
 * 
 * @author Tony
 * @version 1.0
 */
@Service("MyPersonalService")
public class MyPersonalServiceImpl implements MyPersonalService {

	@Autowired
	private MyPersonalInfoMapper myPersonalInfoMapper;

	// 获取个人房屋信息
	@Override
	public List<MyPersonalInfo> getHouseInfo(int userID) {
		return myPersonalInfoMapper.selHouseInfo(userID);
	}	
	
	// 获取我的订单
	@Override
	public List<MyPersonalInfo> getbuyOrderInfo(int userID){
		return myPersonalInfoMapper.selbuyOrderInfo(userID);
	}

	// 获取我的待付款订单
	@Override
	public List<MyPersonalInfo> getbuyOrderInfo_Pending(int userID) {
		return myPersonalInfoMapper.selbuyOrderInfo(userID);
	}

	// 获取我的购物车
	@Override
	public List<MyPersonalInfo> getMyShoppingCart(int userID) {
		return myPersonalInfoMapper.selMyShoppingCart(userID);
	}	
		
}
