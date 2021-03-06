package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloAnnotationController {
	
	@RequestMapping(value="/sayHello")
	public ModelAndView sayHello(HttpServletRequest request){
		System.out.println("HelloAnnotationController.sayHello()");
		String name=request.getParameter("name");
//		int i=1/0;
		return new ModelAndView("hello", "message", "Hello "+name);
	}
}
