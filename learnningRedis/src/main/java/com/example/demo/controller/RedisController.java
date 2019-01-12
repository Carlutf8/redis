package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.TestCacheService;


@RestController
@RequestMapping("/test")
public class RedisController {
	
	@Autowired
	private TestCacheService testCacheService;
	
	@RequestMapping(value="/test1",method=RequestMethod.GET)
	public User testCache (String name)
	{
		return testCacheService.testCache(name);
	}
}
