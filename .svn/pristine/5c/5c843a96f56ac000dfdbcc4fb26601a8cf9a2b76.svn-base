package controller;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/param")
public class ParamController {

	@RequestMapping("/f1")
	public void f1(HttpServletRequest request,HttpServletResponse response) throws Exception{
		System.out.println("ParamController.f1()");
		System.out.println(request);
		System.out.println(response);
		
		System.out.println(request.getRemoteAddr());
		
		PrintWriter out=response.getWriter();
		
		out.print("<h1>Hello</h1>");
		
		out.flush();
		
		
	}
	
	@RequestMapping("/f2")
	public void f2(InputStream in){
		System.out.println("ParamController.f2()");
		System.out.println(in);
	}
	
	@RequestMapping("/f3")
	public void f3(OutputStream out){
		System.out.println("ParamController.f3()");
		System.out.println(out);
	}
	
	@RequestMapping("/f4")
	public void f4(Reader in){
		System.out.println("ParamController.f4()");
		System.out.println(in);
	}
	
	@RequestMapping("/f5")
	public void f5(Writer out){
		System.out.println("ParamController.f5()");
		System.out.println(out);
	}
	
	@RequestMapping("/f6")
	public void f6(PrintWriter out){
		System.out.println("ParamController.f6()");
		System.out.println(out);
		out.print("<h1>Hello</h1>");
		out.flush();
	}
	
	@RequestMapping("/f7")
	public void f7(WebRequest webRequest,NativeWebRequest nativeWebRequest){
		System.out.println("ParamController.f7()");
		System.out.println(webRequest.getParameter("name"));
		webRequest.setAttribute("attrName","attrObject1",WebRequest.SCOPE_REQUEST);
		webRequest.setAttribute("attrName","attrObject2",WebRequest.SCOPE_SESSION);
		webRequest.setAttribute("attrName","attrObject3",WebRequest.SCOPE_GLOBAL_SESSION);
		
		System.out.println(webRequest.getAttribute("attrName", WebRequest.SCOPE_REQUEST));
		System.out.println(webRequest.getAttribute("attrName", WebRequest.SCOPE_SESSION));
		System.out.println(webRequest.getAttribute("attrName", WebRequest.SCOPE_GLOBAL_SESSION));
		
		
		HttpServletRequest request=nativeWebRequest.getNativeRequest(HttpServletRequest.class);
		HttpServletResponse response=nativeWebRequest.getNativeResponse(HttpServletResponse.class);
		
		System.out.println(request);
		System.out.println(response);
	}
	
	@RequestMapping("/f8")
	public void f8(HttpSession session){
		System.out.println("ParamController.f8()");
		System.out.println(session);
	}
	
	@RequestMapping("/f9")
	public String f9(Model model,ModelMap modelMap,Map map){
		System.out.println("ParamController.f9()");
		System.out.println(map.getClass());
		model.addAttribute("model", "model Hello");
		map.put("map", "map Hello");
//		modelMap.addAttribute("modelMap", "modelMap Hello");
		modelMap.put("modelMap", "modelMap Hello");
		return "model";
	}
	
	@RequestMapping("/f10")
	public String f10(){
		System.out.println("ParamController.f10()");
		return "redirect:/showModel?name=abc";
	}
	
	@RequestMapping("/f11")
	public String f11(Map map){
		System.out.println("ParamController.f11()");
		map.put("name", "aaa");
		return "redirect:/showModel";
	}
	
	@RequestMapping("/f12")
	public String f12(RedirectAttributes redirectAttributes){
		System.out.println("ParamController.f12()");
//		redirectAttributes.addAttribute("name", "bbb");
		redirectAttributes.addFlashAttribute("name", "ccc");
		return "redirect:/showModel";
//		return "redirect:/param/f11";
	}
	
	@RequestMapping("/f13")
	public void f13(String name){
		System.out.println("ParamController.f13()");
		System.out.println(name);
	}
	
	@RequestMapping("/f14")
	public void f14(@RequestParam String name){
		System.out.println("ParamController.f14()");
		System.out.println(name);
	}
	
	@RequestMapping("/f15")
	public void f15(@RequestParam("name") String username){
		System.out.println("ParamController.f15()");
		System.out.println(username);
	}
	
	@RequestMapping("/f16/{name}")
	public void f16(@PathVariable("name") String name){
		System.out.println("ParamController.f16()");
		System.out.println(name);
	}
	
	@RequestMapping("/f17")
	public void f17(@CookieValue("JSESSIONID") String sessionId){
		System.out.println("ParamController.f17()");
		System.out.println(sessionId);
	}
	
	@RequestMapping("/f18")
	public void f18(@RequestHeader("User-Agent") String userAgent){
		System.out.println("ParamController.f18()");
		System.out.println(userAgent);
	}
	
	@RequestMapping("/f19")
	public void f19(@RequestBody String body){
		System.out.println("ParamController.f19()");
		System.out.println(body);
	}
	
	@RequestMapping("/f20")
	public void f20(@Value("abc") String str){
		System.out.println("ParamController.f20()");
		System.out.println(str);
	}
	
	@RequestMapping("/f21")
//	public void f21(@Value("#{systemProperties['java.vm.version']}") String jvmVersion){
	public void f21(@Value("#{paramController.f()}") String result){
		System.out.println("ParamController.f21()");
//		System.out.println(jvmVersion);
		System.out.println(result);
	}
	
	public String f(){
		return "aaa";
	}
	
}
