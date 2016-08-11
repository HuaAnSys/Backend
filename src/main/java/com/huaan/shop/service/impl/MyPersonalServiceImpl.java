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
	public List<ProductInfo> getbuyOrderInfo(int shoppingcart_userID){
		List<ProductInfo> temp = null;
		temp = productInfoMapper.getbuyOrderInfo(shoppingcart_userID);
		return temp;
	}

	// 获取我的待付款订单
	@Override
	public List<ProductInfo> getbuyOrderInfo_Pending(int shoppingcart_userID) {
		List<ProductInfo> temp = null;
		temp = productInfoMapper.selbuyOrderInfo(shoppingcart_userID);
		return temp;
	}

	//获取购物车
	@Override
	public List<ProductInfo> getMyShoppingCart(int shoppingcart_userID) {
		// TODO Auto-generated method stub
		List<ProductInfo> temp = null;
		temp = productInfoMapper.selMyShoppingCart(shoppingcart_userID);
		return temp;
	}

	//获取我发表的主题
	@Override
	public List<ActityAlarmInfo> getMyPostedTopic(int userId) {
		// TODO Auto-generated method stub
		List<ActityAlarmInfo> postedList = null;
		postedList = actityAlarmInfoMapper.getMyPostedTopic(userId);
		return postedList;
	}

	//获取我参与的主题
	@Override
	public List<ActityAlarmInfo> getParticipate(int userId) {
		// TODO Auto-generated method stub
		List<ActityAlarmInfo> postedList = null;
		postedList = actityAlarmInfoMapper.getMyParticipateTopic(userId);
		return postedList;
	}
	
	//取消我的待付款订单
	@Override
	public int cancelMyPendingOrder(int userID, int orderID) {
		// TODO Auto-generated method stub
		return productInfoMapper.cancelMyPendingOrder(userID,orderID);
	}

	//获取待付款订单ID
	@Override
	public List<ProductInfo> getbuyOrderID(int shoppingcart_userID) {
		// TODO Auto-generated method stub
		return productInfoMapper.getbuyOrderID(shoppingcart_userID);
	}

	//根据orderID获取待付款订单
	@Override
	public List<ProductInfo> getbuyOrderInfoByID(int order_id) {
		// TODO Auto-generated method stub
		return productInfoMapper.getbuyOrderInfoByID(order_id);
	}

	
}
