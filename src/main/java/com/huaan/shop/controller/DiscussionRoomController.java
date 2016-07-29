package com.huaan.shop.controller;

import java.util.HashMap;
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
import com.huaan.shop.model.DiscussionRoomInfo;
import com.huaan.shop.service.DiscussionRoomService;

/**
 * 
 * @author Tony
 *
 */

@Controller
@RequestMapping("/discussionRoom")
public class DiscussionRoomController {

	private static Logger logger = Logger.getLogger(DiscussionRoomController.class);

	@Autowired
	private DiscussionRoomService service;

	/**
	 * 获取所有议事厅内容
	 */
	@RequestMapping(value = "/getDiscussion", method = RequestMethod.GET)
	public @ResponseBody List<DiscussionRoomInfo> getDiscussion() {
		logger.info("enter the getCommunityAnnouncementInfo method");
		List<DiscussionRoomInfo> communityAnnouncementInfos = service.getCommunityAnnouncement();
		return communityAnnouncementInfos;
	}

	/**
	 * 议事厅发帖
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "createNewDiscussion", method = RequestMethod.POST)
	public @ResponseBody String createNewDiscussion(@RequestParam(value = "file") MultipartFile file, HttpServletRequest request){

        logger.info("enter createNewDiscussion method."); 
		
		JSONObject jsonObj = new JSONObject();
		
		if (null == request.getParameter("content") || null == request.getParameter("userId")) {
			jsonObj.put("result", "paramater null");
			return jsonObj.toString(); 
		}
		
		// 画像ダウンロード
		FileUpload fileupload = new FileUpload();
		if (!fileupload.uploadPicToNginx(file, "Discussion")) {
			jsonObj.put("result", "pic null");
			return jsonObj.toString();
		}
		
		// ActityAlarmデータ作成
		DiscussionRoomInfo info = new DiscussionRoomInfo();
		info.setContent(request.getParameter("content"));
		info.setDiscussionId(Integer.parseInt(request.getParameter("userId")));
		info.setPicName(fileupload.getFILE_NAME());
		
		if(1 == service.setNewDiscussion(info)){
			jsonObj.put("result", "success");             	
        } else {
        	jsonObj.put("result", "failed"); 
        }
		
		logger.info("end createNewDiscussion method.");
		
		return jsonObj.toString(); 
	}

	/**
	 * 获取某一条议事的评论
	 * 
	 * @param communityAnnouncementID
	 * @return
	 */
	@RequestMapping(value = "/getDiscussionComments",method = RequestMethod.POST)
	public @ResponseBody Map getDiscussionComments(@RequestBody Map<String, String> jsonData) {
		logger.info("enter get discussion comments method.");
		int discussionID = Integer.valueOf(jsonData.get("discussionID"));
		int userID = Integer.valueOf(jsonData.get("userID"));
		Map resultMap = new HashMap();
		List<DiscussionRoomInfo> discussionComments = service.getDiscussionComments(discussionID);
		resultMap.put("comments",discussionComments);
		
		DiscussionRoomInfo disRoom  = new DiscussionRoomInfo();
		disRoom.setUserID(userID);
		disRoom.setDiscussionId(discussionID);
		List<DiscussionRoomInfo> discussionLike = service.getDiscussionLike(disRoom);
		if(discussionLike.size()>0){
			resultMap.put("likeOrNot",'Y');
		}else{
			resultMap.put("likeOrNot",'N');
		}
		logger.info("end get collection comments method.");
		resultMap.put("status","success");
		return resultMap;
	}

/*	*//**
	 * 获取某一条议事点赞
	 * 
	 * @param communityAnnouncementID
	 * @return
	 *//*
	@RequestMapping(value = "getDiscussionLike")
	public @ResponseBody List<DiscussionRoomInfo> getDiscussionLike(@RequestBody Map<String, String> jsonData) {

		// get the like from database
		
		int discussionID = Integer.valueOf(jsonData.get("discussionID"));
		
		List<DiscussionRoomInfo> discussionLike = service.getDiscussionLike(discussionID);
		
		return discussionLike;
	}*/

	/**
	 * 点赞给某一条议事
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "setDiscussionLike",method = RequestMethod.POST)
	public @ResponseBody String setDiscussionLike(@RequestBody Map<String, String> jsonData) {
		
		JSONObject jsonObj = new JSONObject();
		DiscussionRoomInfo communityAnnouncementInfo = new DiscussionRoomInfo();
		communityAnnouncementInfo.setLike_userID(Integer.valueOf(jsonData.get("userID")));
		communityAnnouncementInfo.setDiscussionId(Integer.valueOf(jsonData.get("discussionID")));
		String likeFlag = jsonData.get("likeFlag");
		if("Y".equals(likeFlag)){
			System.out.println("remove like"); 
			if(1 == service.removeDiscussionLike(communityAnnouncementInfo)){
				jsonObj.put("result", "success");             	
	        } else {
	        	jsonObj.put("result", "failed"); 
	        }
		}else if("N".equals(likeFlag)){
			System.out.println("insert like"); 
			if(1 == service.setDiscussionLike(communityAnnouncementInfo)){
				jsonObj.put("result", "success");             	
	        } else {
	        	jsonObj.put("result", "failed"); 
	        }
		}
		
        logger.info("end registerUser method."); 
        return jsonObj.toString(); 
	}

	/**
	 * 给某一条议事增加评论
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "setDiscussionComment")
	public @ResponseBody String setDiscussionComment(@RequestBody Map<String, String> jsonData) {
		DiscussionRoomInfo communityAnnouncementInfo = new DiscussionRoomInfo();
		communityAnnouncementInfo.setCommentDetail(jsonData.get("commentDetail"));
		communityAnnouncementInfo.setDiscussionRoomID(Integer.valueOf(jsonData.get("discussion_roomID")));
		communityAnnouncementInfo.setDiscussionCommentsUserId(Integer.valueOf(jsonData.get("userID")));
		JSONObject jsonObj = new JSONObject();
		
        if (service.setDiscussionComment(communityAnnouncementInfo) == 1) {
            jsonObj.put("result", "success");             	
        } else {
        	jsonObj.put("result", "failed"); 
        }
        
        logger.info("end registerUser method."); 
        
        return jsonObj.toString(); 
        
	}
}
