package com.huaan.shop.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;
import com.huaan.shop.common.FileUpload;
import com.huaan.shop.model.ActityAlarmInfo;
import com.huaan.shop.service.ActityAlarmService;

@Controller
@RequestMapping("/actityAlarm")
public class ActityAlarmController {

	private static Logger logger = Logger.getLogger(ActityAlarmController.class);

	 @Autowired
	 private ActityAlarmService actityAlarmService;

	/**
	 * 获取所有征集令
	 * @return
	 */
	@RequestMapping("/getAllActityAlarm")
	public @ResponseBody Object getAllActityAlarm() {
		
        logger.info("enter getBulletins method."); 
		
		List<ActityAlarmInfo> actityAlarmInfo = actityAlarmService.getAllActityAlarm();
		
		logger.info("end getBulletins method.");
		
		return actityAlarmInfo;
	}

	/**
	 * 征集令发帖
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "createNewActityAlarm", method = RequestMethod.POST)
//	public @ResponseBody String createNewActityAlarm(@RequestBody Map<String, String> jsonData, @RequestParam(value = "file") MultipartFile file) {
	public @ResponseBody String createNewActityAlarm(@RequestParam(value = "file") MultipartFile file, HttpServletRequest request) {
		
		logger.info("enter createNewActityAlarm method."); 
		
		JSONObject jsonObj = new JSONObject();
		
		if (null == request.getParameter("content") || null == request.getParameter("userId")) {
			jsonObj.put("result", "paramater null");
			return jsonObj.toString(); 
		}
		
		// 画像ダウンロード
		FileUpload fileupload = new FileUpload();
		if (!fileupload.uploadPicToNginx(file, "ActityAlarm")) {
			jsonObj.put("result", "pic null");
			return jsonObj.toString();
		}
		
		// ActityAlarmデータ作成
		ActityAlarmInfo actityAlarmInfo = new ActityAlarmInfo();
		actityAlarmInfo.setContent(request.getParameter("content"));
		actityAlarmInfo.setAlarm_userId(Integer.parseInt(request.getParameter("userId")));
		actityAlarmInfo.setPicName(fileupload.getFILE_NAME());
		
		if(1 == actityAlarmService.setActityAlarm(actityAlarmInfo)){
			jsonObj.put("result", "success");             	
        } else {
        	jsonObj.put("result", "failed"); 
        }
		
		logger.info("end createNewActityAlarm method.");
		
		return jsonObj.toString(); 
	}

	/**
	 * 获取征集令评论
	 * @param actityAlarmID
	 * @return
	 */
	@RequestMapping(value = "getActityAlarmComments/{actityAlarmID}")
	public @ResponseBody Object getActityAlarmComments(@PathVariable int actityAlarmID) { // return String　⇒　Object 

        logger.info("enter getActityAlarmComments method."); 
		
		List<ActityAlarmInfo> actityAlarmInfo = actityAlarmService.getAlarmcomments(actityAlarmID);
		
		logger.info("end getActityAlarmComments method.");
		
		return actityAlarmInfo;
	}

	/**
	 * 获取征集令点赞
	 * @param actityAlarmID
	 * @return
	 */
	@RequestMapping(value = "getActityAlarmLike/{actityAlarmID}")
	public @ResponseBody Object getActityAlarmLike(@PathVariable int actityAlarmID) { //RTN String to List

        logger.info("enter getActityAlarmLike method."); 
		
		List<ActityAlarmInfo> actityAlarmInfo = actityAlarmService.getAlarmLike(actityAlarmID);
		
		logger.info("end getActityAlarmLike method.");
		
		return actityAlarmInfo;
	}

	/**
	 * 征集令点赞
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "setActityAlarmLike", method = RequestMethod.POST)
	public @ResponseBody String setActityAlarmLike(@RequestBody Map<String, String> jsonData) {
		
		logger.info("enter setActityAlarmLike method."); 
		System.out.println("The jsonData is" + jsonData); 
		
		JSONObject jsonObj = new JSONObject();
		
		if (null == jsonData.get("userID") || null == jsonData.get("activityAlarmId")) {
			jsonObj.put("result", "paramater null");
			return jsonObj.toString(); 
		}
		
		int userID = Integer.parseInt(jsonData.get("userID"));
		int activityAlarmId = Integer.parseInt(jsonData.get("activityAlarmId"));
		
		ActityAlarmInfo info = new ActityAlarmInfo();
		info.setAlarm_l_userID(userID);
		info.setAlarm_l_activityAlarmId(activityAlarmId);
		
		if(1 == actityAlarmService.setAlarmlike(info)){
			jsonObj.put("result", "success");             	
        } else {
        	jsonObj.put("result", "failed"); 
        }
		
		logger.info("end setActityAlarmLike method.");
		
		return jsonObj.toString(); 
	}

	/**
	 * 征集令增加评论
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "setActityAlarmComment", method = RequestMethod.POST)
	public @ResponseBody String setActityAlarmComment(@RequestBody Map<String, String> jsonData) {
		
		logger.info("enter setActityAlarmComment method."); 
		System.out.println("The jsonData is" + jsonData); 
		
		JSONObject jsonObj = new JSONObject();
		
		if (null == jsonData.get("commentDetail") || null == jsonData.get("userID") || null == jsonData.get("activity_alarmID")) {
			jsonObj.put("result", "paramater null");
			return jsonObj.toString(); 
		}
		
		String commentDetail = jsonData.get("commentDetail");
		int userID = Integer.parseInt(jsonData.get("userID"));
		int activity_alarmID = Integer.parseInt(jsonData.get("activity_alarmID"));
		
		ActityAlarmInfo info = new ActityAlarmInfo();
		info.setCommentDetail(commentDetail);
		info.setAlarm_c_userID(userID);
		info.setAlarm_c_activity_alarmID(activity_alarmID);
		
		if(1 == actityAlarmService.setAlarmcomment(info)){
			jsonObj.put("result", "success");             	
        } else {
        	jsonObj.put("result", "failed"); 
        }
		
		logger.info("end setActityAlarmComment method.");
		
		return jsonObj.toString(); 
	}
}
