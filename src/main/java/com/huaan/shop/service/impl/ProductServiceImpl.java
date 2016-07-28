package com.huaan.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huaan.shop.dao.ProductInfoMapper;
import com.huaan.shop.model.ProductInfo;
import com.huaan.shop.service.ProductService;

/**
 * 
 * @author Tony
 * @version 1.0
 */
@Service("ProductService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductInfoMapper productInfoMapper;

	// 获取热门商品
	@Override
	public List<ProductInfo> getHotPros() {
		return productInfoMapper.SelectHotProducts();
	}

	// 获取某个商品
	@Override
	public List<ProductInfo> getProductByID(int productID) {
		return productInfoMapper.getProduct(productID);
	}

	// 获取商品种类
	@Override
	public List<ProductInfo> getCategory() {
		return productInfoMapper.getCategory();
	}

	// 根据商品种类获取商品
	@Override
	public List<ProductInfo> getProductByCategoryID(int categoryID) {
		return productInfoMapper.getProducts(categoryID);
	}

	// 根据商品id获取商品评论
	@Override
	public List<ProductInfo> getProductComments(int productID) {
		return productInfoMapper.getProductComments(productID);
	}

	@Override
	public int addProduct2cart(ProductInfo productInfo) {
		int result = productInfoMapper.addProduct2cart(productInfo);
		return result;
	}

	// 添加商品评价
	@Override
	public int addProductcomment(ProductInfo productInfo) {
		int result = productInfoMapper.insProductcomment(productInfo);
		return result;
	}
	
	// 获取我的购物车
	@Override
	public List<ProductInfo> getMyShoppingCart(int shoppingcart_userID) {
		return productInfoMapper.selMyShoppingCart(shoppingcart_userID);
	}	
}
