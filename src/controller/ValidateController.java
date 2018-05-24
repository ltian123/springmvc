package controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Emp;

@Controller
@RequestMapping("/validate")
public class ValidateController {

	@RequestMapping("/show")
	public String show(Emp emp){
		return "validate";
	}
	
	@RequestMapping("/submit")
	public String submit(@Valid Emp emp,Errors errors){
		if(errors.hasErrors()){
			return "validate";
		}
		System.out.println(emp.getName());
		System.out.println(emp.getPassword());
		System.out.println(emp.getEmail());
		System.out.println(emp.getAge());
		System.out.println(emp.getPhone());
		return "redirect:/validate/show";
	}
	
}
