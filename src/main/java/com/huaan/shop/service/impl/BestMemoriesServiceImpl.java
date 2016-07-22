package com.huaan.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huaan.shop.dao.BestMemoriesInfoMapper;
import com.huaan.shop.model.BestMemoriesInfo;
import com.huaan.shop.service.BestMemoriesService;

/**
 * 
 * @author Tony
 * @version 1.0
 */
@Service("BestMemoriesService")
public class BestMemoriesServiceImpl implements BestMemoriesService {

	@Autowired
	private BestMemoriesInfoMapper bestMemoriesInfoMapper;

	// 获取所有精彩回顾
	@Override
	public List<BestMemoriesInfo> getAllBestMemory() {
		return bestMemoriesInfoMapper.selAllBestMemories();
	}

	// 获取精彩回顾评论
	@Override
	public List<BestMemoriesInfo> getBestMemoryComments(int id) {
		return bestMemoriesInfoMapper.selAllBestMemories_C(id);
	}

	// 获取精彩回顾点赞
	@Override
	public List<BestMemoriesInfo> getBestMemoryLike(int id) {
		return bestMemoriesInfoMapper.selAllBestMemories_L(id);
	}

	// 精彩回顾点赞
	@Override
	public int setBestMemoryLike(BestMemoriesInfo info) {
		return bestMemoriesInfoMapper.insBestMemories_L(info);
	}

	// 精彩回顾增加评论
	@Override
	public int setBestMemoryComment(BestMemoriesInfo info) {
		return bestMemoriesInfoMapper.insBestMemories_C(info);
	}

	// 精彩回顾发帖
	@Override
	public int setNewBestMemory(BestMemoriesInfo info) {
		return bestMemoriesInfoMapper.insBestMemories(info);
	}
}
