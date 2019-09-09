package com.liufuyu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.liufuyu.service.ToService;

@Controller
public class ToHtml {

	@Autowired
	
	private ToService toService;
	
	/**
	 * 
	    * @Title: getlist
	    * @Description: TODO(到列表里接收东西)
	    * @param @param model
	    * @param @return    参数
	    * @return String    返回类型
	    * @throws
	 */
	@GetMapping("list")
	public String getlist(Model model) {
		
		 List list = toService.getlist();
		 model.addAttribute("list", list);
		return "list";
	}
	
	
}
