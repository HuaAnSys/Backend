package com.huaan.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huaan.shop.dao.PropertyManagementInfoMapper;
import com.huaan.shop.model.PropertyManagementInfo;
import com.huaan.shop.service.PropertyManagementInfoService;

@Service("PropertyManagementInfoService")
public class PropertyManagementInfoServiceImpl implements PropertyManagementInfoService {

	@Autowired
	private PropertyManagementInfoMapper propertyManagementInfoMapper;

	@Override
	public List<PropertyManagementInfo> getClaimedRepairs() {
		// TODO Auto-generated method stub
		return propertyManagementInfoMapper.getClaimedRepairs();
	}

	@Override
	public int createNewRepair(PropertyManagementInfo propertyManagementInfo) {
		// TODO Auto-generated method stub
		int result = propertyManagementInfoMapper.createNewRepair(propertyManagementInfo);
		return result;
	}

	@Override
	public List<PropertyManagementInfo> getCustomers() {
		// TODO Auto-generated method stub
		return propertyManagementInfoMapper.getCustomers();
	}

	@Override
	public List<PropertyManagementInfo> getComplain() {
		// TODO Auto-generated method stub
		return propertyManagementInfoMapper.getComplain();
	}

	@Override
	public int createNewCustomer(PropertyManagementInfo propertyManagementInfo) {
		// TODO Auto-generated method stub
		int result = propertyManagementInfoMapper.createNewCustomer(propertyManagementInfo);
		return result;
	}

	@Override
	public int createNewComplain(PropertyManagementInfo propertyManagementInfo) {
		// TODO Auto-generated method stub
		int result = propertyManagementInfoMapper.createNewComplain(propertyManagementInfo);
		return result;
	}

}
