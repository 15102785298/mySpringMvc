package com.tantian.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
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

	@RequestMapping("/blog.do")
	public String showPersons(ModelMap model) {

		FileUtils fileUtils = new FileUtils();
		String filePath = "F:\\myBlog";

		List<Map<String,String>> res = iblogService.getBlogMsg(0, 1);
		Object obj = JSONObject.toJSON(res);
		model.put("data" , obj);
		return "/blog.jsp";
	}

	@RequestMapping("/videoPlay.do")
	public ModelAndView t(Model model) {

		ModelAndView view = new ModelAndView("/view/pub/videoPlay.html");
		model.addAttribute("introSelf", "I'm Spring, I'm Coming.");
		return view;
	}
}
