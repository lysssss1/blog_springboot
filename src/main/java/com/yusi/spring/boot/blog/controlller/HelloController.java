package com.yusi.spring.boot.blog.controlller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello 控制器.
 * 
 * @since 1.0.0 2017年4月19日
 * @author liuyusi
 */
@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String hello() {
		return "Hello world!";
	}
}
