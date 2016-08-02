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
	List<ProductInfo> getbuyOrderInfo(int shoppingcart_userID);
	
	// 获取我的待付款订单
	List<ProductInfo> getbuyOrderInfo_Pending(int shoppingcart_userID);
	
	// 获取我的购物车
	List<ProductInfo> getMyShoppingCart(int shoppingcart_userID);

	//获取我发表的主题
	List<ActityAlarmInfo> getMyPostedTopic(int userID);

	//获取我参与的主题
	List<ActityAlarmInfo> getParticipate(int userID);
	
	//取消我的待付款订单
	int cancelMyPendingOrder(int userID, int orderID);
	
}
