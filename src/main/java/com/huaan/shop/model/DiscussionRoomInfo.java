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
	private Integer discussionCommentsUserId;
	
	//discussion_room_like
	private Integer discussionRoomLikeId;
	private String likeTime;
	private Integer like_userID;
	private Integer discussionId;

	//user表
	private Integer userID;
	private String nickName;
	
	public Integer getDiscussionCommentsUserId() {
		return discussionCommentsUserId;
	}
	
	public void setDiscussionCommentsUserId(Integer discussionCommentsUserId) {
		this.discussionCommentsUserId = discussionCommentsUserId;
	}
	
	public Integer getLike_userID() {
		return like_userID;
	}
	public void setLike_userID(Integer like_userID) {
		this.like_userID = like_userID;
	}
	
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
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


