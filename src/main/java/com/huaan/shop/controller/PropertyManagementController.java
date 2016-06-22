package com.huaan.shop.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/propertyManagement")
public class PropertyManagementController {

	/**
	 * 这个是物业缴费的后台预留接口，但是需要提前搞明白怎么样微信活支付宝
	 */
	public void payPropertyFee() {

	}

	/**
	 * 获取所有报修
	 * 
	 * @return
	 */
	@RequestMapping("/getClaimedRepairs")
	public @ResponseBody String getClaimedRepairs() {
		// List<CommunityAnnouncement> cas =
		// communityAnnounceService.getCommunityAnnouncement();
		return null;
	}

	/**
	 * 创建一个新报修
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "createNewRepair", method = RequestMethod.POST)
	public @ResponseBody String createNewRepair(@RequestBody Map<String, String> jsonData) {
		// String phoneNo = jsonData.get("phoneNo");

		return null;
	}

	/**
	 * 获取所有报修
	 * 
	 * @return
	 */
	@RequestMapping("/getRentSaleProperty")
	public @ResponseBody String getRentSaleProperty() {
		// List<CommunityAnnouncement> cas =
		// communityAnnounceService.getCommunityAnnouncement();
		return null;
	}

	/**
	 * 创建一个新报修
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "createNewRentSaleProperty", method = RequestMethod.POST)
	public @ResponseBody String createNewRentSaleProperty(@RequestBody Map<String, String> jsonData) {
		// String phoneNo = jsonData.get("phoneNo");

		return null;
	}

	/**
	 * 获取所有访客邀请
	 * 
	 * @return
	 */
	@RequestMapping("/getCustomers")
	public @ResponseBody String getCustomers() {
		// List<CommunityAnnouncement> cas =
		// communityAnnounceService.getCommunityAnnouncement();
		return null;
	}

	/**
	 * 保存新访客到数据库
	 * 
	 * @return
	 */
	@RequestMapping(value = "/createNewCustomer", method = RequestMethod.POST)
	public @ResponseBody String createNewCustomer() {
		// List<CommunityAnnouncement> cas =
		// communityAnnounceService.getCommunityAnnouncement();
		return null;
	}

	/**
	 * 获取所有投诉
	 * 
	 * @return
	 */
	@RequestMapping("/getComplain")
	public @ResponseBody String getComplain() {
		// List<CommunityAnnouncement> cas =
		// communityAnnounceService.getCommunityAnnouncement();
		return null;
	}

	/**
	 * 创建新投诉
	 * 
	 * @return
	 */
	@RequestMapping(value = "/createNewComplain", method = RequestMethod.POST)
	public @ResponseBody String createNewComplain() {
		// List<CommunityAnnouncement> cas =
		// communityAnnounceService.getCommunityAnnouncement();
		return null;
	}
}
