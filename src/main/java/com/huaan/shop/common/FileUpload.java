package com.huaan.shop.common;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.druid.util.StringUtils;

public class FileUpload {

	private static final Logger log = Logger.getLogger(FileUpload.class);
	private String NGINX_PIC_DIR;
	private String FILE_NAME;

	public String getFILE_NAME() {
		return FILE_NAME;
	}

	public void setFILE_NAME(String fILE_NAME) {
		FILE_NAME = fILE_NAME;
	}

	public Boolean uploadPicToNginx(@RequestParam(value = "file") MultipartFile file, String picName) {

		System.out.println("**********************file upload start*******************");
		
		boolean boolRtn = false;
		
		if (StringUtils.isEmpty(NGINX_PIC_DIR)) {
			NGINX_PIC_DIR = "html/activity-files/";
		}

		log.info("开始, file == null?:{}");
		String path = "C:/YG/Eclipse/eclipse/HAworkspace/Pic/";// request.getSession().getServletContext().getRealPath("upload");
		
		// 保存
		try {
			String fileName = file.getOriginalFilename();
			String newName = getImgName(picName) + ".jpg";
			this.setFILE_NAME(newName);
			File targetFile = new File(path + fileName);
			File newFile = new File(path, newName);

			if (!targetFile.exists()) {
				targetFile.mkdirs();
			}
			
			file.transferTo(targetFile);
			boolRtn = targetFile.renameTo(newFile);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return boolRtn;
	}

	public String getImgName(String type) {
		SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss");
		Date date = new Date();
		String d = dateFormater.format(date);
		return type + d;
	}
}