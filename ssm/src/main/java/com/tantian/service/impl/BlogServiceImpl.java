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

	public static List<Map<String, String>> blog_data;
	public BlogServiceImpl() {
		FileUtils fileUtils = new FileUtils();
		String filePath = "F:\\myBlog";
		this.blog_data = fileUtils.getAllFileInfo(filePath);
	}

	public List<Map<String, String>> getBlogMsg(int begin, int end) {
		List<Map<String, String>> resList = new ArrayList<Map<String,String>>();
		for (int i = begin; i <= end; i++) {
			Map<String, String> resMap = blog_data.get(i);
			resList.add(resMap);
		}
		return resList;
	}

}
