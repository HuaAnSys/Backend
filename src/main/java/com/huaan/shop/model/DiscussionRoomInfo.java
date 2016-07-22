package com.huaan.shop.model;

public class DiscussionRoomInfo {
	//discussion_room
	private Integer discussionRoomId;
	private String content;
	private String picName;
	private Integer userId;
	private String createTime;	
	
	//discussion_room_comments
	private Integer discussionRoomCommentsId;
	private String commentDetail;
	private String commentTime;
	private Integer discussionRoomID;
	
	//discussion_room_like
	private Integer discussionRoomLikeId;
	private String likeTime;
	private Integer discussionId;
	
	public Integer getDiscussionRoomId() {
		return discussionRoomId;
	}
	public void setDiscussionRoomId(Integer discussionRoomId) {
		this.discussionRoomId = discussionRoomId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPicName() {
		return picName;
	}
	public void setPicName(String picName) {
		this.picName = picName;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public Integer getDiscussionRoomCommentsId() {
		return discussionRoomCommentsId;
	}
	public void setDiscussionRoomCommentsId(Integer discussionRoomCommentsId) {
		this.discussionRoomCommentsId = discussionRoomCommentsId;
	}
	public String getCommentDetail() {
		return commentDetail;
	}
	public void setCommentDetail(String commentDetail) {
		this.commentDetail = commentDetail;
	}
	public String getCommentTime() {
		return commentTime;
	}
	public void setCommentTime(String commentTime) {
		this.commentTime = commentTime;
	}
	public Integer getDiscussionRoomID() {
		return discussionRoomID;
	}
	public void setDiscussionRoomID(Integer discussionRoomID) {
		this.discussionRoomID = discussionRoomID;
	}
	public Integer getDiscussionRoomLikeId() {
		return discussionRoomLikeId;
	}
	public void setDiscussionRoomLikeId(Integer discussionRoomLikeId) {
		this.discussionRoomLikeId = discussionRoomLikeId;
	}
	public String getLikeTime() {
		return likeTime;
	}
	public void setLikeTime(String likeTime) {
		this.likeTime = likeTime;
	}
	public Integer getDiscussionId() {
		return discussionId;
	}
	public void setDiscussionId(Integer discussionId) {
		this.discussionId = discussionId;
	}

	
}


