package controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import entity.User;

@Controller
@RequestMapping("/session")
@SessionAttributes("user")
public class SessionController {

	@RequestMapping("/f1")
	public String f1(HttpSession session){
		User user=new User();
		user.setUsername("aaa");
		session.setAttribute("user", user);
		return "session";
	}
	
	@RequestMapping("/f2")
	public String f2(HttpSession session){
		User user=(User) session.getAttribute("user");
		System.out.println(user.getUsername());
		return "session";
	}
	
	@RequestMapping("/f3")
	public String f3(User user){
		System.out.println(user.getUsername());
		user.setUsername("bbb");
		return "session";
	}
	
	@RequestMapping("/f4")
	public String f4(@ModelAttribute User user){
		System.out.println(user.getUsername());
		return "session";
	}
	
	@RequestMapping("/f5")
	public String f5(@ModelAttribute("u") User user){
		user.setUsername("ccc");
		return "session";
	}
	
	@RequestMapping("/f6")
	public String f6(User user,SessionStatus sessionStatus){
		System.out.println(user.getUsername());
		sessionStatus.setComplete();
		return "session";
	}
	
}
