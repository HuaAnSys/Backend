package com.huaan.shop.controller;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huaan.shop.model.ActityAlarmInfo;
import com.huaan.shop.model.MyPersonalInfo;
import com.huaan.shop.model.ProductInfo;
import com.huaan.shop.service.MyPersonalService;

@Controller
@RequestMapping("/myPersonalInfo")
public class MyPersonalInfoController {
	
    private static Logger logger = Logger.getLogger(MyPersonalInfoController.class);
	
	@Autowired
	private MyPersonalService myPersonalInfoService;

	/**
	 * 获取我的购物车
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping("/getMyShoppingCart/{shoppingcart_userID}")
	public @ResponseBody Object getMyShoppingCart(@PathVariable int shoppingcart_userID) {
		logger.info("enter the getMyProperty method");
		List<ProductInfo> infos = myPersonalInfoService.getMyShoppingCart(shoppingcart_userID);
		logger.info("end the getMyProperty method");
		return infos;
	}

	/**
	 * 获取我的待付款订单
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping("/getMyPendingOrder/{shoppingcart_userID}")
	public @ResponseBody Object getMyPendingOrder(@PathVariable int shoppingcart_userID) {
		logger.info("enter the getMyProperty method");
		List<ProductInfo> infos = myPersonalInfoService.getbuyOrderInfo_Pending(shoppingcart_userID);
		logger.info("end the getMyProperty method");
		return infos;
	}

	/**
	 * 获取我的订单
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping("/getMyOrder/{shoppingcart_userID}")
	public @ResponseBody Object getMyOrder(@PathVariable int shoppingcart_userID) {
		logger.info("enter the getMyProperty method");
		List<ProductInfo> infos = myPersonalInfoService.getbuyOrderInfo(shoppingcart_userID);
		logger.info("end the getMyProperty method");
		return infos;
	}

	/**
	 * 获取我发表的主题
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping("/getMyPostedTopic/{userID}")
	public @ResponseBody List getMyPostedTopic(@PathVariable int userID) {
		logger.info("enter get my posted topic method");
		System.out.println("-----userID----"+userID);
		List<ActityAlarmInfo> postedList = myPersonalInfoService.getMyPostedTopic(userID);
		return postedList;
	}

	/**
	 * 获取我参与的主题
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping("/getMyParticipativeTopic/{userID}")
	public @ResponseBody List getMyParticipativeTopic(@PathVariable int userID) {
		logger.info("enter get my participate topic method");
		List<ActityAlarmInfo> participateList = myPersonalInfoService.getParticipate(userID);
		return participateList;
	}

	/**
	 * 获取个人房屋信息
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping("/getMyProperty/{userID}")
	public @ResponseBody Object getMyProperty(@PathVariable int userID) {
		logger.info("enter the getMyProperty method");
		List<MyPersonalInfo> infos = myPersonalInfoService.getHouseInfo(userID);
		logger.info("end the getMyProperty method");
		return infos;
	}
	
	/**
	 * 取消我的待付款订单
	 * @param userID
	 * @param orderID
	 * @return
	 */
	@RequestMapping("/cancelMyPendingOrder/userId/{userID}/orderID/{orderID}")
	public @ResponseBody Object cancelMyPendingOrder(@PathVariable int userID, @PathVariable int orderID) {
		logger.info("enter the cancelMyPendingOrder method");
		//implementation
		//
		logger.info("end the cancelMyPendingOrder method");
		return null;
	}
	
	
	
	
}
