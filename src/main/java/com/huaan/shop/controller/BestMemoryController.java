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
import com.huaan.shop.model.BestMemoriesInfo;
import com.huaan.shop.service.BestMemoriesService;

@Controller
@RequestMapping("/bestMemory")
public class BestMemoryController {

	private static Logger logger = Logger.getLogger(BestMemoryController.class);

	 @Autowired
	 private BestMemoriesService bestMemoriesService;

	/**
	 * 获取所有精彩回顾
	 * @return
	 */
	@RequestMapping("/getAllBestMemory")
	public @ResponseBody Object getAllBestMemory() {
		logger.info("enter getAllBestMemory method."); 
		
		List<BestMemoriesInfo> info = bestMemoriesService.getAllBestMemory();
		
		logger.info("end getAllBestMemory method.");
		
		return info;
	}
	
	/**
	 * 精彩回顾发帖
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "createNewBestMemory", method = RequestMethod.POST)
	public @ResponseBody String createNewBestMemory(@RequestParam(value = "file") MultipartFile file, HttpServletRequest request) {
		
		logger.info("enter createNewBestMemory method."); 
		
		JSONObject jsonObj = new JSONObject();
		
		if (null == request.getParameter("content") || null == request.getParameter("uploaderName")) {
			jsonObj.put("result", "paramater null");
			return jsonObj.toString(); 
		}
		
		// 画像ダウンロード
		FileUpload fileupload = new FileUpload();
		if (!fileupload.uploadPicToNginx(file, "BestMemory")) {
			jsonObj.put("result", "pic null");
			return jsonObj.toString();
		}
		
		// BestMemoryデータ作成
		BestMemoriesInfo bestMemoriesInfo = new BestMemoriesInfo();
		bestMemoriesInfo.setContent(request.getParameter("content"));
		bestMemoriesInfo.setUploaderName(request.getParameter("uploaderName"));
		bestMemoriesInfo.setPicName(fileupload.getFILE_NAME());
		
		if(1 == bestMemoriesService.setNewBestMemory(bestMemoriesInfo)){
			jsonObj.put("result", "success");             	
        } else {
        	jsonObj.put("result", "failed"); 
        }
		
		logger.info("end createNewBestMemory method.");
		
		return jsonObj.toString(); 
	}

	/**
	 * 获取精彩回顾评论
	 * @param bestMemoryID
	 * @return
	 */
	@RequestMapping(value = "getBestMemoryComments/{bestMemoryID}")
	public @ResponseBody Object getBestMemoryComments(@PathVariable int bestMemoryID) {

		logger.info("enter getBestMemoryComments method."); 
		
		List<BestMemoriesInfo> info = bestMemoriesService.getBestMemoryComments(bestMemoryID);
		
		logger.info("end getBestMemoryComments method.");
		
		return info;
	}
	
	/**
	 * 获取精彩回顾点赞
	 * @param bestMemoryID
	 * @return
	 */
	@RequestMapping(value = "getBestMemoryLike/{bestMemoryID}")
	public @ResponseBody Object getBestMemoryLike(@PathVariable int bestMemoryID) {

		logger.info("enter getBestMemoryLike method."); 
		
		List<BestMemoriesInfo> info = bestMemoriesService.getBestMemoryLike(bestMemoryID);
		
		logger.info("end getBestMemoryLike method.");
		
		return info;
	}

	/**
	 * 精彩回顾点赞
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "setBestMemoryLike", method = RequestMethod.POST)
	public @ResponseBody String setBestMemoryLike(@RequestBody Map<String, String> jsonData) {
		
		logger.info("enter setBestMemoryLike method."); 
		System.out.println("The jsonData is" + jsonData); 
		
		JSONObject jsonObj = new JSONObject();
		
		if (null == jsonData.get("userID") || null == jsonData.get("best_memoriesID")) {
			jsonObj.put("result", "paramater null");
			return jsonObj.toString(); 
		}
		
		int userID = Integer.parseInt(jsonData.get("userID"));
		int best_memoriesID = Integer.parseInt(jsonData.get("best_memoriesID"));
		
		BestMemoriesInfo binfo = new BestMemoriesInfo();
		binfo.setBest_memories_l_id(best_memoriesID);
		binfo.setBest_memories_l_userID(userID);
		
		if(1 == bestMemoriesService.setBestMemoryLike(binfo)){
			jsonObj.put("result", "success");             	
        } else {
        	jsonObj.put("result", "failed"); 
        }
		
		logger.info("end setBestMemoryLike method.");
		
		return jsonObj.toString(); 
	}

	/**
	 * 精彩回顾增加评论
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "setBestMemoryComment", method = RequestMethod.POST)
	public @ResponseBody String setBestMemoryComment(@RequestBody Map<String, String> jsonData) {
		
		logger.info("enter setBestMemoryComment method."); 
		System.out.println("The jsonData is" + jsonData); 
		
		JSONObject jsonObj = new JSONObject();
		
		if (null == jsonData.get("commentDetail") || null == jsonData.get("userID") || null == jsonData.get("best_memoriesID")) {
			jsonObj.put("result", "paramater null");
			return jsonObj.toString(); 
		}
		
		String commentDetail = jsonData.get("commentDetail");
		int userID = Integer.parseInt(jsonData.get("userID"));
		int best_memoriesID = Integer.parseInt(jsonData.get("best_memoriesID"));
		
		BestMemoriesInfo binfo = new BestMemoriesInfo();
		binfo.setBest_memories_c_id(best_memoriesID);
		binfo.setBest_memories_c_userID(userID);
		binfo.setCommentDetail(commentDetail);
		
		if(1 == bestMemoriesService.setBestMemoryComment(binfo)){
			jsonObj.put("result", "success");             	
        } else {
        	jsonObj.put("result", "failed"); 
        }
		
		logger.info("end setBestMemoryComment method.");
		
		return jsonObj.toString(); 
	}
}
