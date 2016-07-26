package com.huaan.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huaan.shop.dao.BulletinInfoMapper;
import com.huaan.shop.dao.ProductInfoMapper;
import com.huaan.shop.model.BulletinInfo;
import com.huaan.shop.service.BulletinService;

/**
 * 
 * @author Tony
 * @version 1.0
 */
@Service("BulletinService")
public class BulletinServiceImpl implements BulletinService {

	@Autowired
	private BulletinInfoMapper bulletinInfoMapper;
	
	// 获取所有社区公告
	@Override
	public List<BulletinInfo> getBulletins() {
		return bulletinInfoMapper.selBulletins();
	}

	// 获取社区公告评论
	@Override
	public List<BulletinInfo> getbulletin_comments(int bulletinID) {
		return bulletinInfoMapper.selbulletin_comments(bulletinID);
	}
	
	// 获取社区评论点赞
	@Override
	public List<BulletinInfo> getbulletinLike(int bulletinID) {
		return bulletinInfoMapper.selbulletinLike(bulletinID);
	}
	
	// 社区评论点赞
	@Override
	public int setbulletinLike(BulletinInfo bulletinInfo) {
		return bulletinInfoMapper.insbulletinLike(bulletinInfo);
	}
	
	// 增加社区公告评论
	@Override
	public int setbulletinComment(BulletinInfo bulletinInfo) {
		return bulletinInfoMapper.insbulletinComment(bulletinInfo);
	}

	// 增加社区公告
	@Override
	public int setbulletin(BulletinInfo bulletinInfo) {
		return bulletinInfoMapper.insbulletin(bulletinInfo);
	}

	@Override
	public List<BulletinInfo> getUserLikeBOrNot(BulletinInfo bulletinInfo) {
		// TODO Auto-generated method stub
		return bulletinInfoMapper.userLikeBOrNot(bulletinInfo);
	}	
	}
