package com.tantian.controller;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.tantian.model.Person;
import com.tantian.service.IBlogService;
import com.tantian.service.IPersonService;
import com.tantian.utils.FileUtils;

@Controller
public class BlogAction {

	@Autowired
	private IBlogService iblogService;

	/** ������������ */
	@RequestMapping("/blog.do")
	public String showBlog(ModelMap model) {

		List<Map<String, String>> res = iblogService.getBlogMsg(0, 2); // ��ȡ�ӵ�0����ʼ��2�������ļ����ݡ�
		if (res == null) {
			return "/blog.jsp";
		}
		Object obj = JSONObject.toJSON(res);// �����ؽ��ת��Ϊjson����
		model.put("data", obj);
		return "/blog.jsp";
	}

	/** ����������� */
	@RequestMapping("/detail.do")
	public String showBlogDetail(ModelMap model, @RequestParam String blog_name) {
		String blog_name_in = null;
		try {
			blog_name_in = new String(blog_name.getBytes("ISO-8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		if(!blog_name_in.equals("")){
			model.put("blog_name", blog_name_in);
			model.put("blog_detail", iblogService.getBlogDetail(blog_name_in));
			model.put("blog_url", iblogService.getBlogUrl(blog_name_in));
		}
		return "/detail.jsp";
	}

}
