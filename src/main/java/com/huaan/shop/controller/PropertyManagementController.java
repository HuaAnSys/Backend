package com.huaan.shop.controller;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;
import com.huaan.shop.common.FileUpload;
import com.huaan.shop.model.PropertyManagementInfo;
import com.huaan.shop.service.PropertyManagementInfoService;

@Controller
@RequestMapping("/propertyManagement")
public class PropertyManagementController {

	/**
	 * 这个是物业缴费的后台预留接口，但是需要提前搞明白怎么样微信活支付宝
	 */
	public void payPropertyFee() {

	}

	private static Logger logger = Logger.getLogger(PropertyManagementController.class);

	@Autowired
	private PropertyManagementInfoService propertyManagementInfoService;

	/**
	 * 获取所有报修
	 * 
	 * @return
	 */
	@RequestMapping("/getClaimedRepairs")
	public @ResponseBody List<PropertyManagementInfo> getClaimedRepairs() {

		logger.info("enter the getClaimedRepairs method");
		List<PropertyManagementInfo> propertyManagementInfo = propertyManagementInfoService.getClaimedRepairs();
		logger.info("end the getClaimedRepairs method");
		return propertyManagementInfo;
	}

	/**
	 * 创建一个新报修
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "createNewRepair", method = RequestMethod.POST)
	public @ResponseBody String createNewRepair(@RequestParam(value = "file") MultipartFile file,
			HttpServletRequest request) {

		logger.info("enter createNewRepair method.");

		JSONObject jsonObj = new JSONObject();

		if (null == request.getParameter("content") || null == request.getParameter("userId")) {
			jsonObj.put("result", "paramater null");
			return jsonObj.toString();
		}

		// 画像ダウンロード
		FileUpload fileupload = new FileUpload();
		if (!fileupload.uploadPicToNginx(file, "report_fix")) {
			jsonObj.put("result", "pic null");
			return jsonObj.toString();
		}

		PropertyManagementInfo propertyManagementInfo = new PropertyManagementInfo();
		propertyManagementInfo.setReportfixContent(request.getParameter("content"));
		propertyManagementInfo.setReportfixUserID(Integer.parseInt(request.getParameter("userId")));
		propertyManagementInfo.setReportfixPicName(fileupload.getFILE_NAME());

		if (1 == propertyManagementInfoService.createNewRepair(propertyManagementInfo)) {
			jsonObj.put("result", "success");
		} else {
			jsonObj.put("result", "failed");
		}

		logger.info("end createNewRepair method.");

		return jsonObj.toString();
	}

	/**
	 * 获取所有报修
	 * 
	 * @return
	 */
	@RequestMapping("/getRentSaleProperty")
	public @ResponseBody List<PropertyManagementInfo> getRentSaleProperty() {

		logger.info("enter the getRentSaleProperty method");
		List<PropertyManagementInfo> propertyManagementInfo = propertyManagementInfoService.getClaimedRepairs();
		logger.info("end the getRentSaleProperty method");
		return propertyManagementInfo;
	}

	/**
	 * 创建一个新报修
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "createNewRentSaleProperty", method = RequestMethod.POST)
	public @ResponseBody String createNewRentSaleProperty(@RequestParam(value = "file") MultipartFile file,
			HttpServletRequest request) {

		logger.info("enter createNewRentSaleProperty method.");

		JSONObject jsonObj = new JSONObject();

		if (null == request.getParameter("content") || null == request.getParameter("userId")) {
			jsonObj.put("result", "paramater null");
			return jsonObj.toString();
		}

		// 画像ダウンロード
		FileUpload fileupload = new FileUpload();
		if (!fileupload.uploadPicToNginx(file, "report_fix")) {
			jsonObj.put("result", "pic null");
			return jsonObj.toString();
		}

		// ActityAlarmデータ作成
		PropertyManagementInfo propertyManagementInfo = new PropertyManagementInfo();
		propertyManagementInfo.setReportfixContent(request.getParameter("content"));
		propertyManagementInfo.setReportfixUserID(Integer.parseInt(request.getParameter("userId")));
		propertyManagementInfo.setReportfixPicName(fileupload.getFILE_NAME());

		if (1 == propertyManagementInfoService.createNewRepair(propertyManagementInfo)) {
			jsonObj.put("result", "success");
		} else {
			jsonObj.put("result", "failed");
		}

		logger.info("end createNewRentSaleProperty method.");

		return jsonObj.toString();
	}

	/**
	 * 获取所有访客邀请
	 * 
	 * @return
	 */
	@RequestMapping("/getCustomers")
	public @ResponseBody List<PropertyManagementInfo> getCustomers() {

		logger.info("enter the getCustomers method");
		List<PropertyManagementInfo> propertyManagementInfo = propertyManagementInfoService.getCustomers();
		logger.info("end the getCustomers method");
		return propertyManagementInfo;
	}

