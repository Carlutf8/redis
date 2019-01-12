package com.example.demo.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class RedisController {
	
	
	@Resource
	private RedisTemplate<String, String> redisTemplate;

	@RequestMapping(value="/test1",method=RequestMethod.POST)
	public void uploadFileFolder (HttpServletRequest request)
	{
		
	}
}
