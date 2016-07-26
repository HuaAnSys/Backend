package com.huaan.shop.dao;

import java.util.List;

import com.huaan.shop.model.BulletinInfo;

public interface BulletinInfoMapper {

	// 获取所有社区公告
	List<BulletinInfo> selBulletins();

	// 获取社区公告评论
	List<BulletinInfo> selbulletin_comments(int bulletinID);

	// 获取社区评论点赞
	List<BulletinInfo> selbulletinLike(int bulletinID);

	// 社区评论点赞
	int insbulletinLike(BulletinInfo bulletinInfo);

	// 增加社区公告评论
	int insbulletinComment(BulletinInfo bulletinInfo);

	// 增加社区公告评论
	int insbulletin(BulletinInfo bulletinInfo);
	
	// 获取改user是否为bulletin点过赞
	List<BulletinInfo> userLikeBOrNot(BulletinInfo bulletinInfo);

}