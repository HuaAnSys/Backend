package com.huaan.shop.dao;

import java.util.List;

import com.huaan.shop.model.MyPersonalInfo;
import com.huaan.shop.model.ProductInfo;

public interface ProductInfoMapper {

	// 获取热门商品
	List<ProductInfo> SelectHotProducts();

	// 获取某个商品
	List<ProductInfo> getProduct(int productID);

	// 获取商品种类
	List<ProductInfo> getCategory();

	// 根据商品种类获取商品
	List<ProductInfo> getProducts(int categoryID);

	// 根据商品ID获取商品评论信息
	List<ProductInfo> getProductComments(int productID);

	// 增加商品到购物车
	int addProduct2cart(ProductInfo productInfo);

	// 添加商品评价
	int insProductcomment(ProductInfo productInfo);
	
	//购物车
	List<ProductInfo> selMyShoppingCart(int shoppingcart_userID);
	
	//待付款订单
	List<ProductInfo> selbuyOrderInfo(int shoppingcart_userID);
	
	//获取待付款订单ID
	List<ProductInfo> getbuyOrderID(int shoppingcart_userID);
	
	//根据orderID获取待付款订单
	List<ProductInfo> getbuyOrderInfoByID(int order_id);
	
	//我的订单
	List<ProductInfo> getbuyOrderInfo(int shoppingcart_userID);
	
	//从购物车删除商品
	int removeShoppingItem(int shoppingItem_id);
	
	//取消我的待付款订单
	int cancelMyPendingOrder(int userID, int orderID);
}