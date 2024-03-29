package com.jt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jt.mapper.UserMapper;
import com.jt.pojo.User;

public class UserServiceImpl implements UserService {
	//spring容器管理对象  Spring创建代理对象
	@Autowired  
	private UserMapper userMapper;
	
	@Override
	public List<User> findAll() {
		
		return userMapper.findAll();
	}
}
