package com.yusi.spring.boot.blog.controlller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 * Blog控制器
 * @author liuyusi
 *
 */

@Controller
@RequestMapping("/blogs")
public class BlogController {
	@GetMapping
	public String listBlogs(@RequestParam(value="order", required=false, defaultValue="new") String order,
				@RequestParam(value="keyword", required=false, defaultValue="") String keyword){
					System.out.print("order" + order + ";keyword:" + keyword);
					return "redirect:/index?order="+order+"&keyword="+keyword;
	}
}
