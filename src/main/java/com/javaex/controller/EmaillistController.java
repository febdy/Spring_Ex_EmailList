package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.vo.EmailVo;

@Controller // 이거 지우고 테스트해보기
public class EmaillistController {

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String form() {
		System.out.println("form");

		return "/form";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(@ModelAttribute EmailVo emailVo) {
		System.out.println(emailVo.toString());
	
		return "/form";
	}
}
