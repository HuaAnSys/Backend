package com.huaan.shop.service;

import java.util.List;

import com.huaan.shop.model.BestMemoriesInfo;

/**
 * 
 * @author Tony
 * @version 1.0
 */
public interface BestMemoriesService {

	    // 获取所有精彩回顾
		List<BestMemoriesInfo> getAllBestMemory();
		
		// 精彩回顾发帖
		int setNewBestMemory(BestMemoriesInfo info);
						
		// 获取精彩回顾评论
		List<BestMemoriesInfo> getBestMemoryComments(int id); 
		
		// 获取精彩评论赞
		List<BestMemoriesInfo> getBestMemoryLike(int id); 	
		
		// 精彩回顾点赞
		int setBestMemoryLike(BestMemoriesInfo info);
		
		// 精彩回顾增加评论
		int setBestMemoryComment(BestMemoriesInfo info);
	
}
