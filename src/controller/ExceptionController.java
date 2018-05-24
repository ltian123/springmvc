package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import exception.SomeException;

@Controller
@RequestMapping("/exception")
public class ExceptionController {
	
	@ExceptionHandler(SomeException.class)
	public ModelAndView exceptionHandler(Exception e){
		System.out.println("ExceptionController.exceptionHandler()");
		return new ModelAndView("exception","e",e);
	}
	

	@RequestMapping("/f")
	public void f() throws Exception{
		System.out.println("ExceptionController.f()");
		throw new SomeException("SomeException...");
//		throw new Exception();
	}
}
