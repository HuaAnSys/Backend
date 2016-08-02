package com.huaan.shop.service;

import java.util.List;

import com.huaan.shop.model.ProductInfo;

/**
 * 
 * @author Tony
 * @version 1.0
 */
public interface ProductService {
	// 获取热门商品
	List<ProductInfo> getHotPros();

	// 获取某个商品
	List<ProductInfo> getProductByID(int productID);

	// 获取商品种类
	List<ProductInfo> getCategory();

	// 根据商品种类获取商品
	List<ProductInfo> getProductByCategoryID(int categoryID);

	// 根据商品种类获取商品
	List<ProductInfo> getProductComments(int productID);

	// 增加商品到购物车
	int addProduct2cart(ProductInfo productInfo);

	// 添加商品评价
	int addProductcomment(ProductInfo productInfo);

	//获取购物车
	List<ProductInfo> getMyShoppingCart(int shoppingcart_userID);
	
	//从购物车删除商品
    int removeShoppingItem(int shoppingItem_id);
}