	/**
	 * 保存新访客到数据库
	 * 
	 * @return
	 */
	@RequestMapping(value = "/createNewCustomer", method = RequestMethod.POST)
	public @ResponseBody String createNewCustomer(@RequestBody Map<String, String> jsonData) {

		PropertyManagementInfo propertyManagementInfo = new PropertyManagementInfo();

		propertyManagementInfo.setVisitId(Integer.valueOf(jsonData.get("id")));
		propertyManagementInfo.setVisitName(jsonData.get("visit_name"));
		propertyManagementInfo.setVisitSex(jsonData.get("sex"));
		propertyManagementInfo.setVisitTime(Date.valueOf(jsonData.get("visit_time")));
		propertyManagementInfo.setVisitBarCodeTime(Date.valueOf(jsonData.get("barCode_time")));
		propertyManagementInfo.setVisitStatue(Integer.valueOf(jsonData.get("status")));
		propertyManagementInfo.setVisitUserID(Integer.valueOf(jsonData.get("UserID")));

		JSONObject jsonObj = new JSONObject();

		// insert user
		if (propertyManagementInfoService.createNewCustomer(propertyManagementInfo) == 1) {
			jsonObj.put("result", "success");
		} else {
			jsonObj.put("result", "failed");
		}

		logger.info("end createNewCustomer method.");

		return jsonObj.toString();
	}

	/**
	 * 获取所有投诉
	 * 
	 * @return
	 */
	@RequestMapping("/getComplain")
	public @ResponseBody List<PropertyManagementInfo> getComplain() {
		logger.info("enter the getComplain method");
		List<PropertyManagementInfo> propertyManagementInfo = propertyManagementInfoService.getComplain();
		logger.info("end the getComplain method");
		return propertyManagementInfo;
	}

	/**
	 * 创建新投诉
	 * 
	 * @return
	 */
	@RequestMapping(value = "/createNewComplain", method = RequestMethod.POST)
	public @ResponseBody String createNewComplain(@RequestParam(value = "file") MultipartFile file,
			HttpServletRequest request) {

		logger.info("enter createNewComplain method.");

		JSONObject jsonObj = new JSONObject();

		if (null == request.getParameter("content") || null == request.getParameter("userId")) {
			jsonObj.put("result", "paramater null");
			return jsonObj.toString();
		}

		// 画像ダウンロード
		FileUpload fileupload = new FileUpload();
		if (!fileupload.uploadPicToNginx(file, "report_fix")) {
			jsonObj.put("result", "pic null");
			return jsonObj.toString();
		}

		PropertyManagementInfo propertyManagementInfo = new PropertyManagementInfo();
		propertyManagementInfo.setComplainContent(request.getParameter("content"));
		propertyManagementInfo.setComplainUserID(Integer.parseInt(request.getParameter("userId")));
		propertyManagementInfo.setComplainPicName(fileupload.getFILE_NAME());

		if (1 == propertyManagementInfoService.createNewComplain(propertyManagementInfo)) {
			jsonObj.put("result", "success");
		} else {
			jsonObj.put("result", "failed");
		}

		logger.info("end createNewComplain method.");

		return jsonObj.toString();
	}
}
