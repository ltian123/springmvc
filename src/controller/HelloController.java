package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	private String viewName;
	
	public String getViewName() {
		return viewName;
	}

	public void setViewName(String viewName) {
		this.viewName = viewName;
	}


	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("HelloController.handleRequest()");
		String name=request.getParameter("name");
		System.out.println(name);
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("message", "Hello "+name);
//		mav.setViewName("hello");
		mav.setViewName(viewName);
		return mav;
	}

}
