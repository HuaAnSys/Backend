package com.huaan.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huaan.shop.dao.DiscussionRoomInfoMapper;
import com.huaan.shop.model.DiscussionRoomInfo;
import com.huaan.shop.service.DiscussionRoomService;;

@Service("DiscussionRoomService")
public class DiscussionRoomServiceImpl implements DiscussionRoomService{

	@Autowired
	private DiscussionRoomInfoMapper mapper;
	
	@Override
	public List<DiscussionRoomInfo> getCommunityAnnouncement() {
		return  mapper.getCommunityAnnouncement();
	}

	@Override
	public List<DiscussionRoomInfo> getDiscussionComments(int discussionID) {
		return mapper.getDiscussionComments(discussionID);
	}

	@Override
	public List<DiscussionRoomInfo> getDiscussionLike(DiscussionRoomInfo disInfo) {
		return mapper.getDiscussionLike(disInfo);
	}

	@Override
	public int setDiscussionLike(DiscussionRoomInfo communityAnnouncementInfo) {
		int result = mapper.setDiscussionLike(communityAnnouncementInfo);
		
		return result;
	}

	@Override
	public int setDiscussionComment(DiscussionRoomInfo communityAnnouncementInfo) {
		int result = mapper.setDiscussionComment(communityAnnouncementInfo);
		return result;
	}

	@Override
	public int setNewDiscussion(DiscussionRoomInfo info) {
		return mapper.insNewDiscussion(info);
	}
	
}
