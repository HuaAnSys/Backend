package com.huaan.shop.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;
import com.huaan.shop.model.UserInfo;
import com.huaan.shop.service.UserService;

/**
 * 
 * @author Tony
 * @version 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

	private static Logger logger = Logger.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/registerUser", produces = "application/json;charset=UTF-8", method = RequestMethod.POST)
	public @ResponseBody Object registerUser(@RequestBody Map<String, String> jsonData) {

		logger.info("enter registerUser method.");

		// param
		System.out.println("The jsonData is" + jsonData);
		UserInfo userInfo = new UserInfo();
		userInfo.setPhoneNo(jsonData.get("phoneNo"));
		userInfo.setIdentifierNo(jsonData.get("identifierNo"));
		userInfo.setName(jsonData.get("name"));
		userInfo.setSex(jsonData.get("sex"));
		userInfo.setPwd(jsonData.get("pwd"));
		userInfo.setNickName(jsonData.get("nickName"));
		// userInfo.setUnumber(Integer.valueOf(jsonData.get("Unumber")));

		// chceck if user exist by Icd. return userinfo for reuse
		JSONObject jsonObj = new JSONObject();
		UserInfo userInfo_chk = new UserInfo();
		userInfo_chk = userService.getUserByIcd(userInfo.getIdentifierNo());
		if (null != userInfo_chk && userInfo_chk.getId() != 0) {
			jsonObj.put("result", "user exist");
			logger.info("end registerUser method.");
			return jsonObj.toString();
		}

		// insert user
		if (userService.registerUser(userInfo) == 1) {
			jsonObj.put("result", "success");
		} else {
			jsonObj.put("result", "failed");
		}

		logger.info("end registerUser method.");
		return jsonObj;
	}

	@RequestMapping("/login/phoneNo/{phoneNo}/pwd/{pwd}")
	public @ResponseBody Object checkPwd(ModelMap modelMap, @PathVariable String phoneNo, @PathVariable String pwd) {

		logger.info("enter checkPwd method.");
		JSONObject jsonObj = new JSONObject();

		// param
		// System.out.println("The jsonData is" + jsonData);

		// chk pwd null
		if (null == pwd || "".equals(pwd)) {
			jsonObj.put("result", "pwd empty");
			return jsonObj.toString();
		}

		// get info from db
		UserInfo userInfo = new UserInfo();		
		userInfo = userService.getInfoByphoneNo(phoneNo);
		if (null == userInfo || null == userInfo.getPwd()) {
			jsonObj.put("result", "phoneNo not registed");
			return jsonObj.toString();
		}
		if (!userInfo.getPwd().equals(pwd)) {
			jsonObj.put("result", "pwd unmatch");
			return jsonObj.toString();
		}

		logger.info("end checkPwd method.");
		jsonObj.put("result", "success");
		jsonObj.put("userinfo", userInfo);
		return jsonObj;
	}
	
	@RequestMapping("/updateUserInfo/userId/{userID}")
	public @ResponseBody Object updateUserInfo(@RequestParam(value = "file") MultipartFile file, HttpServletRequest request) {

		logger.info("enter updateUserInfo method.");



		return null;
	} 
	
}
