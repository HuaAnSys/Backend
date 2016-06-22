package com.huaan.shop.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/myPersonalInfo")
public class MyPersonalInfoController {

	/**
	 * 获取我的购物车
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping("/getMyShoppingCart")
	public @ResponseBody String getMyShoppingCart(@RequestBody Map<String, String> jsonData) {
		return null;
	}

	/**
	 * 获取我的待付款订单
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping("/getMyPendingOrder")
	public @ResponseBody String getMyPendingOrder(@RequestBody Map<String, String> jsonData) {
		return null;
	}

	/**
	 * 获取我的订单
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping("/getMyOrder")
	public @ResponseBody String getMyOrder(@RequestBody Map<String, String> jsonData) {
		return null;
	}

	/**
	 * 获取我发表的主题
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping("/getMyPostedTopic")
	public @ResponseBody String getMyPostedTopic(@RequestBody Map<String, String> jsonData) {
		return null;
	}

	/**
	 * 获取我参与的主题
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping("/getMyParticipativeTopic")
	public @ResponseBody String getMyParticipativeTopic(@RequestBody Map<String, String> jsonData) {
		return null;
	}

	/**
	 * 获取个人房屋信息
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping("/getMyProperty")
	public @ResponseBody String getMyProperty(@RequestBody Map<String, String> jsonData) {
		return null;
	}
}
