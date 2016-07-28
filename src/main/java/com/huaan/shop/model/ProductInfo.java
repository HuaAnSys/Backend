package com.huaan.shop.model;

public class ProductInfo {

	//category
	private String productCategoryName;
	private Integer category_id;

	//product
	private Integer productId;
	private Integer productCategoryId;
	private String picName;
	
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
	private Integer shoppingItem_num; 
	private Integer shoppingItem_status;
	private String shoppingItem_productKind;
	
	//shoppingCart
	// 购物车
	private Integer shoppingcart_id;
	private Integer shoppingcart_userID;
	private Integer shoppingcart_itemID;
	private String shoppingcart_createTime;
	private String shoppingcart_ordered;
	
	public Integer getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}


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

	public Integer getShoppingItem_num() {
		return shoppingItem_num;
	}

	public void setShoppingItem_num(Integer shoppingItem_num) {
		this.shoppingItem_num = shoppingItem_num;
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