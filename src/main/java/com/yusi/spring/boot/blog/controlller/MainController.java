 package com.yusi.spring.boot.blog.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.yusi.spring.boot.blog.domain.User;
import com.yusi.spring.boot.blog.service.UserService;


/**
 * 
 * 主页控制器
 * @author liuyusi
 *
 */

@Controller
public class MainController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String root() {
		return "redirect:/index";
	}
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/login-error")
	public String loginError(Model model) {
		model.addAttribute("loginError", true);
		model.addAttribute("errorMsg", "登陆失败，用户名或密码错误");
		return "login";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	@PostMapping("/register")
	public String registerUser(User user) {
		userService.registerUser(user);
		return "redirect:/login";
	}
	
}
