package com.huaan.shop.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author Tony
 *
 */

@Controller
@RequestMapping("/discussionRoom")
public class DiscussionRoomController {

	// @Autowired
	// private CommunityAnnouncementService communityAnnounceService;

	/**
	 * 获取所有议事厅内容
	 */
	@RequestMapping("/getDiscussion")
	public @ResponseBody String getDiscussion() {
		// List<CommunityAnnouncement> cas =
		// communityAnnounceService.getCommunityAnnouncement();
		return null;
	}

	/**
	 * 议事厅发帖
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "createNewDiscussion", method = RequestMethod.POST)
	public @ResponseBody String createNewDiscussion(@RequestBody Map<String, String> jsonData) {
		// String phoneNo = jsonData.get("phoneNo");

		return null;
	}

	/**
	 * 获取某一条议事的评论
	 * 
	 * @param communityAnnouncementID
	 * @return
	 */
	@RequestMapping(value = "getDiscussionComments/{discussionID}")
	public @ResponseBody String getgetDiscussionComments(@PathVariable int communityAnnouncementID) {

		// get the comments from database

		return null;
	}

	/**
	 * 获取某一条议事点赞
	 * 
	 * @param communityAnnouncementID
	 * @return
	 */
	@RequestMapping(value = "getDiscussionLike/{discussionID}")
	public @ResponseBody String getDiscussionLike(@PathVariable int communityAnnouncementID) {

		// get the like from database

		return null;
	}

	/**
	 * 点赞给某一条议事
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "setDiscussionLike", method = RequestMethod.POST)
	public @ResponseBody String setDiscussionLike(@RequestBody Map<String, String> jsonData) {
		String phoneNo = jsonData.get("phoneNo");

		return null;
	}

	/**
	 * 给某一条议事增加评论
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "setDiscussionComment", method = RequestMethod.POST)
	public @ResponseBody String setDiscussionComment(@RequestBody Map<String, String> jsonData) {
		String phoneNo = jsonData.get("phoneNo");
		String comment = jsonData.get("comment");

		return null;
	}
}
