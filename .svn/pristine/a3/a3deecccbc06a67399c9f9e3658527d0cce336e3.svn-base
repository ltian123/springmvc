package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/interceptor")
public class InterceptorController {

	@RequestMapping("/add")
	public void add(){
		System.out.println("InterceptorController.add()");
	}
	
	@RequestMapping("/remove")
	public void remove(){
		System.out.println("InterceptorController.remove()");
	}
	
	@RequestMapping("/modify")
	public void modify(String name){
		System.out.println("InterceptorController.modify()");
	}
	
	@RequestMapping("/find")
	public void find(){
		System.out.println("InterceptorController.find()");
	}
	
}
