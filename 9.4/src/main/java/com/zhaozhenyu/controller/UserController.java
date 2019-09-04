package com.zhaozhenyu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhaozhenyu.service.UserService;

@Controller
public class UserController {

	@Resource
	private UserService us;
	@RequestMapping("list.do")
	public String list(Model model){
		Map map=new HashMap();
		List list=us.list(map);
		model.addAttribute("list",list);
		model.addAttribute("map",map);
		return "list";
	}
}
