package com.huaan.shop.dao;

import java.util.List;

import com.huaan.shop.model.BestMemoriesInfo;

public interface BestMemoriesInfoMapper {
    
	// 获取所有精彩回顾
	List<BestMemoriesInfo> selAllBestMemories();
			
	// 获取精彩回顾评论
	List<BestMemoriesInfo> selAllBestMemories_C(int id); 
	
	// 获取精彩回顾点赞
	List<BestMemoriesInfo> selAllBestMemories_L(int id); 	
	
	// 精彩回顾点赞
	int insBestMemories_L(BestMemoriesInfo info);
	
	// 精彩回顾增加评论
	int insBestMemories_C(BestMemoriesInfo info);
	
	// 精彩回顾发帖
	int insBestMemories(BestMemoriesInfo info);
	

}