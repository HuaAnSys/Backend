package com.huaan.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huaan.shop.dao.HousekeepingInfoMapper;
import com.huaan.shop.model.HousekeepingInfo;
import com.huaan.shop.service.HousekeepingInfoService;

@Service("HousekeepingInfoService")
public class HousekeepingInfoServiceImpl implements HousekeepingInfoService {
	
	@Autowired
	private HousekeepingInfoMapper housekeepingInfoMapper;

	@Override
	public List<HousekeepingInfo> getAllHousekeepingInfo() {

		return housekeepingInfoMapper.selHousekeepingInfo();
		
	}
}
