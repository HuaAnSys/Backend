package com.huaan.shop.model;

public class ProductInfo {

	//category
	private String productCategoryName;

	//product
	private Integer productId;
	private Integer productCategoryId;
	private String picName;
	private String hotProduct;
	private String advisedProduct;
	private String status;
	private Integer quantity;
	private String uploadTime;
	private String productName;
	private String price;
	private String kinds;
	
	//shoppingItem
	private Integer shoppingItem_id;
	private Integer shoopingItem_order_id; 
	private Integer shoopingItem_product_id; 
	private Integer shoppingItem_cart_id; 
	private String shoppingItem_add_time; 
	private Integer shoppingIten_num; 
	private Integer shoppingItem_status;
	private String shoppingItem_productKind;

	public String getShoppingItem_productKind() {
		return shoppingItem_productKind;
	}

	public void setShoppingItem_productKind(String shoppingItem_productKind) {
		this.shoppingItem_productKind = shoppingItem_productKind;
	}

	public Integer getShoppingItem_id() {
		return shoppingItem_id;
	}

	public void setShoppingItem_id(Integer shoppingItem_id) {
		this.shoppingItem_id = shoppingItem_id;
	}

	public Integer getShoopingItem_order_id() {
		return shoopingItem_order_id;
	}

	public void setShoopingItem_order_id(Integer shoopingItem_order_id) {
		this.shoopingItem_order_id = shoopingItem_order_id;
	}

	public Integer getShoopingItem_product_id() {
		return shoopingItem_product_id;
	}

	public void setShoopingItem_product_id(Integer shoopingItem_product_id) {
		this.shoopingItem_product_id = shoopingItem_product_id;
	}

	public Integer getShoppingItem_cart_id() {
		return shoppingItem_cart_id;
	}

	public void setShoppingItem_cart_id(Integer shoppingItem_cart_id) {
		this.shoppingItem_cart_id = shoppingItem_cart_id;
	}

	public String getShoppingItem_add_time() {
		return shoppingItem_add_time;
	}

	public void setShoppingItem_add_time(String shoppingItem_add_time) {
		this.shoppingItem_add_time = shoppingItem_add_time;
	}

	public Integer getShoppingIten_num() {
		return shoppingIten_num;
	}

	public void setShoppingIten_num(Integer shoppingIten_num) {
		this.shoppingIten_num = shoppingIten_num;
	}

	public Integer getShoppingItem_status() {
		return shoppingItem_status;
	}

	public void setShoppingItem_status(Integer shoppingItem_status) {
		this.shoppingItem_status = shoppingItem_status;
	}

	public String getKinds() {
		return kinds;
	}

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	//productcomment
	private Integer productcommentId;
	private Integer userId;
	private String commentDetail;
	private Integer commentLevel;
	private String commentTime;

	//shoppingcart
	private Integer shoppingcartId;
	private Integer itemId;
	private String createTime;
	private String ordered;
	
	public int getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(int productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public String getProductCategoryName() {
		return productCategoryName;
	}

	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getPicName() {
		return picName;
	}

	public void setPicName(String picName) {
		this.picName = picName;
	}

	public String getHotProduct() {
		return hotProduct;
	}

	public void setHotProduct(String hotProduct) {
		this.hotProduct = hotProduct;
	}

	public String getAdvisedProduct() {
		return advisedProduct;
	}

	public void setAdvisedProduct(String advisedProduct) {
		this.advisedProduct = advisedProduct;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getUploadTime() {
		return uploadTime;
	}

	public void setUploadTime(String uploadTime) {
		this.uploadTime = uploadTime;
	}

	public Integer getProductcommentId() {
		return productcommentId;
	}

	public void setProductcommentId(Integer productcommentId) {
		this.productcommentId = productcommentId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getCommentDetail() {
		return commentDetail;
	}

	public void setCommentDetail(String commentDetail) {
		this.commentDetail = commentDetail;
	}

	public Integer getCommentLevel() {
		return commentLevel;
	}

	public void setCommentLevel(Integer commentLevel) {
		this.commentLevel = commentLevel;
	}

	public String getCommentTime() {
		return commentTime;
	}

	public void setCommentTime(String commentTime) {
		this.commentTime = commentTime;
	}

	public Integer getShoppingcartId() {
		return shoppingcartId;
	}

	public void setShoppingcartId(Integer shoppingcartId) {
		this.shoppingcartId = shoppingcartId;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getOrdered() {
		return ordered;
	}

	public void setOrdered(String ordered) {
		this.ordered = ordered;
	}

	public void setProductCategoryId(Integer productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

}