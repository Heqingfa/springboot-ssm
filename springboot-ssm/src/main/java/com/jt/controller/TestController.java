package com.jt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jt.pojo.JDBCServiceC;

@RestController
@RequestMapping("/")
public class TestController {

	@Autowired
	private JDBCServiceC jdbcServiceC;
	//3.测试自定义配置文件
		@RequestMapping("testJDBCC")
	
		public String testJDBCC() {
			
			return "dasdjsagdjasjd";
		}
}
