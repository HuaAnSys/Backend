package com.huaan.shop.service;

import java.util.List;

import com.huaan.shop.model.DiscussionRoomInfo;

public interface DiscussionRoomService {

	// 获取所有议事内容
	List<DiscussionRoomInfo> getCommunityAnnouncement();

	// 创建新的议事
	int setNewDiscussion(DiscussionRoomInfo info);

	// 获取某一条议事的评论
	List<DiscussionRoomInfo> getDiscussionComments(int discussionID);

	// 获取某一条议事点赞
	List<DiscussionRoomInfo> getDiscussionLike(DiscussionRoomInfo disInfo);

	// 某一条议事点赞
	int setDiscussionLike(DiscussionRoomInfo info);

	// 某一条议事增加评论
	int setDiscussionComment(DiscussionRoomInfo info);

	int removeDiscussionLike(DiscussionRoomInfo communityAnnouncementInfo);

	List<DiscussionRoomInfo> getDiscussionLikeNum(int discussionID);

}
