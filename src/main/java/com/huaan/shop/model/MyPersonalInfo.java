package com.huaan.shop.model;

public class MyPersonalInfo {
	
	// 房屋信息
	private Integer id;
	private String block_num;
	private String unit_num;
	private String floor_num;
	private String area_num;
	private String buy_time;
	private String live_in_time;
	private String door_num;
	private Integer userID;
	private String phaseNo;
	private String villageName;
		
	public String getPhaseNo() {
		return phaseNo;
	}
	public void setPhaseNo(String phaseNo) {
		this.phaseNo = phaseNo;
	}
	public String getVillageName() {
		return villageName;
	}
	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}
	// 订单表	
	private Integer buyOrder_id;
	private String order_num;
	private Integer cart_id;
	private String order_time;
	private String pay_time;
	private Integer status;
	private Integer buyOrder_userID;
	private String pay_type;
	private String payNum;
	
	// 购物车
	private Integer shoppingcart_id;
	private Integer shoppingcart_userID;
	private Integer shoppingcart_itemID;
	private String shoppingcart_createTime;
	private String shoppingcart_ordered;




	public Integer getShoppingcart_id() {
		return shoppingcart_id;
	}
	public void setShoppingcart_id(Integer shoppingcart_id) {
		this.shoppingcart_id = shoppingcart_id;
	}
	public Integer getShoppingcart_userID() {
		return shoppingcart_userID;
	}
	public void setShoppingcart_userID(Integer shoppingcart_userID) {
		this.shoppingcart_userID = shoppingcart_userID;
	}
	public Integer getShoppingcart_itemID() {
		return shoppingcart_itemID;
	}
	public void setShoppingcart_itemID(Integer shoppingcart_itemID) {
		this.shoppingcart_itemID = shoppingcart_itemID;
	}
	public String getShoppingcart_createTime() {
		return shoppingcart_createTime;
	}
	public void setShoppingcart_createTime(String shoppingcart_createTime) {
		this.shoppingcart_createTime = shoppingcart_createTime;
	}
	public String getShoppingcart_ordered() {
		return shoppingcart_ordered;
	}
	public void setShoppingcart_ordered(String shoppingcart_ordered) {
		this.shoppingcart_ordered = shoppingcart_ordered;
	}
	public Integer getBuyOrder_id() {
		return buyOrder_id;
	}
	public void setBuyOrder_id(Integer buyOrder_id) {
		this.buyOrder_id = buyOrder_id;
	}
	public String getOrder_num() {
		return order_num;
	}
	public void setOrder_num(String order_num) {
		this.order_num = order_num;
	}
	public Integer getCart_id() {
		return cart_id;
	}
	public void setCart_id(Integer cart_id) {
		this.cart_id = cart_id;
	}
	public String getOrder_time() {
		return order_time;
	}
	public void setOrder_time(String order_time) {
		this.order_time = order_time;
	}
	public String getPay_time() {
		return pay_time;
	}
	public void setPay_time(String pay_time) {
		this.pay_time = pay_time;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getBuyOrder_userID() {
		return buyOrder_userID;
	}
	public void setBuyOrder_userID(Integer buyOrder_userID) {
		this.buyOrder_userID = buyOrder_userID;
	}
	public String getPay_type() {
		return pay_type;
	}
	public void setPay_type(String pay_type) {
		this.pay_type = pay_type;
	}
	public String getPayNum() {
		return payNum;
	}
	public void setPayNum(String payNum) {
		this.payNum = payNum;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBlock_num() {
		return block_num;
	}
	public void setBlock_num(String block_num) {
		this.block_num = block_num;
	}
	public String getUnit_num() {
		return unit_num;
	}
	public void setUnit_num(String unit_num) {
		this.unit_num = unit_num;
	}
	public String getFloor_num() {
		return floor_num;
	}
	public void setFloor_num(String floor_num) {
		this.floor_num = floor_num;
	}
	public String getArea_num() {
		return area_num;
	}
	public void setArea_num(String area_num) {
		this.area_num = area_num;
	}
	public String getBuy_time() {
		return buy_time;
	}
	public void setBuy_time(String buy_time) {
		this.buy_time = buy_time;
	}
	public String getLive_in_time() {
		return live_in_time;
	}
	public void setLive_in_time(String live_in_time) {
		this.live_in_time = live_in_time;
	}
	public String getDoor_num() {
		return door_num;
	}
	public void setDoor_num(String door_num) {
		this.door_num = door_num;
	}
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	
}