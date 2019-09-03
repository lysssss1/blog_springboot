package com.yusi.spring.boot.blog.controlller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yusi.spring.boot.blog.vo.Menu;

/**
 * 
 * 后台管理控制器
 * @author liuyusi
 *
 */

@Controller
@RequestMapping("/admins")
public class AdminController {
	
	@GetMapping
    public ModelAndView listUsers(Model model) {
        List<Menu> list = new ArrayList<>();
        list.add(new Menu("用户管理", "/users"));
        model.addAttribute("list", list);
        return new ModelAndView("/admins/index", "model", model);
    }
	
}
