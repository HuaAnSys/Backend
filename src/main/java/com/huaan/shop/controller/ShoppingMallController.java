package com.huaan.shop.controller;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.huaan.shop.model.ProductInfo;
import com.huaan.shop.service.ProductService;

/**
 * 
 * @author Tony
 * @version 1.0
 */
@Controller
@RequestMapping("/shoppingmall")
public class ShoppingMallController {

	private static Logger logger = Logger.getLogger(ShoppingMallController.class);

	@Autowired
	private ProductService productSerivce;

    /**
	 * 获取所有热门商品
	 * 
	 * @return
	 */
	@RequestMapping(value = "getHotProducts", method = RequestMethod.GET)
	public @ResponseBody List<ProductInfo> getHotProducts() {

		logger.info("enter into getHotProducts method");

		List<ProductInfo> hotProducts = productSerivce.getHotPros();

		logger.info("end into getHotProducts method");

		return hotProducts;
	}

	@RequestMapping(value = "/getCategory", method = RequestMethod.GET)
	public @ResponseBody List<ProductInfo> getCategory() {
		logger.info("enter into getHotProducts method");

		List<ProductInfo> category = productSerivce.getCategory();

		logger.info("end into getHotProducts method");
		return category;
	}

	/**
	 * 获取某个商品
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "getProduct", method = RequestMethod.POST)
	public @ResponseBody List<ProductInfo> getProductByID(@RequestBody Map<String, String> jsonData) {

		logger.info("enter into getProductByID method");

		int productID = Integer.valueOf(jsonData.get("productID"));

		List<ProductInfo> productInfo = productSerivce.getProductByID(productID);

		logger.info("end into getProductByID method");
		return productInfo;
	}

	/**
	 * 根据商品种类获取商品
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "getProducts", method = RequestMethod.POST)
	public @ResponseBody List<ProductInfo> getProductByCategoryID(@RequestBody Map<String, String> jsonData) {

		logger.info("enter into getcategoryID method");

		int categoryID = Integer.valueOf(jsonData.get("categoryID"));

		List<ProductInfo> category = productSerivce.getProductByCategoryID(categoryID);

		logger.info("end into getcategoryID method");

		return category;
	}

	/**
	 * 根据商品id获取商品详细信息
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "getProductDetail", method = RequestMethod.POST)
	public @ResponseBody List<ProductInfo> getProductDetail(@RequestBody Map<String, String> jsonData) {
		logger.info("enter into getProductDetail method");

		int productID = Integer.valueOf(jsonData.get("productID"));

		List<ProductInfo> productDetail = productSerivce.getProductByID(productID);

		logger.info("end into getProductDetail method");
		return productDetail;
	}

	/**
	 * 根据商品id获取商品评论
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "getProductComments", method = RequestMethod.POST)
	public @ResponseBody List<ProductInfo> getProductComments(@RequestBody Map<String, String> jsonData) {
		logger.info("enter into getProductComments method");

		System.out.println(jsonData.get("productID"));
		int productID = Integer.valueOf(jsonData.get("productID"));

		List<ProductInfo> productComments = productSerivce.getProductComments(productID);
		for(int i=0;i<productComments.size();i++){
			System.out.println(productComments.get(i));
		}
		
		logger.info("end into getProductComments method");
		return productComments;
	}
	
	/**
	 * 从购物车删除商品
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "removeProductFromCart/{shopItemID}", method = RequestMethod.DELETE)
	public @ResponseBody String removeProductFromCart( @PathVariable int shopItemID) {
		logger.info("enter into removeProductFromCart method");
		
		JSONObject jsonObj = new JSONObject();
		if (productSerivce.removeShoppingItem(shopItemID) == 1) {
			jsonObj.put("result", "success");
		} else {
			jsonObj.put("result", "failed");
		}
		logger.info("end into removeProductFromCart method");
		return jsonObj.toString();
	}

	/**
	 * 添加商品到购物车
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "/addProduct2cart", produces = "application/json;charset=UTF-8", method = RequestMethod.POST)
	public @ResponseBody String addProduct2cart(@RequestBody Map<String, String> jsonData) {
		logger.info("enter into getProductComment method");

		ProductInfo productInfo = new ProductInfo();
		productInfo.setShoppingcartId(Integer.valueOf(jsonData.get("id")));
		productInfo.setUserId(Integer.valueOf(jsonData.get("userID")));
		productInfo.setItemId(Integer.valueOf(jsonData.get("itemID")));
		productInfo.setOrdered(jsonData.get("ordered"));

		JSONObject jsonObj = new JSONObject();
		// insert user
		if (productSerivce.addProduct2cart(productInfo) == 1) {
			jsonObj.put("result", "success");
		} else {
			jsonObj.put("result", "failed");
		}

		logger.info("end registerUser method.");
		return jsonObj.toString();
	}
	
	
	/**
	 * 获取购物车内物品
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "getItemsInCart/{userId}", method = RequestMethod.POST)
	public @ResponseBody String getItemsInCart(@RequestBody Map<String, String> jsonData) {
		logger.info("enter into getItemsInCart method");

		int productID = Integer.valueOf(jsonData.get("userId"));
		
		return null;
	}


	/**
	 * 添加商品评价
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "evaluateProduct/{productID}", method = RequestMethod.POST)
	public @ResponseBody String evaluateProduct(@RequestBody Map<String, String> jsonData) {
		logger.info("enter into evaluateProduct method");

		ProductInfo productInfo = new ProductInfo();
		productInfo.setUserId(Integer.valueOf(jsonData.get("userID")));
		productInfo.setProductId(Integer.valueOf(jsonData.get("productID")));
		productInfo.setCommentDetail(jsonData.get("commentDetail"));
		productInfo.setCommentLevel(Integer.valueOf(jsonData.get("commentLevel")));

		JSONObject jsonObj = new JSONObject();
		// insert
		if (productSerivce.addProductcomment(productInfo) == 1) {
			jsonObj.put("result", "success");
		} else {
			jsonObj.put("result", "failed");
		}

		logger.info("end evaluateProduct method.");
		return jsonObj.toString();
	}
}
