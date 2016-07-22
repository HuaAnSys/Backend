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

import com.huaan.shop.model.MyPersonalInfo;
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
	@RequestMapping("/getMyShoppingCart/{userID}")
	public @ResponseBody Object getMyShoppingCart(@PathVariable int userID) {
		logger.info("enter the getMyProperty method");
		List<MyPersonalInfo> infos = myPersonalInfoService.getMyShoppingCart(userID);
		logger.info("end the getMyProperty method");
		return infos;
	}

	/**
	 * 获取我的待付款订单
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping("/getMyPendingOrder/{userID}")
	public @ResponseBody Object getMyPendingOrder(@PathVariable int userID) {
		logger.info("enter the getMyProperty method");
		List<MyPersonalInfo> infos = myPersonalInfoService.getbuyOrderInfo_Pending(userID);
		logger.info("end the getMyProperty method");
		return infos;
	}

	/**
	 * 获取我的订单
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping("/getMyOrder/{userID}")
	public @ResponseBody Object getMyOrder(@PathVariable int userID) {
		logger.info("enter the getMyProperty method");
		List<MyPersonalInfo> infos = myPersonalInfoService.getbuyOrderInfo(userID);
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
	public @ResponseBody String getMyPostedTopic(@PathVariable int userID) {
		return null;
	}

	/**
	 * 获取我参与的主题
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping("/getMyParticipativeTopic/{userID}")
	public @ResponseBody String getMyParticipativeTopic(@PathVariable int userID) {
		return null;
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
}
