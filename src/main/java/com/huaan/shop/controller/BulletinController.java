package com.huaan.shop.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/bulletin")
public class BulletinController {

	// @Autowired
	// private CommunityAnnouncementService communityAnnounceService;

	/**
	 * 获取所有社区公告
	 * @return
	 */
	@RequestMapping("/getBulletins")
	public @ResponseBody String getBulletins() {
		// List<CommunityAnnouncement> cas =
		// communityAnnounceService.getCommunityAnnouncement();
		return null;
	}

	/**
	 * 获取社区公告评论
	 * @param bulletinID
	 * @return
	 */
	@RequestMapping(value = "getBulletinComments/{bulletinID}")
	public @ResponseBody String getBulletinComments(@PathVariable int bulletinID) {

		// get the comments from database

		return null;
	}

	/**
	 * 获取社区评论点赞
	 * @param bulletinID
	 * @return
	 */
	@RequestMapping(value = "getBulletinLike/{bulletinID}")
	public @ResponseBody String getBulletinLike(@PathVariable int bulletinID) {

		// get the like from database

		return null;
	}

	/**
	 * 社区评论点赞
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "setBulletinLike", method = RequestMethod.POST)
	public @ResponseBody String setBulletinLike(@RequestBody Map<String, String> jsonData) {

		// BulletinLike bulletinLike = new BulletinLike();
		// bulletinLike.setLikeTime(System.currentTimeMillis());

		String phoneNo = jsonData.get("phoneNo");

		// get the user id according to user phone number and save it to
		// bulletinLike.setUserID(phoneNo);

		return null;
	}

	/**
	 * 增加社区公告评论
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "setBulletinComment", method = RequestMethod.POST)
	public @ResponseBody String setBulletinComment(@RequestBody Map<String, String> jsonData) {

		// BulletinLike bulletinLike = new BulletinLike();
		// bulletinLike.setLikeTime(System.currentTimeMillis());

		String phoneNo = jsonData.get("phoneNo");
		String comment = jsonData.get("comment");

		// get the user id according to user phone number and save it to
		// bulletinLike.setUserID(phoneNo);

		return null;
	}

}
