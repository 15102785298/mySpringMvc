package com.tantian.service;

import java.util.List;
import java.util.Map;

import com.tantian.model.Person;

public interface IBlogService {

	/***
	 * @author tantian ��ȡ���в����ļ���Ϣ
	 */
	public  List<Map<String, String>> getBlogMsg(int begin, int end);
}
