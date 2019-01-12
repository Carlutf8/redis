package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.TestCacheService;

@Component
public class TestCacheServiceImpl  implements TestCacheService
{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	@Cacheable(value = "user")
	public User testCache(String name) 
	{
		User user = userMapper.selectByName(name);
		return user;
	}
	
}
