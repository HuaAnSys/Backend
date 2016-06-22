package com.huaan.shop.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/actityAlarm")
public class ActityAlarmController {

	// @Autowired
	// private CommunityAnnouncementService communityAnnounceService;

	/**
	 * 获取所有征集令
	 * @return
	 */
	@RequestMapping("/getAllActityAlarm")
	public @ResponseBody String getAllActityAlarm() {
		// List<CommunityAnnouncement> cas =
		// communityAnnounceService.getCommunityAnnouncement();
		return null;
	}

	/**
	 * 征集令发帖
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "createNewActityAlarm", method = RequestMethod.POST)
	public @ResponseBody String createNewActityAlarm(@RequestBody Map<String, String> jsonData) {
		// String phoneNo = jsonData.get("phoneNo");

		return null;
	}

	/**
	 * 获取征集令评论
	 * @param actityAlarmID
	 * @return
	 */
	@RequestMapping(value = "getActityAlarmComments/{actityAlarmID}")
	public @ResponseBody String getActityAlarmComments(@PathVariable int actityAlarmID) {

		// get the comments from database

		return null;
	}

	/**
	 * 获取征集令点赞
	 * @param actityAlarmID
	 * @return
	 */
	@RequestMapping(value = "getActityAlarmLike/{actityAlarmID}")
	public @ResponseBody String getActityAlarmLike(@PathVariable int actityAlarmID) {

		// get the like from database

		return null;
	}

	@RequestMapping(value = "setActityAlarmLike", method = RequestMethod.POST)
	public @ResponseBody String setActityAlarmLike(@RequestBody Map<String, String> jsonData) {
		// String phoneNo = jsonData.get("phoneNo");

		return null;
	}

	@RequestMapping(value = "setActityAlarmComment", method = RequestMethod.POST)
	public @ResponseBody String setActityAlarmComment(@RequestBody Map<String, String> jsonData) {
		// String phoneNo = jsonData.get("phoneNo");
		// String comment = jsonData.get("comment");

		return null;
	}
}
