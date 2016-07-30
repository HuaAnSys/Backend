package com.huaan.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huaan.shop.dao.ActityAlarmInfoMapper;
import com.huaan.shop.model.ActityAlarmInfo;
import com.huaan.shop.service.ActityAlarmService;

/**
 * 
 * @author Tony
 * @version 1.0
 */
@Service("ActityAlarmService")
public class ActityAlarmServiceImpl implements ActityAlarmService {

	@Autowired
	private ActityAlarmInfoMapper actityAlarmInfoMapper;

	// 获取所有征集令
	@Override
	public List<ActityAlarmInfo> getAllActityAlarm() {
		return actityAlarmInfoMapper.selAllActityAlarm();
	}

	// 征集令发帖
	@Override
	public int setActityAlarm(ActityAlarmInfo actityAlarmInfo) {
		return actityAlarmInfoMapper.insActityAlarm(actityAlarmInfo);
	}

	// 获取征集令评论
	@Override
	public List<ActityAlarmInfo> getAlarmcomments(int id) {
		return actityAlarmInfoMapper.selAlarmcomments(id);
	}

	// 获取征集令点赞 
	@Override
	public List<ActityAlarmInfo> getAlarmLike(int id) {
		return actityAlarmInfoMapper.selAlarmLike(id);
	}

	// 征集令点赞
	@Override
	public int setAlarmlike(ActityAlarmInfo actityAlarmInfo) {
		return actityAlarmInfoMapper.insAlarmlike(actityAlarmInfo);
	}

	// 征集令增加评论
	@Override
	public int setAlarmcomment(ActityAlarmInfo actityAlarmInfo) {
		return actityAlarmInfoMapper.insAlarmcomment(actityAlarmInfo);
	}

	@Override
	public List<ActityAlarmInfo> getActivityAlarmLike(ActityAlarmInfo activityAlarm) {
		// TODO Auto-generated method stub
		return actityAlarmInfoMapper.getActivityAlarmLike(activityAlarm);
	}

	@Override
	public int removeActivityLike(ActityAlarmInfo info) {
		// TODO Auto-generated method stub
		return actityAlarmInfoMapper.removeActivityLike(info);
	}

	@Override
	public List<ActityAlarmInfo> getActivityLikeNum(int activityID) {
		// TODO Auto-generated method stub
		return actityAlarmInfoMapper.getActivityLikeNum(activityID);
	}
	
		
}
