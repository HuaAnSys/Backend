package com.huaan.shop.service;

import java.util.List;

import com.huaan.shop.model.ActityAlarmInfo;

/**
 * 
 * @author Tony
 * @version 1.0
 */
public interface ActityAlarmService {

	    // 获取所有征集令
		List<ActityAlarmInfo> getAllActityAlarm();
			
		// 征集令发帖
		int setActityAlarm(ActityAlarmInfo actityAlarmInfo);
			
		// 获取征集令评论
		List<ActityAlarmInfo> getAlarmcomments(int id); 
		
		// 获取征集令点赞 
		List<ActityAlarmInfo> getAlarmLike(int id); 	
		
		// 征集令点赞
		int setAlarmlike(ActityAlarmInfo actityAlarmInfo);
		
		// 征集令增加评论
		int setAlarmcomment(ActityAlarmInfo actityAlarmInfo);
	
}
