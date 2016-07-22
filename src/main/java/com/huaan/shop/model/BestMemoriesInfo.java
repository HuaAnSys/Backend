package com.huaan.shop.model;

public class BestMemoriesInfo {
	
	// best_memories
	private Integer best_memories_id;
	private String content;
	private String picName;
	private String uploaderName;
	private String uploadTime;

	// best_memories_comments
	private Integer best_memories_c_id;
	private String commentDetail;
	private String commentTime;
	private Integer best_memories_c_best_memoriesID;
	private Integer best_memories_c_userID;

	// best_memories_like
	private Integer best_memories_l_id;
	private String like_time;
	private Integer best_memories_l_userID;
	private Integer best_memories_l_best_memoriesID;
	
	public Integer getBest_memories_id() {
		return best_memories_id;
	}
	public void setBest_memories_id(Integer best_memories_id) {
		this.best_memories_id = best_memories_id;
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
	public Integer getBest_memories_c_id() {
		return best_memories_c_id;
	}
	public void setBest_memories_c_id(Integer best_memories_c_id) {
		this.best_memories_c_id = best_memories_c_id;
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
	public Integer getBest_memories_c_best_memoriesID() {
		return best_memories_c_best_memoriesID;
	}
	public void setBest_memories_c_best_memoriesID(Integer best_memories_c_best_memoriesID) {
		this.best_memories_c_best_memoriesID = best_memories_c_best_memoriesID;
	}
	public Integer getBest_memories_c_userID() {
		return best_memories_c_userID;
	}
	public void setBest_memories_c_userID(Integer best_memories_c_userID) {
		this.best_memories_c_userID = best_memories_c_userID;
	}
	public Integer getBest_memories_l_id() {
		return best_memories_l_id;
	}
	public void setBest_memories_l_id(Integer best_memories_l_id) {
		this.best_memories_l_id = best_memories_l_id;
	}
	public String getLike_time() {
		return like_time;
	}
	public void setLike_time(String like_time) {
		this.like_time = like_time;
	}
	public Integer getBest_memories_l_userID() {
		return best_memories_l_userID;
	}
	public void setBest_memories_l_userID(Integer best_memories_l_userID) {
		this.best_memories_l_userID = best_memories_l_userID;
	}
	public Integer getBest_memories_l_best_memoriesID() {
		return best_memories_l_best_memoriesID;
	}
	public void setBest_memories_l_best_memoriesID(Integer best_memories_l_best_memoriesID) {
		this.best_memories_l_best_memoriesID = best_memories_l_best_memoriesID;
	}
}