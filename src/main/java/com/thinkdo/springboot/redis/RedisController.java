package com.thinkdo.springboot.redis;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisController {
	@Autowired(required = false)
	protected HttpServletRequest request;

	@Autowired(required = false)
	protected HttpServletResponse response;

	@Autowired
	private RedisService redisService;

	@RequestMapping("/set")
	public String redisSet(@RequestParam("key") String key, @RequestParam("value") String value) {
		boolean result = redisService.set(key, value);
		return result ? "success" : "fail";
	}

	@RequestMapping("/get")
	public String redisGet(@RequestParam("key") String key) {
		String value = redisService.get(key);
		return value;
	}

}
