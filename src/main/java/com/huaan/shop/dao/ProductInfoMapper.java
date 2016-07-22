package com.huaan.shop.dao;

import java.util.List;

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
}