package controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String login(String username,String password,Map map,HttpSession session){
		System.out.println(username);
		System.out.println(password);
		
		if("abc".equals(username)&&"123".equals(password)){
			session.setAttribute("user", username);
			return "redirect:/showSuccess";
		}
		map.put("message", "用户名或密码错误");
		return "login";
	}
	
}
