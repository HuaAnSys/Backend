package com.huaan.shop.service;

import java.util.List;

import com.huaan.shop.model.ActityAlarmInfo;
import com.huaan.shop.model.MyPersonalInfo;
import com.huaan.shop.model.ProductInfo;

/**
 * 
 * @author Tony
 * @version 1.0
 */
public interface MyPersonalService {

	// 获取个人房屋信息
	List<MyPersonalInfo> getHouseInfo(int userID);
	
	// 获取我的订单
	List<MyPersonalInfo> getbuyOrderInfo(int userID);
	
	// 获取我的待付款订单
	List<MyPersonalInfo> getbuyOrderInfo_Pending(int userID);
	
	// 获取我的购物车
	List<ProductInfo> getMyShoppingCart(int shoppingcart_userID);

	List<ActityAlarmInfo> getMyPostedTopic(int userID);

	List<ActityAlarmInfo> getParticipate(int userID);
	
	
}
