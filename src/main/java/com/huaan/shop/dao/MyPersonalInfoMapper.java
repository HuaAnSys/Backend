package com.huaan.shop.dao;

import java.util.List;

import com.huaan.shop.model.ActityAlarmInfo;
import com.huaan.shop.model.MyPersonalInfo;

public interface MyPersonalInfoMapper {

	// 获取个人房屋信息
	List<MyPersonalInfo> selHouseInfo(int userID);

	// 获取我的订单
	List<MyPersonalInfo> selbuyOrderInfo(int userID);

	// 获取我的待付款订单
	List<MyPersonalInfo> selbuyOrderInfo_Pending(int userID);

	// 获取我的购物车
	List<MyPersonalInfo> selMyShoppingCart(int userID);


}