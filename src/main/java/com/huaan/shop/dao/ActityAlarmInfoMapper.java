package com.huaan.shop.dao;

import java.util.List;

import com.huaan.shop.model.ActityAlarmInfo;

public interface ActityAlarmInfoMapper {
    
	// 获取所有征集令
	List<ActityAlarmInfo> selAllActityAlarm();
		
	// 征集令发帖
	int insActityAlarm(ActityAlarmInfo actityAlarmInfo);
		
	// 获取征集令评论
	List<ActityAlarmInfo> selAlarmcomments(int id); 
	
	// 获取征集令点赞 
	List<ActityAlarmInfo> selAlarmLike(int id); 	
	
	// 征集令点赞
	int insAlarmlike(ActityAlarmInfo actityAlarmInfo);
	
	// 征集令增加评论
	int insAlarmcomment(ActityAlarmInfo actityAlarmInfo);
	

}