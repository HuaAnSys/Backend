package com.huaan.shop.dao;

import java.util.List;

import com.huaan.shop.model.PropertyManagementInfo;

public interface PropertyManagementInfoMapper {

	List<PropertyManagementInfo> getClaimedRepairs();

	int createNewRepair(PropertyManagementInfo propertyManagementInfo);

	List<PropertyManagementInfo> getCustomers();

	List<PropertyManagementInfo> getComplain();

	int createNewCustomer(PropertyManagementInfo propertyManagementInfo);

	int createNewComplain(PropertyManagementInfo propertyManagementInfo);
}
