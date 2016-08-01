package com.huaan.shop.model;

public class ActityAlarmInfo {
	
	// username
	private String name;	
	
	// activity_alarm
	private Integer alarm_id;
	private String content;
	private String picName;
	private Integer alarm_userId;
	private String createTime;
	//方便我发表的内容接口返回list，但是需要表示哪个表中的id
	private String postedType;
	

	// activity_alarm_comments
	private Integer alarm_c_id;
	private String commentDetail;
	private String commentTime;
	private Integer alarm_c_activity_alarmId;
	private Integer alarm_c_userID;

	public String getPostedType() {
		return postedType;
	}
	public void setPostedType(String postedType) {
		this.postedType = postedType;
	}
	public Integer getAlarm_c_activity_alarmId() {
		return alarm_c_activity_alarmId;
	}
	public void setAlarm_c_activity_alarmId(Integer alarm_c_activity_alarmId) {
		this.alarm_c_activity_alarmId = alarm_c_activity_alarmId;
	}
	// activity_alarm_like
	private Integer alarm_l_id;
	private String like_time;
	private Integer alarm_l_userID;
	private Integer alarm_l_activityAlarmId;
	
	public Integer getAlarm_id() {
		return alarm_id;
	}
	public void setAlarm_id(Integer alarm_id) {
		this.alarm_id = alarm_id;
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
	public Integer getAlarm_userId() {
		return alarm_userId;
	}
	public void setAlarm_userId(Integer alarm_userId) {
		this.alarm_userId = alarm_userId;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public Integer getAlarm_c_id() {
		return alarm_c_id;
	}
	public void setAlarm_c_id(Integer alarm_c_id) {
		this.alarm_c_id = alarm_c_id;
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
	public Integer getAlarm_c_activity_alarmID() {
		return alarm_c_activity_alarmId;
	}
	public void setAlarm_c_activity_alarmID(Integer alarm_c_activity_alarmId) {
		this.alarm_c_activity_alarmId = alarm_c_activity_alarmId;
	}
	public Integer getAlarm_c_userID() {
		return alarm_c_userID;
	}
	public void setAlarm_c_userID(Integer alarm_c_userID) {
		this.alarm_c_userID = alarm_c_userID;
	}
	public Integer getAlarm_l_id() {
		return alarm_l_id;
	}
	public void setAlarm_l_id(Integer alarm_l_id) {
		this.alarm_l_id = alarm_l_id;
	}
	public String getLike_time() {
		return like_time;
	}
	public void setLike_time(String like_time) {
		this.like_time = like_time;
	}
	public Integer getAlarm_l_userID() {
		return alarm_l_userID;
	}
	public void setAlarm_l_userID(Integer alarm_l_userID) {
		this.alarm_l_userID = alarm_l_userID;
	}
	public Integer getAlarm_l_activityAlarmId() {
		return alarm_l_activityAlarmId;
	}
	public void setAlarm_l_activityAlarmId(Integer alarm_l_activityAlarmId) {
		this.alarm_l_activityAlarmId = alarm_l_activityAlarmId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}