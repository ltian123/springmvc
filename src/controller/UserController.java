package controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	//参数User其实是一个Command对象
	//类似struts1中的ActionForm
	//存储数据的对象
	//将实体对象当做Command对象使用
	
	@RequestMapping("/show")
	public String show(User user){
		System.out.println("UserController.show()");
		System.out.println(user);
		user.setUsername("abc");
		user.setPassword("123");
		user.setPhone("12345678");
		user.setAge(23);
		return "user";
	}
	
//	@RequestMapping("/submit")
//	public String submit(User user){
//		System.out.println("UserController.submit()");
//		System.out.println(user.getUsername());
//		System.out.println(user.getPassword());
//		System.out.println(user.getPhone());
//		System.out.println(user.getAge());
//		return "redirect:/user/show";
//	}
	
	
//	@RequestMapping("/submit")
//	public String submit(User user,Errors errors){
//		System.out.println("UserController.submit()");
//		System.out.println(errors.hasErrors());
//		if(errors.hasErrors()){
//			return "user";
//		}
//		System.out.println(user.getUsername());
//		System.out.println(user.getPassword());
//		System.out.println(user.getPhone());
//		System.out.println(user.getAge());
//		return "redirect:/user/show";
//	}
	
	@RequestMapping("/submit")
	public String submit(User user,BindingResult bindingResult){
		System.out.println("UserController.submit()");
		System.out.println(bindingResult.hasErrors());
		if(bindingResult.hasErrors()){
			return "user";
		}
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getPhone());
		System.out.println(user.getAge());
		return "redirect:/user/show";
	}
}
