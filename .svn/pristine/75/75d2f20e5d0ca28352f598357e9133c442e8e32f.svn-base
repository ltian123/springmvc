package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.RequestContext;

@Controller
@RequestMapping("/i18n")
public class I18nController {

	@RequestMapping("/f")
	public String f(HttpServletRequest request){
		
		RequestContext requestContext=new RequestContext(request);
		
		String a=requestContext.getMessage("a");
		
		System.out.println(a);
		
		request.setAttribute("a", a);
		
		return "i18n";
	}
	
}
