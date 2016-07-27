package com.huaan.shop.controller;

import java.util.HashMap;
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
import com.huaan.shop.model.BulletinInfo;
import com.huaan.shop.service.BulletinService;

@Controller
@RequestMapping("/bulletin")
public class BulletinController {
	
	private static Logger logger = Logger.getLogger(BulletinController.class);

	 @Autowired
	 private BulletinService bulletinService;

	/**
	 * 获取所有社区公告
	 * @return
	 */
	@RequestMapping("/getBulletins")
	public @ResponseBody Object getBulletins() {
		
		logger.info("enter getBulletins method."); 
		
		JSONObject jsonObj = new JSONObject();
		
		List<BulletinInfo> bulletins = bulletinService.getBulletins();
		
		jsonObj.put("count", 556);
		jsonObj.put("result", "Y");
		
		logger.info("end getBulletins method.");
		
		return bulletins;
	}

	/**
	 * 获取社区公告评论
	 * @param bulletinID
	 * @return
	 */
	@RequestMapping(value = "getBulletinComments/{bulletinID}/{userID}")
	public @ResponseBody Map getBulletinComments(@PathVariable int bulletinID,@PathVariable int userID) {
		
		logger.info("enter getBulletinComments method."); 
		System.out.println("bulletinID = " + bulletinID); 
		Map resultMap = new HashMap();
		List<BulletinInfo> bulletin_comments = bulletinService.getbulletin_comments(bulletinID);
		resultMap.put("comments",bulletin_comments);
		List<BulletinInfo> bulletinLikes = bulletinService.getbulletinLike(bulletinID);
		resultMap.put("likeNum",bulletinLikes.size());
		
		BulletinInfo bulletinInfo = new BulletinInfo();
		bulletinInfo.setBulletin_l_bulletinID(bulletinID);
		bulletinInfo.setBulletin_l_userID(userID);
		List<BulletinInfo> userLikeBulletinOrNot = bulletinService.getUserLikeBOrNot(bulletinInfo);
		if(userLikeBulletinOrNot.size()>0){
			resultMap.put("likeOrNot",'Y');
		}else{
			resultMap.put("likeOrNot",'N');
		}
		logger.info("end getBulletinLike method.");
		resultMap.put("status","success");
		
		logger.info("end getBulletinComments method.");
		return resultMap;
	}

	/**
	 * 获取社区评论点赞
	 * @param bulletinID
	 * @return
	 */
	@RequestMapping(value = "getBulletinLike/{bulletinID}/{userID}")
	public @ResponseBody Map getBulletinLike(@PathVariable int bulletinID,@PathVariable int userID) { //RTN String to List
		System.out.println("bulletinID = " + bulletinID +"---userID" +userID); 
		logger.info("enter getBulletinLike method."); 
		
		List<BulletinInfo> bulletinLikes = bulletinService.getbulletinLike(bulletinID);
		
		BulletinInfo bulletinInfo = new BulletinInfo();
		bulletinInfo.setBulletin_l_bulletinID(bulletinID);
		bulletinInfo.setBulletin_l_userID(userID);
		List<BulletinInfo> userLikeBulletinOrNot = bulletinService.getUserLikeBOrNot(bulletinInfo);
		System.out.println("like or not " + userLikeBulletinOrNot.size()); 
		Map resultMap = new HashMap();
		resultMap.put("likeNum",bulletinLikes.size());
		if(userLikeBulletinOrNot.size()>0){
			resultMap.put("likeOrNot",'Y');
		}else{
			resultMap.put("likeOrNot",'N');
		}
		logger.info("end getBulletinLike method.");
		resultMap.put("status","success");
		return resultMap;
	}

	/**
	 * 社区评论点赞
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "setBulletinLike", method = RequestMethod.POST)
	public @ResponseBody String setBulletinLike(@RequestBody Map<String, String> jsonData) {
		
		logger.info("enter setBulletinLike method."); 
		System.out.println("The jsonData is" + jsonData); 
		
		JSONObject jsonObj = new JSONObject();
		
		if (null == jsonData.get("userID") || null == jsonData.get("bulletinID")) {
			jsonObj.put("result", "paramater null");
			return jsonObj.toString(); 
		}
		
		int userID = Integer.parseInt(jsonData.get("userID"));
		int bulletinID = Integer.parseInt(jsonData.get("bulletinID"));
		
		BulletinInfo binfo = new BulletinInfo();
		binfo.setBulletin_l_bulletinID(bulletinID);
		binfo.setBulletin_l_userID(userID);
		
		if(1 == bulletinService.setbulletinLike(binfo)){
			jsonObj.put("result", "success");             	
        } else {
        	jsonObj.put("result", "failed"); 
        }
		
		logger.info("end setBulletinLike method.");
		
		return jsonObj.toString(); 
	}

	/**
	 * 增加社区公告评论
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "setBulletinComment", method = RequestMethod.POST)
	public @ResponseBody String setBulletinComment(@RequestBody Map<String, String> jsonData) {

//		test data
//		{
//		    "commentDetail": "社区広告コメント１",
//		    "bulletinID": "1",
//		    "userID": "1"
//		}
		
		logger.info("enter setBulletinComment method."); 
		System.out.println("The jsonData is" + jsonData); 
		
        JSONObject jsonObj = new JSONObject();
		
		if (null == jsonData.get("commentDetail") || null == jsonData.get("bulletinID") || null == jsonData.get("userID")) {
			jsonObj.put("result", "paramater null");
			return jsonObj.toString(); 
		}
		
		String commentDetail = jsonData.get("commentDetail");
		int bulletinID = Integer.parseInt(jsonData.get("bulletinID"));
		int userID = Integer.parseInt(jsonData.get("userID"));
		
		BulletinInfo binfo = new BulletinInfo();
		binfo.setCommentDetail(commentDetail);
		binfo.setBulletin_c_bulletinID(bulletinID);
		binfo.setBulletin_c_userID(userID);
		
		if(1 == bulletinService.setbulletinComment(binfo)){
			jsonObj.put("result", "success");             	
        } else {
        	jsonObj.put("result", "failed"); 
        }
		
		logger.info("end setBulletinComment method.");

		return jsonObj.toString(); 
	}
	
	/**
	 * 增加社区公告评论
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "setBulletin", method = RequestMethod.POST)
	public @ResponseBody String setBulletin(@RequestParam(value = "file") MultipartFile file, HttpServletRequest request) {
		
		logger.info("enter setBulletin method."); 
		
        JSONObject jsonObj = new JSONObject();
		
		if (null == request.getParameter("content") || null == request.getParameter("uploaderName")) {
			jsonObj.put("result", "paramater null");
			return jsonObj.toString(); 
		}
		
		// 画像ダウンロード
		FileUpload fileupload = new FileUpload();
		if (!fileupload.uploadPicToNginx(file, "Bulletin")) {
			jsonObj.put("result", "pic null");
			return jsonObj.toString();
		}
		
		// Bulletinデータ作成
		BulletinInfo binfo = new BulletinInfo();
		binfo.setContent(request.getParameter("content"));
		binfo.setUploaderName(request.getParameter("uploaderName"));
		binfo.setPicName(fileupload.getFILE_NAME());
		
		if(1 == bulletinService.setbulletin(binfo)){
			jsonObj.put("result", "success");             	
        } else {
        	jsonObj.put("result", "failed"); 
        }
		
		logger.info("end setBulletin method.");

		return jsonObj.toString(); 
	}

}
