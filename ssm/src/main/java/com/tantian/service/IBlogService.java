package com.tantian.service;

import java.util.List;
import java.util.Map;

import com.tantian.model.Person;

public interface IBlogService {

	/***
	 * @author tantian 读取所有博客文件信息
	 */
	public  List<Map<String, String>> getBlogMsg(int begin, int end);
}
