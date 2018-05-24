package controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.User;

@Controller
@RequestMapping("/application")
public class ServletContextController {
//	错
//	@RequestMapping("/f1")
//	public String f1(ServletContext application){
//		System.out.println(application);
//		return "application";
//	}
	
//	错
//	@RequestMapping("/f2")
//	public String f2(ServletConfig config){
//		ServletContext application=config.getServletContext();
//		System.out.println(application);
//		return "application";
//	}
	
	@RequestMapping("/f3")
	public String f3(HttpSession session){
		ServletContext application=session.getServletContext();
		System.out.println(application);
		User user=new User();
		user.setUsername("abc");
		application.setAttribute("user", user);
		return "application";
	}
	
}
