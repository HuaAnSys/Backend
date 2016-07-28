package com.huaan.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huaan.shop.dao.ActityAlarmInfoMapper;
import com.huaan.shop.dao.MyPersonalInfoMapper;
import com.huaan.shop.dao.ProductInfoMapper;
import com.huaan.shop.model.ActityAlarmInfo;
import com.huaan.shop.model.MyPersonalInfo;
import com.huaan.shop.model.ProductInfo;
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
	@Autowired
	private ProductInfoMapper productInfoMapper;
	@Autowired
	private ActityAlarmInfoMapper actityAlarmInfoMapper;

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

	@Override
	public List<ProductInfo> getMyShoppingCart(int shoppingcart_userID) {
		// TODO Auto-generated method stub
		List<ProductInfo> temp = null;
		temp = productInfoMapper.selMyShoppingCart(shoppingcart_userID);
		return temp;
	}

	@Override
	public List<ActityAlarmInfo> getMyPostedTopic(int userId) {
		// TODO Auto-generated method stub
		List<ActityAlarmInfo> postedList = null;
		postedList = actityAlarmInfoMapper.getMyPostedTopic(userId);
		return postedList;
	}

	@Override
	public List<ActityAlarmInfo> getParticipate(int userId) {
		// TODO Auto-generated method stub
		List<ActityAlarmInfo> postedList = null;
		postedList = actityAlarmInfoMapper.getMyParticipateTopic(userId);
		return postedList;
	}

	
}
