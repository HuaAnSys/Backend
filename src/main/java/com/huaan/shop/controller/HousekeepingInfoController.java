package com.huaan.shop.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huaan.shop.model.HousekeepingInfo;
import com.huaan.shop.service.HousekeepingInfoService;

/**
 * 获取家政服务所有数据
 * @author Tony
 * @version 1.0
 */
@Controller
@RequestMapping("/housekeepinfo")
public class HousekeepingInfoController {

	private static Logger logger = Logger.getLogger(HousekeepingInfoController.class);
	
	@Autowired
	private HousekeepingInfoService hoursekeepInfoService;
	
	@RequestMapping(value="/getHousekeepingInfo", method = RequestMethod.GET)
	public @ResponseBody List<HousekeepingInfo> getAllHousekeepingInfo(){
		
		logger.info("enter the getAllHousekeepingInfo method");
		
		List<HousekeepingInfo> housekeepingInfos = hoursekeepInfoService.getAllHousekeepingInfo();
		
		logger.info("end the getAllHousekeepingInfo method");
		
		return housekeepingInfos;
	}
}
