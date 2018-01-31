package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.dao.EmaillistDao;
import com.javaex.vo.EmailVo;

@Controller // 이거 지우고 테스트해보기
public class EmaillistController {
	
	@Autowired
	private EmaillistDao emaillistDao;

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String form() {
		System.out.println("form");

		return "/form";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(@ModelAttribute EmailVo emailVo) {
		System.out.println(emailVo.toString());
	
		emaillistDao.insert(emailVo);
		
		return "/form";
	}
}
