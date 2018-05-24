package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.User;

@Controller
@RequestMapping("/model")
public class ModelAttributeController {
	
	@RequestMapping("/f1")
	public String f1(User user){
		System.out.println("ModelAttributeController.f1()");
		user.setUsername("aaa");
		return "model";
	}
	
	@RequestMapping("/f2")
	public String f2(@ModelAttribute User user){
		System.out.println("ModelAttributeController.f2()");
		user.setUsername("bbb");
		return "model";
	}
	
	@RequestMapping("/f3")
	public String f3(@ModelAttribute("u") User user){
		System.out.println("ModelAttributeController.f3()");
		user.setUsername("ccc");
		return "model";
	}
	
	@ModelAttribute("list")
	public List<String> f4(){
		System.out.println("ModelAttributeController.f4()");
		List<String> list=new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		return list;
	}
	
	
	
	
	
	
	
	

}
