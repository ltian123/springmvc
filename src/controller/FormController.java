package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import command.FormCommand;

import entity.User;

@Controller
@RequestMapping("/form")
public class FormController {

	@RequestMapping("/show")
	public String show(FormCommand formCommand){
		formCommand.setT("abc");
		formCommand.setP("123");
		formCommand.setH("aaa");
		formCommand.setTa("aaa\nbbb\nccc");
		formCommand.setC(Arrays.asList(new String[]{"1","3"}));
		formCommand.setR("2");
		formCommand.setS("3");
		return "form";
	}
	
	@RequestMapping("/submit")
	public String submit(FormCommand formCommand){
		System.out.println(formCommand.getT());
		System.out.println(formCommand.getP());
		System.out.println(formCommand.getH());
		System.out.println(formCommand.getTa());
		System.out.println(formCommand.getC());
		System.out.println(Arrays.toString(formCommand.getCs()));
		System.out.println(Arrays.toString(formCommand.getUs()));
		System.out.println(formCommand.getR());
		System.out.println(formCommand.getRs());
		System.out.println(formCommand.getUs2());
		System.out.println(formCommand.getS());
		System.out.println(formCommand.getSs());
		System.out.println(formCommand.getSs2());
		System.out.println(formCommand.getUs3());
		return "redirect:/form/show";
	}
	
	@ModelAttribute("map")
	public Map loadMap(){
		Map map=new HashMap();
		map.put("1", "aa");
		map.put("2", "bb");
		map.put("3", "cc");
		return map;
	}
	
	@ModelAttribute("users")
	public List<User> loadUsers(){
		List<User> users=new ArrayList<User>();
		users.add(new User(1,"a",25));
		users.add(new User(2,"b",27));
		users.add(new User(3,"c",22));
		return users;
	}
	
	
	
	
	
	
	
	
	
	
	
}
