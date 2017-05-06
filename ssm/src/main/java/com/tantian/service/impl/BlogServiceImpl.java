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

	private List<Map<String, String>> blog_data;// �����еĲ��Ͷ�������
	private Map<String,String> blog_detail;
	private Map<String,String> blog_url;

	/**
	 * ������ʱ��ȡ�ļ���Ϣ���ڴ棬�������
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
	 * ��ȡ�����ļ���Ϣ
	 *
	 * @param index
	 *            :��ǰ���ݵ����һ�б��+1
	 * @param num
	 *            :��Ҫ����������
	 */
	public List<Map<String, String>> getBlogMsg(int index, int num) {
		List<Map<String, String>> resList = new ArrayList<Map<String, String>>();
		int end = index + num;
		if (end > blog_data.size() || index < 0) { // ��ֹ����Խ��
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
	 * ��ȡ�����ļ���ϸ����
	 *
	 * @param name
	 *            :��Ҫ���ļ���
	 */
	public String getBlogDetail(String name) {
		return this.blog_detail.get(name);
	}

	/**
	 * ��ȡ�����ļ���ϸ����
	 *
	 * @param name
	 *            :��Ҫ���ļ���
	 */
	public String getBlogUrl(String name) {
		return this.blog_url.get(name);
	}

}
