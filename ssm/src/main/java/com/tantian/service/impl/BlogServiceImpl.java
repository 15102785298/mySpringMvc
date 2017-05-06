package com.tantian.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.fastjson.JSONObject;
import com.tantian.service.IBlogService;
import com.tantian.utils.FileUtils;

@Service("blogService")
public class BlogServiceImpl implements IBlogService {

	private List<Map<String, String>> blog_data;// 缓存中的博客对象数据
	private Map<String,String> blog_detail;
	private Map<String,String> blog_url;

	/**
	 * 在启动时读取文件信息到内存，方便访问
	 *
	 */
	public BlogServiceImpl() {
		FileUtils fileUtils = new FileUtils();
		String filePath = "F:\\myBlog";
		blog_data = fileUtils.getAllFileInfo(filePath);
		blog_detail = fileUtils.getAllFileDetail(filePath);
		blog_url = fileUtils.getAllFileUrl(filePath);
	}

	/**
	 * 获取博客文件信息
	 *
	 * @param index
	 *            :当前数据的最后一行编号+1
	 * @param num
	 *            :想要的数据条数
	 */
	public List<Map<String, String>> getBlogMsg(int index, int num) {
		List<Map<String, String>> resList = new ArrayList<Map<String, String>>();
		int end = index + num;
		if (end > blog_data.size() || index < 0) { // 防止数组越界
			System.out.println("[error in getBlogMsg] end>=this.blog_data.size()");
			return null;
		}
		for (int i = index; i < end; i++) {
			Map<String, String> resMap = blog_data.get(i);
			resList.add(resMap);
		}
		return resList;
	}

	/**
	 * 获取博客文件详细内容
	 *
	 * @param name
	 *            :需要的文件名
	 */
	public String getBlogDetail(String name) {
		return this.blog_detail.get(name);
	}

	/**
	 * 获取博客文件详细内容
	 *
	 * @param name
	 *            :需要的文件名
	 */
	public String getBlogUrl(String name) {
		return this.blog_url.get(name);
	}

}
