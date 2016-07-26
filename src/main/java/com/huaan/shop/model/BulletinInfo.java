package com.huaan.shop.model;

public class BulletinInfo {

	// 社区公告表
	private Integer bulletin_id;
	private String content;
	private String picName;
	private String uploaderName;
	private String uploadTime;

	// 社区公告评论表
	private Integer bulletin_c_id;
	private String commentDetail;
	private String commentTime;
	private Integer bulletin_c_bulletinID;
	private Integer bulletin_c_userID;

	// 社区点赞表
	private Integer bulletin_l_id;
	private String like_time;
	private Integer bulletin_l_userID;
	private Integer bulletin_l_bulletinID;
	
	//user表
	private Integer userID;
	private String nickName;
	
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
	public Integer getBulletin_id() {
		return bulletin_id;
	}
	public void setBulletin_id(Integer bulletin_id) {
		this.bulletin_id = bulletin_id;
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
	public String getUploaderName() {
		return uploaderName;
	}
	public void setUploaderName(String uploaderName) {
		this.uploaderName = uploaderName;
	}
	public String getUploadTime() {
		return uploadTime;
	}
	public void setUploadTime(String uploadTime) {
		this.uploadTime = uploadTime;
	}
	public Integer getBulletin_c_id() {
		return bulletin_c_id;
	}
	public void setBulletin_c_id(Integer bulletin_c_id) {
		this.bulletin_c_id = bulletin_c_id;
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
	public Integer getBulletin_c_bulletinID() {
		return bulletin_c_bulletinID;
	}
	public void setBulletin_c_bulletinID(Integer bulletin_c_bulletinID) {
		this.bulletin_c_bulletinID = bulletin_c_bulletinID;
	}
	public Integer getBulletin_c_userID() {
		return bulletin_c_userID;
	}
	public void setBulletin_c_userID(Integer bulletin_c_userID) {
		this.bulletin_c_userID = bulletin_c_userID;
	}
	public Integer getBulletin_l_id() {
		return bulletin_l_id;
	}
	public void setBulletin_l_id(Integer bulletin_l_id) {
		this.bulletin_l_id = bulletin_l_id;
	}
	public String getLike_time() {
		return like_time;
	}
	public void setLike_time(String like_time) {
		this.like_time = like_time;
	}
	public Integer getBulletin_l_userID() {
		return bulletin_l_userID;
	}
	public void setBulletin_l_userID(Integer bulletin_l_userID) {
		this.bulletin_l_userID = bulletin_l_userID;
	}
	public Integer getBulletin_l_bulletinID() {
		return bulletin_l_bulletinID;
	}
	public void setBulletin_l_bulletinID(Integer bulletin_l_bulletinID) {
		this.bulletin_l_bulletinID = bulletin_l_bulletinID;
	}

	
	
	
}