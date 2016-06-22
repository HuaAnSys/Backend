package com.huaan.shop.controller;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author Tony
 * @version 1.0
 */
@Controller
@RequestMapping("/shoppingmall")
public class ShoppingMallController {

	private static Logger logger = Logger.getLogger(ShoppingMallController.class);

	// @Autowired
	// private ProductService productSerivce;

	// @Autowired
	// private CategoryService categoryService;

	/**
	 * 获取所有热门商品
	 * 
	 * @return
	 */
	@RequestMapping(value = "getHotProducts", method = RequestMethod.GET)
	public @ResponseBody String getHotProducts() {
		logger.info("enter into getHotProducts method");
		// List<Product> hotProducts = productSerivce.getHotProducts();

		return null;
	}

	/**
	 * 获取所有商品种类
	 * 
	 * @return
	 */
	@RequestMapping(value = "getCategory", method = RequestMethod.GET)
	public @ResponseBody String getCategory() {
		logger.info("enter into getHotProducts method");

		// List<Category> category = categoryService.getCategory();

		return null;
	}

	/**
	 * 根据商品id获取所有商品
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "getProduct/{productID}", method = RequestMethod.POST)
	public @ResponseBody String getProductByID(@RequestBody Map<String, String> jsonData) {
		logger.info("enter into getProductByID method");

		int productID = Integer.valueOf(jsonData.get("productID"));

		// List<Category> category = productSerivce.getProductByID(productID);

		return null;
	}

	/**
	 * 根据商品种类获取所有商品
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "getAllProducts/{categoryID}", method = RequestMethod.POST)
	public @ResponseBody String getAllProducts(@RequestBody Map<String, String> jsonData) {
		logger.info("enter into getcategoryID method");

		int productID = Integer.valueOf(jsonData.get("categoryID"));

		// List<Category> category = productSerivce.getProductByID(productID);

		return null;
	}

	/**
	 * 根据商品id获取商品详细信息
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "getProductDetail/{productID}", method = RequestMethod.POST)
	public @ResponseBody String getProductDetail(@RequestBody Map<String, String> jsonData) {
		logger.info("enter into getProductDetail method");

		int productID = Integer.valueOf(jsonData.get("productID"));

		// List<Category> category = productSerivce.getProductByID(productID);

		return null;
	}

	/**
	 * 根据商品id获取商品评论
	 * 
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "getProductComments/{productID}", method = RequestMethod.POST)
	public @ResponseBody String getProductComments(@RequestBody Map<String, String> jsonData) {
		logger.info("enter into getProductComments method");

		int productID = Integer.valueOf(jsonData.get("productID"));

		// List<Category> category = productSerivce.getProductByID(productID);

		return null;
	}
	
	/**
	 * 添加商品到购物车
	 * @param jsonData
	 * @return
	 */
	@RequestMapping(value = "addProduct2cart/{productID}", method = RequestMethod.POST)
	public @ResponseBody String addProduct2cart(@RequestBody Map<String, String> jsonData) {
		logger.info("enter into getProductComment method");

		int productID = Integer.valueOf(jsonData.get("productID"));


		return null;
	}
}
