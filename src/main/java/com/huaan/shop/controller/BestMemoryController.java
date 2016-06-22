package com.huaan.shop.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/bestMemory")
public class BestMemoryController {

	// @Autowired
	// private CommunityAnnouncementService communityAnnounceService;

	/**
	 * 获取所有精彩回顾
	 * @return
	 */
	@RequestMapping("/getAllBestMemory")
	public @ResponseBody String getAllBestMemory() {
		// List<CommunityAnnouncement> cas =
		// communityAnnounceService.getCommunityAnnouncement();
		return null;
	}

	/**
	 * 获取精彩回顾评论
	 * @param bestMemoryID
	 * @return
	 */
	@RequestMapping(value = "getBestMemoryComments/{bestMemoryID}")
	public @ResponseBody String getBestMemoryComments(@PathVariable int bestMemoryID) {

		// get the comments from database

		return null;
	}
	
	/**
	 * 获取精彩回顾点赞
	 * @param bestMemoryID
	 * @return
	 */
	@RequestMapping(value = "getBestMemoryLike/{bestMemoryID}")
	public @ResponseBody String getBestMemoryLike(@PathVariable int bestMemoryID) {

		// get the like from database

		return null;
	}

	/**
	 * 精彩回顾点赞
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "setBestMemoryLike", method = RequestMethod.POST)
	public @ResponseBody String setBestMemoryLike(@RequestBody Map<String, String> jsonData) {
		// String phoneNo = jsonData.get("phoneNo");

		return null;
	}

	/**
	 * 精彩回顾增加评论
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "setBestMemoryComment", method = RequestMethod.POST)
	public @ResponseBody String setBestMemoryComment(@RequestBody Map<String, String> jsonData) {
		// String phoneNo = jsonData.get("phoneNo");
		// String comment = jsonData.get("comment");

		return null;
	}
}
