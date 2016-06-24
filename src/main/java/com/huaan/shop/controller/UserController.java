package com.huaan.shop.controller;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public @ResponseBody String registerUser(@RequestBody Map<String, String> jsonData) {

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
		return jsonObj.toString();
	}

	@RequestMapping("/login/phoneNo/{phoneNo}/pwd/{pwd}")
	public @ResponseBody String checkPwd(ModelMap modelMap, @PathVariable String phoneNo, @PathVariable String pwd) {

		logger.info("enter checkPwd method.");
		JSONObject jsonObj = new JSONObject();

		// param
		// System.out.println("The jsonData is" + jsonData);

		// chk pwd null
		if (null == pwd || "".equals(pwd)) {
			jsonObj.put("result", "pwd empty");
			return jsonObj.toString();
		}

		UserInfo userInfo = new UserInfo();
		userInfo.setPhoneNo(phoneNo);
		userInfo.setPwd(pwd);

		// get pwd from db
		String strPwd = userService.getPwdByphoneNo(userInfo.getPhoneNo());
		if (null == strPwd) {
			jsonObj.put("result", "phoneNo empty");
			return jsonObj.toString();
		}

		if (userInfo.getPwd().equals(strPwd)) {
			jsonObj.put("result", "success");
		} else {
			jsonObj.put("result", "failed");
		}

		logger.info("end checkPwd method.");
		return jsonObj.toString();
	}
}
