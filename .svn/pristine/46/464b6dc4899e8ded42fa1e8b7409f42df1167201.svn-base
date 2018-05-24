package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import entity.User;

@Controller
@RequestMapping("/ajax")
public class AjaxController {
	
	@RequestMapping(value="/getString",produces="text/plain;charset=utf-8")
	public @ResponseBody String getString(String username){
		System.out.println("AjaxController.getString()");
		System.out.println(username);
		if("abc".equals(username)){
		
			return "用户名已存在";
		}
		
		return "用户名可用";
	}
	
	@RequestMapping("/getUser")
	public @ResponseBody User getUser(){
		User user=new User();
		user.setId(1);
		user.setUsername("abc啊");
		user.setPassword("123");
		user.setPhone("12345678");
		user.setAge(32);
		return user;
	}
	
	
	
	
	
	
}
