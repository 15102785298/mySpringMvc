package com.tantian.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.tantian.service.IBlogService;
import com.tantian.utils.FileUtils;

@Service("blogService")
public class BlogServiceImpl implements IBlogService {
	List<String> name;
	Map<String, String> data;
	FileUtils fileUtils;

	public BlogServiceImpl() {
		fileUtils = new FileUtils();
		String filePath = "F:\\myBlog";
		this.name = fileUtils.getAllFileName(filePath);
		this.data = fileUtils.getAllFile(filePath);
	}

	public List<Map<String, String>> getBlogMsg(int begin, int end) {
		List<Map<String, String>> resList = new ArrayList<Map<String,String>>();

		for (int i = begin; i <= end; i++) {
			Map<String, String> resMap = new HashMap<String, String>();
			resMap.put("blog_date", fileUtils.getCreateTime(name.get(i)));
			try {
				resMap.put("blog_content", fileUtils.readFileBegin(name.get(i)));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			resMap.put("blog_title", fileUtils.getShowName(name.get(i)));
			resList.add(resMap);
		}
		return resList;
	}

	private String getShowName(String fileName) {
		return fileName.substring(fileName.lastIndexOf("\\") + 1, fileName.indexOf("."));
	}
}
