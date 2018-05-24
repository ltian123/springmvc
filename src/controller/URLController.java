package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/url")
public class URLController {

//	@RequestMapping("/url/f1")
	@RequestMapping("/f1")
	public void f1(){
		System.out.println("URLController.f1()");
	}
	
	@RequestMapping("/f2/*")
	public void f2(){
		System.out.println("URLController.f2()");
	}
	
	@RequestMapping("/f3/**")
	public void f3(){
		System.out.println("URLController.f3()");
	}
	
	@RequestMapping("/f4/?")
	public void f4(){
		System.out.println("URLController.f4()");
	}
	
	@RequestMapping("/f5/{id}")
	public void f5(@PathVariable("id") String id){
		System.out.println("URLController.f5() "+id);
	}
	
	@RequestMapping("/f6/{id}/{name}")
	public void f6(@PathVariable("id")   String id,
				   @PathVariable("name") String name){
		System.out.println("URLController.f6() "+id+" "+name);
	}
	
	@RequestMapping("/f7/{id:\\d+}")
	public void f7(@PathVariable("id") String id){
		System.out.println("URLController.f7() "+id);
	}
	
	@RequestMapping(value={"/f8","/test8"})
	public void f8(){
		System.out.println("URLController.f8()");
	}
	
	@RequestMapping(value="/f9",method=RequestMethod.POST)
	public void f9(){
		System.out.println("URLController.f9()");
	}
	
	@RequestMapping(value="/f9",method=RequestMethod.GET)
	public void fn9(){
		System.out.println("URLController.fn9()");
	}
	
	@RequestMapping(value="/f10",params="name")
	public void f10(){
		System.out.println("URLController.f10()");
	}
	
	@RequestMapping(value="/f11",params="name=abc")
	public void f11(){
		System.out.println("URLController.f11()");
	}
	
	@RequestMapping(value="/f12",params="name!=abc")
	public void f12(){
		System.out.println("URLController.f12()");
	}
	
	
	
	
	
	
	
}
