package com.huaan.shop.dao;

import java.util.List;

import com.huaan.shop.model.DiscussionRoomInfo;


public interface DiscussionRoomInfoMapper {

	List<DiscussionRoomInfo> getCommunityAnnouncement();
	
	List<DiscussionRoomInfo> getDiscussionComments(int discussionID);
	
	List<DiscussionRoomInfo> getDiscussionLike(DiscussionRoomInfo discussionRoomInfo);

	int setDiscussionLike(DiscussionRoomInfo communityAnnouncementInfo);

	int setDiscussionComment(DiscussionRoomInfo communityAnnouncementInfo);
	
	int insNewDiscussion(DiscussionRoomInfo info);

	int removeDiscussionLike(DiscussionRoomInfo communityAnnouncementInfo);
	
}
