package com.huaan.shop.service;

import java.util.List;

import com.huaan.shop.model.BulletinInfo;

/**
 * 
 * @author Tony
 * @version 1.0
 */
public interface BulletinService {

	// 获取所有社区公告
	List<BulletinInfo> getBulletins();
	
	// 获取社区公告评论
	List<BulletinInfo> getbulletin_comments(int bulletinID);
    
    // 获取社区评论点赞
	List<BulletinInfo> getbulletinLike(int bulletinID);
	
	// 社区评论点赞
    int setbulletinLike(BulletinInfo bulletinInfo);
		
 // 增加社区公告评论
 	int setbulletinComment(BulletinInfo bulletinInfo);	
 	
 // 增加社区公告评论
 	int setbulletin(BulletinInfo bulletinInfo);

	List<BulletinInfo> getUserLikeBOrNot(BulletinInfo bulletinInfo);	
    
    
	
}
